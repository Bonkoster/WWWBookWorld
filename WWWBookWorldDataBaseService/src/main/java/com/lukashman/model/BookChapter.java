package com.lukashman.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table( name = "book_chapter_table" )
@Proxy(lazy = false)
public class BookChapter {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "book_chapter_id" )
	private long id;
	
	@Column( name = "book_chapter_origin_id" )
	private long originId;
	
	@Column( name = "book_chapter_title" )
	private String title;
	
	@Column( name = "book_chapter_number" )
	private int chapterNumber;
	
	@Column( name = "book_chapter_text" )
	private String chapterText;
	
	public BookChapter() {
	}

	public BookChapter(long originId, String title, Integer chapterNumber, String chapterText) {
		this.originId = originId;
		this.title = title;
		this.chapterNumber = chapterNumber;
		this.chapterText = chapterText;
	}

	public Long getOriginId() {
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

	public Integer getChapterNumber() {
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

	public long getId() {
		return id;
	}
}
