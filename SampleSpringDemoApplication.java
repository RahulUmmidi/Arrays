package com.example.SampleSpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringDemoApplication.class, args);
		System.out.println("Hi");
	}

}
