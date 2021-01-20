package com.src.nirakar.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication(scanBasePackages = { "com.src.nirakar.spring" })
@RestController
@EnableJpaRepositories("com.src.nirakar.spring.jpa")
@EntityScan("com.src.nirakar.spring.*")  
public class SpringMain {

	public static void main(String[] args) {
		SpringApplication.run(SpringMain.class, args);
	}

	
}
