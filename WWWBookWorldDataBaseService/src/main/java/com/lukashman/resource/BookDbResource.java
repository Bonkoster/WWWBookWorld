package com.lukashman.resource;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukashman.model.Book;
import com.lukashman.repository.BookRepository;

@RestController
@RequestMapping("/rest/book")
public class BookDbResource {

	private BookRepository bookRepository;
	
	public BookDbResource(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@GetMapping ( path = "/list", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<Book>> getBooks( )
	{
		return ResponseEntity.ok(bookRepository.findAll());
	}
	
	@GetMapping ( path = "/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Book> getBook( @PathVariable( required = true ) final long bookId )
	{
		return ResponseEntity.ok(bookRepository.getOne(bookId));
	}
	
	@PostMapping( path = "/{book}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Book> addBook( @PathVariable( required = true ) final Book book ) {
		return ResponseEntity.ok(bookRepository.saveAndFlush(book));
	}
	
	@DeleteMapping( path = "/{book}", consumes = MediaType.APPLICATION_JSON_VALUE )
	public void deleteBook( @PathVariable( required = true ) @RequestBody final Book book ) {
		bookRepository.delete(book);
	}
}
