package com.infy.springboot_aws_exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAwsExamApplication {

	@GetMapping("/greet")
	public String greet(){
		return "Welcome to aws deployment process";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsExamApplication.class, args);
	}

}
