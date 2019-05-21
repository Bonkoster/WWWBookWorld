package com.lukashman.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@GetMapping("/list/{bookId}")
	public List<Comment> getBookComments ( @PathVariable( required = true ) final long bookId)
	{
		return commentRepository.findAllByBookId(bookId);
	}
	
	@GetMapping("/{commentId}")
	public Comment getComment ( @PathVariable( required = true ) final long commentId)
	{
		return commentRepository.getOne(commentId);
	}
	
	@PostMapping("/{comment}")
	public Comment addComment ( @PathVariable( required = true ) final Comment comment)
	{
		return commentRepository.saveAndFlush(comment);
	}
	
	@DeleteMapping("/{comment}")
	public void deleteComment ( @PathVariable( required = true ) final Comment comment)
	{
		commentRepository.delete(comment);
	}
}
