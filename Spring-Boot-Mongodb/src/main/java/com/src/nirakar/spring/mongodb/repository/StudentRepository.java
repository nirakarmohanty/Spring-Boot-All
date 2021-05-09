package com.src.nirakar.spring.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.src.nirakar.spring.mongodb.dto.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{
	
	List<Student> findByBatch(String batch);
	
	List<Student> findByNameAndBatch(String name,String batch);
		
	List<Student> findByBatchOrName(String batch,String name);
}
