package com.src.nirakar.spring.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
	public List<Book> getAllBooks() {
		
		 List<Book> allBookDetails = (List<Book>) booksvcJPA.findAll();
		 return allBookDetails;
		 
	}

	@Override
	public List<String> getAllAuthors() {
		 List<Book> allBookDetails = (List<Book>) booksvcJPA.findAll();
		 Set<String> set = new HashSet<>(allBookDetails.size());
		 List<Book> collect = allBookDetails.stream().filter(p -> set.add(p.getAuthor())).collect(Collectors.toList());
		 return collect.stream().distinct().map(book->book.getAuthor()).collect(Collectors.toList());
	}

	@Override
	public List<Book> getAuthorDetails(String author) {
		// TODO Auto-generated method stub
		return booksvcJPA.findByAuthor(author);
	}

}
