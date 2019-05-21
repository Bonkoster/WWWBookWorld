package com.lukashman.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lukashman.model.BookChapter;

@Repository
public interface BookChapterRepository extends JpaRepository<BookChapter, Long> {

	public List<BookChapter> findAllByOriginId ( final Long originId );
	
	public List<BookChapter> deleteByOriginId ( final Long originId );
}
