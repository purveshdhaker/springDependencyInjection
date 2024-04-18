package com.springFramework.sfgdi.controller;

import com.springFramework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectControllerTest {

    PropertyInjectController propertyInjectController;

    @BeforeEach
    void setUp() {
        propertyInjectController = new PropertyInjectController();

        propertyInjectController.greetingService =new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectController.getGreet());
    }

}