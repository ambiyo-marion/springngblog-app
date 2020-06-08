package com.ambiyo.sfgdi.controllers;

import com.ambiyo.sfgdi.Services.GreetingServices;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final GreetingServices greetingServices;

    public MyController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){


        return greetingServices.sayGreetings();
    }
}
