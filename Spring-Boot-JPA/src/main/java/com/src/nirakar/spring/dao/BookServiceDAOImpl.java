package com.src.nirakar.spring.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.nirakar.spring.dto.Book;
import com.src.nirakar.spring.jpa.BookServiceJPA;

@Component
public class BookServiceDAOImpl implements IBookServiceDAO {
	@Autowired
	private BookServiceJPA booksvcJPA;

	@Override
	public List<String> getAllBooks() {
		
		 List<Book> allBookDetails = (List<Book>) booksvcJPA.findAll();
		 //List<Book> collect = allBookDetails.stream().filter(predicate -> predicate.getName()!=null).collect(Collectors.toList());
		 return allBookDetails.stream().map(book->book.getAuthor()).collect(Collectors.toList());
		 
	}

	@Override
	public List<String> getAllAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

}
