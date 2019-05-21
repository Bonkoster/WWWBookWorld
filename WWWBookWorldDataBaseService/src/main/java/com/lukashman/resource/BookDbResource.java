package com.lukashman.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukashman.model.Book;
import com.lukashman.repository.BookRepository;

@RestController
@RequestMapping(value  = "/rest/book")
public class BookDbResource {

	private BookRepository bookRepository;
	
	public BookDbResource(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@GetMapping ("/list")
	public List<Book> getBooks( )
	{
		return bookRepository.findAll();
	}
	
	@GetMapping ("/{bookId}")
	public Book getBook( @PathVariable( required = true ) final long bookId )
	{
		return bookRepository.getOne(bookId);
	}
	
	@PostMapping("/{book}")
	public Book addBook( @PathVariable( required = true ) final Book book ) {
		return bookRepository.saveAndFlush(book);
	}
	
	@DeleteMapping("/{book}")
	public void deleteBook( @PathVariable( required = true ) final Book book ) {
		bookRepository.delete(book);
	}
}
