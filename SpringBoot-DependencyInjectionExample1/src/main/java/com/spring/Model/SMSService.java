package com.spring.Model;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {

	@Override
	public void sendmessage(String message) {
		// TODO Auto-generated method stub

		System.out.println("send message via smsservice");
	}

}
