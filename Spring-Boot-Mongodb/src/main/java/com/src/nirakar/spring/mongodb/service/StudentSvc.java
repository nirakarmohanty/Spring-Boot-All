package com.src.nirakar.spring.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.src.nirakar.spring.mongodb.dto.Student;
import com.src.nirakar.spring.mongodb.repository.StudentRepository;

@Service
public class StudentSvc {

	@Autowired
	private StudentRepository studentRepository;

	public Student findStudentById(String id) {
		Optional<Student> findById = studentRepository.findById(id);
		System.out.println("After Find " + "\t" + findById.get());
		return findById.get();
	}

	public List<Student> findAllStudent() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
	}

	public Student create(Student student) {
		Student studentUpdated = studentRepository.save(student);
		System.out.println("After Created " + "\t" + studentUpdated);
		return studentUpdated;
	}

	public Student update(Student student) {
		Student studentUpdated = studentRepository.save(student);
		System.out.println("After updated " + "\t" + studentUpdated);
		return studentUpdated;
	}

	public boolean delete(String id) {
		studentRepository.deleteById(id);
		return true;
	}

	public List<Student> getAllBatchDetails(String batchName) {
		return studentRepository.findByBatch(batchName);
	}

	public List<Student> getStudentByCondition(String name, String batch) {
		return studentRepository.findByNameAndBatch(name,batch);
	}

	public List<Student> getStudentByORCondition(String name, String batch) {
		return studentRepository.findByBatchOrName(batch, name);
	}
}
