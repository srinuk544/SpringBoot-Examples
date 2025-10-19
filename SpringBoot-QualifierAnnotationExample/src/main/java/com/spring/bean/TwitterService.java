package com.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class TwitterService implements MessageService{

    public void sendMsg(String message) {
        System.out.println(message);
    }
}