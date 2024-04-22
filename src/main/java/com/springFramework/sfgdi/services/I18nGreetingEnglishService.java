package com.springFramework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("EN")
//@Service("I18nGreetingService")
public class I18nGreetingEnglishService implements GreetingService {

    @Override
    public String greet() {
        return "Hello World! English Service!";
    }
}
