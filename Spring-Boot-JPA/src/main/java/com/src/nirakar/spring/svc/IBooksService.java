package com.src.nirakar.spring.svc;

import java.util.List;

import com.src.nirakar.spring.dto.Book;

public interface IBooksService {
	
	List<Book> getAllBookNames();
	
	List<String> getAllAuthors();

}
