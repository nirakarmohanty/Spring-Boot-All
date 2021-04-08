package com.src.nirakar.spring.actuator.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service{

	@Override
	public String prepareMessage(String message) {		
		return "Message "+ message + " Return From Service layer";
	}

}
