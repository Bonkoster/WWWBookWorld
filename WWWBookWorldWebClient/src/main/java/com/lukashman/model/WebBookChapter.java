package com.lukashman.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("id")
public class WebBookChapter {

	private long originId;
	
	private String title;
	
	private int chapterNumber;
	
	private String chapterText;

	public long getOriginId() {
		return originId;
	}

	public void setOriginId(long originId) {
		this.originId = originId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(int chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	public String getChapterText() {
		return chapterText;
	}

	public void setChapterText(String chapterText) {
		this.chapterText = chapterText;
	}
	
	
}
