package com.example.web.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    public String getMessage(){
        return "Test";
    }
}
