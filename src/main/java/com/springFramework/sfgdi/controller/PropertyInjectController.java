package com.springFramework.sfgdi.controller;

import com.springFramework.sfgdi.services.GreetingService;
import com.springFramework.sfgdi.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreet() {
        return greetingService.greet();
    }
}
