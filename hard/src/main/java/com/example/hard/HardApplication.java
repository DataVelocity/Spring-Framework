package com.example.hard;

//import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HardApplication {

	public static void main(String[] args) {

		SpringApplication.run(HardApplication.class, args);
//		System.out.println("Hello AWS EC2");
	}
	@GetMapping("/go")
	public String simpleProject() {

		return " Spring Boot App! Deployed On AWS EC2 ";
	}


}
