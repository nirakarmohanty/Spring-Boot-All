package com.src.nirakar.spring.dao;

import java.util.List;

import com.src.nirakar.spring.dto.Book;

public interface IBookServiceDAO {
	
	List<Book> getAllBooks();

	List<String> getAllAuthors();

}
