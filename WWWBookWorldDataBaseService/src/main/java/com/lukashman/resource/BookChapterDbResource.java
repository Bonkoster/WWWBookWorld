package com.lukashman.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@GetMapping ("/list/{originId}")
	public List<BookChapter> getBookChapters ( @PathVariable ( required = true ) final long originId ) {
		return bookChapterRepository.findAllByOriginId(originId);
	}
	
	@GetMapping ("/{bookChapterId}")
	public BookChapter getBookChapter ( @PathVariable ( required = true ) final long bookChapterId ) {
		return bookChapterRepository.getOne(bookChapterId);
	}
	
	@PostMapping ("/{bookChapter}")
	public BookChapter addBookChapter ( @PathVariable ( required = true ) final BookChapter bookChapter ) {
		return bookChapterRepository.saveAndFlush(bookChapter);
	}
	
	@DeleteMapping ("/{bookChapter}")
	public void deleteBookChapter ( @PathVariable ( required = true ) final BookChapter bookChapter ) {
		bookChapterRepository.delete(bookChapter);
	}
	
	@DeleteMapping ("/list/{originId}")
	public void deleteBookChapter ( @PathVariable ( required = true ) final long originId ) {
		bookChapterRepository.deleteByOriginId(originId);
	}
}
