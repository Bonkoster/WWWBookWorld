package com.lukashman.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class WebComment {

	@Getter
	@Setter
	private long bookId;
	
	@Getter
	@Setter
	private String author;
	
	@Getter
	@Setter
	private Date postDate;
	
	@Getter
	@Setter
	private String text;
}
