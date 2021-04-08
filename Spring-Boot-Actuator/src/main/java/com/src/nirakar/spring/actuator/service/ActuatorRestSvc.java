package com.src.nirakar.spring.actuator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorRestSvc {
	@Autowired
	private Service service;
	
	//http://localhost:8080/hello
	@GetMapping("/hello")
	public String syahello() {
		return "Hi Actuator runnig !";
	}
	//http://localhost:8080/getMessage/hello
	@GetMapping("/getMessage/{message}")	
	public String getMessage(@PathVariable("message") String message) {
		return service.prepareMessage(message.toUpperCase());
	}
	
}
