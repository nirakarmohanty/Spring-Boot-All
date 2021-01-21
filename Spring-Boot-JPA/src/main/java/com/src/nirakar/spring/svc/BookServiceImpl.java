package com.src.nirakar.spring.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.nirakar.spring.dao.IBookServiceDAO;
import com.src.nirakar.spring.dto.Book;

@Component
public class BookServiceImpl implements IBooksService {

	@Autowired
	private IBookServiceDAO booksvcDao;
	
	@Override
	public List<Book> getAllBookNames() {
		return booksvcDao.getAllBooks();
	}

	@Override
	public List<String> getAllAuthors() {
		return booksvcDao.getAllAuthors();		
	}

}
