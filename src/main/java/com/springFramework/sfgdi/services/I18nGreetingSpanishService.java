package com.springFramework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("I18nGreetingService")
public class I18nGreetingSpanishService implements GreetingService {
    @Override
    public String greet() {
        return "Hello World! Spanish Service";
    }
}
