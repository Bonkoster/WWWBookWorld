package com.lukashman.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebCommentRestContoller {

	@Autowired
	private RestTemplate restTemplate;
}
