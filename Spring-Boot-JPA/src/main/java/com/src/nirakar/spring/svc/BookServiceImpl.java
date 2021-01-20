package com.src.nirakar.spring.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.nirakar.spring.dao.IBookServiceDAO;

@Component
public class BookServiceImpl implements IBooksService {

	@Autowired
	private IBookServiceDAO booksvcDao;
	
	@Override
	public List<String> getAllBookNames() {
		return booksvcDao.getAllBooks();
	}

	@Override
	public List<String> getAllAuthors() {
		// TODO Auto-generated method stub
		return booksvcDao.getAllAuthors();
	}

}
