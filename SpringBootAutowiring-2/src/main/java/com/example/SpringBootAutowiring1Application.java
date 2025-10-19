package com.example;

import org.apache.logging.log4j.util.PerformanceSensitive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy.Content;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.ok.Perform;

@SpringBootApplication
public class SpringBootAutowiring1Application implements CommandLineRunner{

	public static void main(String[] args) {
		  ConfigurableApplicationContext Content=SpringApplication.run(SpringBootAutowiring1Application.class, args);
		  
		  
			/*
			 * Perform perform=Content.getBean(Perform.class);
			 * perform.show("we Wish you a marry christams", "v");
			 */
		  
		  
		  
	}

	
	private Perform perform;
	@Autowired
	public void setPerform(Perform perform) {
		this.perform = perform;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		perform.show("we wish you marry christamas", "g");
		perform.show("we wish you happy married life", "k");
		perform.show("we wish you many more hbd", "v");
		
		
	}

}
