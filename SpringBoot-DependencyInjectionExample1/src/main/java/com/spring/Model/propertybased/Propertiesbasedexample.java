package com.spring.Model.propertybased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.Model.MessageService;

@Component
public class Propertiesbasedexample {
	@Autowired
	@Qualifier("sMSService")
	private MessageService messageService;

	public void showit(String message) {

		messageService.sendmessage(message);
	}
}
