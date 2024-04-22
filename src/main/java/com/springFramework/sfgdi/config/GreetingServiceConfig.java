package com.springFramework.sfgdi.config;

import com.springFramework.sfgdi.controller.PropertyInjectController;
import com.springFramework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile({"ES","default"})
    @Bean("I18nGreetingService")
    I18nGreetingSpanishService i18nGreetingSpanishService(){
        return new I18nGreetingSpanishService();
    }

    @Profile("EN")
    @Bean
    I18nGreetingEnglishService I18nGreetingService(){
        return new I18nGreetingEnglishService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

}
