package com.springFramework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements  GreetingService {
    @Override
    public String greet() {
        return "Hello World!- Setter Injected Greeting Service";
    }
}
