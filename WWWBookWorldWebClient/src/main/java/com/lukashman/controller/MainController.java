package com.lukashman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping( value = "/" )
public class MainController {

	private final static String APP_TITLE = "Book World | ";
	
	@GetMapping( value = "/")
	public ModelAndView homePage() {
		final ModelAndView md = new ModelAndView("home");
		final String title = APP_TITLE + "Home Page";
		final String helloMessage = "Hello World!";
		md.addObject("title", title );
		md.addObject("helloMessage", helloMessage);
		return md;
	}
}
