package com.springFramework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hello World! Constructor" ;
    }
}
