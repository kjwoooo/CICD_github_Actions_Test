package com.example.cicd_test1;

import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(CicdTest1Application.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "hello, World";
	}

}
