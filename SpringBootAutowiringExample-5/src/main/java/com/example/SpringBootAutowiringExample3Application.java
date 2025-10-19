package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.auto.GameController;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class SpringBootAutowiringExample3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(SpringBootAutowiringExample3Application.class,
				args);

		GameController gameController = Context.getBean(GameController.class);
		gameController.showgame();

	}

}
