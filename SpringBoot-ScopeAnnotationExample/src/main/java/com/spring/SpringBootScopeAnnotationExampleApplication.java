package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.bean.EmailService;

@SpringBootApplication
public class SpringBootScopeAnnotationExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringBootScopeAnnotationExampleApplication.class, args);

		EmailService e = ap.getBean(EmailService.class);
		e.SendMessage();

		EmailService e1 = ap.getBean(EmailService.class);
		e1.SendMessage();

		EmailService e2 = ap.getBean(EmailService.class);
		e2.SendMessage();

	}

}
