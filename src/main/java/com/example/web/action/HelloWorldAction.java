package com.example.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    
    @Override
    public String execute() {
        String message = "hello world";
        return SUCCESS;
    }
}
