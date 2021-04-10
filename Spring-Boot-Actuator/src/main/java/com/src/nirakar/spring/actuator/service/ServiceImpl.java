package com.src.nirakar.spring.actuator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {

	public static List<EmployeeBO> list = new ArrayList<EmployeeBO>();

	@Override
	public String prepareMessage(String message) {
		return "Message " + message + " Return From Service layer";
	}

	@Override
	public EmployeeBO prepareEmployee(Integer empId) {
		EmployeeBO emp = new EmployeeBO("Nirakar", empId.intValue(), empId.intValue() * 10);
		list.add(emp);
		return emp;
	}

}
