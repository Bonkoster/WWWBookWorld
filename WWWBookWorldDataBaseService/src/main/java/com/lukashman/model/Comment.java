package com.lukashman.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.annotations.Proxy;

@Entity
@Table( name="comment_table" )
@Proxy(lazy = false)
public class Comment {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "comment_id" )
	@Null
	private long id;
	
	@Column( name = "comment_book_id" )
	private long bookId;
	
	@Column( name = "comment_author" )
	@NotNull
	private String author;
	
	@Column( name = "comment_date" )
	@NotNull
	@PastOrPresent
	private Date postDate;
	
	@Column( name = "comment_text" )
	@NotNull
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
