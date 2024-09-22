package com.example.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    
    String message = "";

    @Override
    public String execute() {
        message = "hello world";
        return SUCCESS;
    }
}
