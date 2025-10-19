package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataJpaInteractToDataBaseEXampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaInteractToDataBaseEXampleApplication.class, args);
		System.out.println("data will be inserted");
	}

}
