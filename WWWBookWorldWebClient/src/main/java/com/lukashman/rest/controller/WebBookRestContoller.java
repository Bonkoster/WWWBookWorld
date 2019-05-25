package com.lukashman.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lukashman.model.WebBook;

@RestController
public class WebBookRestContoller {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private String dataBaseURL;
	
	@GetMapping("/{bookId}")
	public WebBook getbook ( @PathVariable( required = true ) final long bookId)
	{
		return restTemplate.getForObject(dataBaseURL + "/rest/book/" + bookId , WebBook.class);
	}
}
