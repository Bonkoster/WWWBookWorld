package com.lukashman.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lukashman.model.WebUser;

@RestController
public class WebUserRestContoller {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private String dataBaseURL;
	
	@GetMapping("/{userId}")
	public WebUser getComment ( @PathVariable( required = true ) final long userId)
	{
		return restTemplate.getForObject(dataBaseURL + "/rest/user/" + userId , WebUser.class);
	}
}
