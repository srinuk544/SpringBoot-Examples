package com.spring.Model;

import org.springframework.stereotype.Component;

@Component
public class TwitterService implements MessageService {

	@Override
	public void sendmessage(String message) {
		// TODO Auto-generated method stub

		System.out.println("This is twitter service");

	}

}
