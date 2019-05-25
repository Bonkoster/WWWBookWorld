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

import com.lukashman.model.Comment;
import com.lukashman.repository.CommentRepository;

@RestController
@RequestMapping("/rest/comment")
public class CommentDbResource {

	private CommentRepository commentRepository;
	
	public CommentDbResource(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	@GetMapping( path = "/list/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<Comment>> getBookComments ( @PathVariable( required = true ) final long bookId)
	{
		return ResponseEntity.ok(commentRepository.findAllByBookId(bookId));
	}
	
	@GetMapping( path = "/{commentId}", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Comment> getComment ( @PathVariable( required = true ) final long commentId)
	{
		return ResponseEntity.ok(commentRepository.getOne(commentId));
	}
	
	@PostMapping( path = "/{comment}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Comment> addComment ( @PathVariable( required = true ) @RequestBody final Comment comment)
	{
		return ResponseEntity.ok(commentRepository.saveAndFlush(comment));
	}
	
	@DeleteMapping( path = "/{comment}", consumes = MediaType.APPLICATION_JSON_VALUE )
	public void deleteComment ( @PathVariable( required = true ) @RequestBody final Comment comment)
	{
		commentRepository.delete(comment);
	}
}
