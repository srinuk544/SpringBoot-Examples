package com.spring.Model.constroctedbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.Model.MessageService;

@Component
public class Constractorbaseddemo {

	private MessageService messageService;

	@Autowired
	public Constractorbaseddemo(@Qualifier("emailservice") MessageService messageService) {
		this.messageService = messageService;
	}

	public void processmessage(String message) {
		messageService.sendmessage(message);
	}
}
