package com.bookapp;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bookapp.util.BookUtill;

@SpringBootApplication
public class SpringBootBookApplicationExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookApplicationExampleApplication.class, args);

		System.out.println("Run successfully----------");
	}

}
