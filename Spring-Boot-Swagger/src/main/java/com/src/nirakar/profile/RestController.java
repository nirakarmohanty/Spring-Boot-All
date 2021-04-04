package com.src.nirakar.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController

public class RestController {
	
	@Value("${message}")
	private String message;
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/getMessage")
	public String getMessage() {
		return message;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/api/postMessage/{param}")
	public String setMessage(@PathVariable("param") String param) {
		return message+ " : "+ param;
	}
}
