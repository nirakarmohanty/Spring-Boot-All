package com.src.nirakar.spring.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.src.nirakar.spring.dto.Book;
@Component
public interface BookServiceJPA extends CrudRepository<Book, Integer>{

}
