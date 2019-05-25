package com.lukashman.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("id")
public class WebComment {

	private long bookId;
	
	private String author;
	
	private Date postDate;
	
	private String text;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
