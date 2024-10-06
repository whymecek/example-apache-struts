package com.example.web.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.web.services.HelloService;
import com.opensymphony.xwork2.ActionSupport;

import com.example.web.vmodels.Message;

public class HelloWorldAction extends ActionSupport {
    
    Message message;

    @Autowired
    private HelloService helloService;

    @Override
    public String execute() {
        message = new Message( helloService.getMessage() );
        return SUCCESS;
    }

    public Message getMessage() {
        return message;
    }
}
