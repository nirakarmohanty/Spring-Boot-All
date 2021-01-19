package com.nirakar.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication(scanBasePackages = { "com.nirakar.spring" })
@RestController
public class SpringMain {

	public static void main(String[] args) {
		SpringApplication.run(SpringMain.class, args);
	}

	
}
