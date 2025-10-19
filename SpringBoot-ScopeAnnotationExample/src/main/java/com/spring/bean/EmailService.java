package com.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class EmailService implements MessageService {

	@Override
	public void SendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Is a email service");
	}

}
