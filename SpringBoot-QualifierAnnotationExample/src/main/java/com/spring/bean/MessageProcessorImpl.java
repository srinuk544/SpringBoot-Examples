package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessorImpl {

	private MessageService messageService;

// setter based
	@Autowired
	@Qualifier("emailService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	// constructorr based
	@Autowired
	public MessageProcessorImpl(@Qualifier("twitterService") MessageService messageService) {
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}
