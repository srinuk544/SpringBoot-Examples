package com.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStandAloneApplicationExampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStandAloneApplicationExampleApplication.class, args);
		System.out.println("Helo standAlone Application");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("hlo welcome");
	}

}
