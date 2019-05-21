package com.lukashman.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name="comment_table" )
@Proxy(lazy = false)
public class Comment {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "comment_id" )
	private long id;
	
	@Column( name = "comment_book_id" )
	private long bookId;
	
	@Column( name = "comment_author" )
	private String author;
	
	@Column( name = "comment_date" )
	private Date postDate;
	
	@Column( name = "comment_text" )
	private String text;

	public Comment() {
	}

	public Comment(long bookId, String author, Date postDate, String text) {
		this.bookId = bookId;
		this.author = author;
		this.postDate = postDate;
		this.text = text;
	}

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

	public long getId() {
		return id;
	}
}
