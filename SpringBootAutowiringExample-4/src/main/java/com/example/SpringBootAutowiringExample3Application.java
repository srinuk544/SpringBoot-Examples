package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy.Content;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.auto.Theater;

@SpringBootApplication
public class SpringBootAutowiringExample3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext Content = SpringApplication.run(SpringBootAutowiringExample3Application.class,
				args);

		Theater theater = Content.getBean(Theater.class);
		theater.moiveRunning("t", "tamil").forEach(System.out::println);

	}

}
