package com.src.nirakar.spring.actuator.service;

import org.springframework.context.annotation.Bean;

import lombok.Data;

@Data

public class EmployeeBO {
	
	
	public EmployeeBO(String name, int empId, int salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	private String name;
	private int empId;
	private int salary;

}
