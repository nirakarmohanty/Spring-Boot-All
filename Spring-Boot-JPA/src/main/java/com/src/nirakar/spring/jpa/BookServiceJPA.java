package com.src.nirakar.spring.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.nirakar.spring.dto.Book;
@Repository
public interface BookServiceJPA extends CrudRepository<Book, Integer>{
	
	
}
