package com.lukashman.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lukashman.model.WebComment;

@RestController
@RequestMapping("/rest/comments")
public class WebCommentRestContoller {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private String dataBaseURL;
	
	@GetMapping("/{commentId}")
	public WebComment getComment ( @PathVariable( required = true ) final long commentId)
	{
		return restTemplate.getForObject(dataBaseURL + "/rest/comment/" + commentId , WebComment.class);
	}
	
}
