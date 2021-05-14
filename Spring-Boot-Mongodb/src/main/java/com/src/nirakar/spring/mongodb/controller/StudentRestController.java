package com.src.nirakar.spring.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.src.nirakar.spring.mongodb.dto.Student;
import com.src.nirakar.spring.mongodb.service.StudentSvc;

@RestController
//@RequestMapping("/api/student")
public class StudentRestController {

	@Autowired
	private StudentSvc studentSvc;

	// http://localhost:8080/hello
	@GetMapping("/hello")
	public String syahello() {
		return "Mongo DB Rest Controller Runnnig!";
	}

	@GetMapping("/findStudent/{id}")
	public Student findStudent(@PathVariable String id) {
		return studentSvc.findStudentById(id);
	}

	@GetMapping("/findAll")
	public List<Student> findAllStudent() {
		return studentSvc.findAllStudent();
	}
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return studentSvc.create(student);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentSvc.update(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteStudent(@PathVariable String id) {
		return studentSvc.delete(id);
	}
	
	@GetMapping("/getByBatches/{batchName}")
	public List<Student> getAllStudentByBatches(@PathVariable String batchName){
		return studentSvc.getAllBatchDetails(batchName);
	}
	
	@GetMapping("/getStudentsByNameAndBatch")
	public List<Student> getStudentByANDCondition(@RequestParam String name, @RequestParam String batch){
		return studentSvc.getStudentByCondition(name,batch);
	}
	
	@GetMapping("/getStudentsByNameOrBatch")
	public List<Student> getStudentByORCondition(@RequestParam String name, @RequestParam String batch){
		return studentSvc.getStudentByORCondition(name,batch);
	}
	
}
