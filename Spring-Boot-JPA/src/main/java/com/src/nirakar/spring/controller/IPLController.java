package com.src.nirakar.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.src.nirakar.spring.svc.IBooksService;

@RestController
@RequestMapping(value = "/rest-ipl")
public class IPLController {
	@Autowired
	IBooksService booksvc;

	// http://localhost:8080/rest-ipl/hello
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello World"; 
	}
	
	@RequestMapping(value = "/getAllDetails", method = RequestMethod.GET)
	public List<String> getAllBookDetails() {
		return booksvc.getAllBookNames(); 
	}
} 
