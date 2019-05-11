package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/first")
	public String fun(){
		return "The First Commit";
	}

	@GetMapping("/second")
	public String fun1(){
		return "The Second Commit";
	}

	@GetMapping("/thrid")
	public String fun2(){
		return "The Third Commit";
	}

	@GetMapping("/fourth")
	public String fun3(){
		return "The Fourth Commit";
	}

	@GetMapping("/fiveth")
	public String fun4(){
		return "The Fiveth-Test Commit";
	}

}
