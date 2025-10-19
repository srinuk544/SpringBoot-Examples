package com.spring.bean;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {
	public void sendMsg(String message);
}
