package com.src.nirakar.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.src.nirakar.spring.dto.Book;
import com.src.nirakar.spring.svc.IBooksService;

@RestController
@RequestMapping(value = "/rest-books")
public class AmazonBookSellRestController {
	
	@Autowired
	IBooksService booksvc;

	// http://localhost:8080/rest-ipl/hello
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello World"; 
	}
	
	// http://localhost:8181/rest-books/getAllDetails
	@RequestMapping(value = "/getAllDetails", method = RequestMethod.GET)
	public List<Book> getAllBookDetails() {
		return booksvc.getAllBookNames();  
	}
	@RequestMapping(value = "/getAllAuthor", method = RequestMethod.GET)
	public List<String> getAuthor() {
		return booksvc.getAllAuthors();  
	}
	
	@RequestMapping(value = "/getAuthorDetails", method = RequestMethod.GET)
	public List<Book> getAuthorDetails(String author) {
		return booksvc.getAuthorDetails(author);  
	}
} 
