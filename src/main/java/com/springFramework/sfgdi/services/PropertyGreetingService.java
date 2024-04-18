package com.springFramework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

    @Override
    public String greet() {
        return "Hello World - Property";
    }
}
