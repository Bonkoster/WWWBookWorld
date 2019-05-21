package com.lukashman.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class WebBook {
		
	@Getter
	@Setter
	private String title;
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private String author;
	
	@Getter
	@Setter
	private int chapterCount;

}
