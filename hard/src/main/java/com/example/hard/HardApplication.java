package com.example.hard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HardApplication.class, args);
	}
  
	@GetMapping("/simple")
	public String simpleProject() {
		return " Spring Boot Application !";
	}
}
