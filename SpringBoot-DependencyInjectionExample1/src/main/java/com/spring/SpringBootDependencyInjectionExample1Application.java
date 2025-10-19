package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Model.propertybased.Propertiesbasedexample;
import com.spring.Model.setterbased.SetterBasedExample;

@SpringBootApplication
public class SpringBootDependencyInjectionExample1Application {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringBootDependencyInjectionExample1Application.class, args);
		/*
		 * to constractor based injection Constractorbaseddemo cb =
		 * (Constractorbaseddemo) ap.getBean(Constractorbaseddemo.class);
		 * cb.processmessage("Email message service done");
		 */

		/*           setter based 
		 * SetterBasedExample ss = (SetterBasedExample)
		 * ap.getBean(SetterBasedExample.class); ss.sendit("twitter serviceee");
		 */
		
		
		Propertiesbasedexample p=(Propertiesbasedexample)ap.getBean(Propertiesbasedexample.class);
		p.showit("smsservice donee");
	}

}
