package com.example.helloWorldDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class HelloWorldDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldDemo2Application.class, args);
	}

}
