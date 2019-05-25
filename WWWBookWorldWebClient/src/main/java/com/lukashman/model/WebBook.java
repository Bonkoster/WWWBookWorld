package com.lukashman.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("id")
public class WebBook {
		
	private String title;
	
	private String description;
	
	private String author;
	
	private int chapterCount;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getChapterCount() {
		return chapterCount;
	}

	public void setChapterCount(int chapterCount) {
		this.chapterCount = chapterCount;
	}
}
