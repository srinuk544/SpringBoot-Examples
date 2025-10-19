package com.spring.Model.setterbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.Model.MessageService;

@Component
public class SetterBasedExample {

	private MessageService messageService;

	@Autowired
	@Qualifier("twitterService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public void sendit(String name) {
		messageService.sendmessage(name);
	}

}
