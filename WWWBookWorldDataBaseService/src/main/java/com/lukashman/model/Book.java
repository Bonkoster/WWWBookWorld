package com.lukashman.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.hibernate.annotations.Proxy;

@Entity
@Table( name="book_table" )
@Proxy(lazy = false)
public class Book {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "book_id" )
	@Null
	private long id;
	
	@Column( name = "book_title" )
	@NotNull
	private String title;
	
	@Column( name = "book_description" )
	@NotNull
	private String description;
	
	@Column( name = "book_author" )
	@NotNull
	private String author;
	
	@Column( name = "book_chapter_count" )
	@NotNull
	private int chapterCount;
	
	public Book() {
	}

	public Book(String title, String description, String author, int chapterCount) {
		this.title = title;
		this.description = description;
		this.author = author;
		this.chapterCount = chapterCount;
	}

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

	public long getId() {
		return id;
	}
}
