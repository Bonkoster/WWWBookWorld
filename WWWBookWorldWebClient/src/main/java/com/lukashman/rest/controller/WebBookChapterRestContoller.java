package com.lukashman.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lukashman.model.WebBookChapter;

@RestController
@RequestMapping("/rest/bookChapter")
public class WebBookChapterRestContoller {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private String dataBaseURL;
	
	@GetMapping("/{bookChapterId}")
	public WebBookChapter getBookChapter ( @PathVariable( required = true ) final long bookChapterId)
	{
		return restTemplate.getForObject(dataBaseURL + "/rest/bookChapter/" + bookChapterId , WebBookChapter.class);
	}
	
}
