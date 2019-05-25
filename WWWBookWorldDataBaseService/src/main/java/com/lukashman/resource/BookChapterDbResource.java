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

import com.lukashman.model.BookChapter;
import com.lukashman.repository.BookChapterRepository;

@RestController
@RequestMapping("/rest/bookChapter")
public class BookChapterDbResource {
	
	private BookChapterRepository bookChapterRepository;
	
	public BookChapterDbResource(BookChapterRepository bookChapterRepository) {
		this.bookChapterRepository = bookChapterRepository;
	}

	@GetMapping ( path = "/list/{originId}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<BookChapter>> getBookChapters ( @PathVariable ( required = true ) final long originId ) {
		return ResponseEntity.ok(bookChapterRepository.findByOriginId(originId));
	}
	
	@GetMapping ( path = "/{bookChapterId}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<BookChapter> getBookChapter ( @PathVariable ( required = true ) final long bookChapterId ) {
		return ResponseEntity.ok(bookChapterRepository.getOne(bookChapterId));
	}
	
	@PostMapping ( path = "/{bookChapter}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<BookChapter> addBookChapter ( @PathVariable ( required = true ) @RequestBody final BookChapter bookChapter ) {
		return ResponseEntity.ok(bookChapterRepository.saveAndFlush(bookChapter));
	}
	
	@DeleteMapping ( path = "/{bookChapter}", consumes = MediaType.APPLICATION_JSON_VALUE )
	public void deleteBookChapter ( @PathVariable ( required = true ) @RequestBody final BookChapter bookChapter ) {
		bookChapterRepository.delete(bookChapter);
	}
	
	@DeleteMapping ( path = "/list/{originId}" )
	public void deleteBookChapterByOriginId ( @PathVariable ( required = true ) final long originId ) {
		bookChapterRepository.deleteByOriginId(originId);
	}
}
