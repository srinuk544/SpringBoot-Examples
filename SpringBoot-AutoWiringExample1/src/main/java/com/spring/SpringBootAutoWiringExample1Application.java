package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.entity.School;

@SpringBootApplication
public class SpringBootAutoWiringExample1Application {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringBootAutoWiringExample1Application.class, args);

		School s = ap.getBean(School.class);
		s.show();
	}

}
