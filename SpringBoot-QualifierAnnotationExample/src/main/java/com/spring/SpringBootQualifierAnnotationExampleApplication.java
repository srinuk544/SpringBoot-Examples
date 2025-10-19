package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.bean.MessageProcessorImpl;

@SpringBootApplication
public class SpringBootQualifierAnnotationExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringBootQualifierAnnotationExampleApplication.class, args);
		MessageProcessorImpl mm = ap.getBean(MessageProcessorImpl.class);

		// mm.processMsg("email service");

		mm.processMsg("Welcome to Twitter Servicee");
	}

}
