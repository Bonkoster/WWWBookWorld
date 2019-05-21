package com.lukashman.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class WebBookChapter {

	@Getter
	@Setter
	private Long originId;
	
	@Getter
	@Setter
	private String title;
	
	@Getter
	@Setter
	private Integer chapterNumber;
	
	@Getter
	@Setter
	private String chapterText;
}
