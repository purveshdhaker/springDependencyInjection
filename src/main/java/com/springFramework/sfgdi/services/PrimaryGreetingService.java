package com.springFramework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hello World! Primary Greeting Service";
    }
}
