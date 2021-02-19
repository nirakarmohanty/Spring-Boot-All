package com.src.nirakar.spring.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.src.nirakar.spring.dto.Book;
@Repository
public interface BookServiceJPA extends JpaRepository<Book, Integer>{
	//Find By Author Name
	List<Book> findByAuthor(String author);
	
	 @Query("SELECT b FROM Book b  WHERE b.userRating=(:userRating) AND b.year=(:year)")
	 List<Book> findByUserRatingAndPYear(@Param("userRating")  String userRating,@Param("year")  String year);

	
}
