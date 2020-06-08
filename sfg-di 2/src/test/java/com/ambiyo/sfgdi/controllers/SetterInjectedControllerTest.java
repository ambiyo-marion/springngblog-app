package com.ambiyo.sfgdi.controllers;

import com.ambiyo.sfgdi.Services.ConstructorGreetingServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {


    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller =new SetterInjectedController();
        controller.setGreetingServices(new ConstructorGreetingServices());

    }

    @Test
    void getGreeting() {
        controller.getGreeting();
        System.out.println(controller.getGreeting());
    }
}