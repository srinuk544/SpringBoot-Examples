package com.spring.Model;

import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.springframework.stereotype.Component;
@Component
public class Emailservice implements MessageService {

	@Override
	public void sendmessage(String message) {
		// TODO Auto-generated method stub

		System.out.println("Message sends via  emialservice");
	}

}
