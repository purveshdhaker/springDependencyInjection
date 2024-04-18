package com.springFramework.sfgdi.controller;

import com.springFramework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    @Autowired
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greet();
    }
}
