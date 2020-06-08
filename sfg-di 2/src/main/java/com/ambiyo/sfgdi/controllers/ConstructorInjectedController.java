package com.ambiyo.sfgdi.controllers;

import com.ambiyo.sfgdi.Services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingServices greetingServices;


    public ConstructorInjectedController(@Qualifier("constructorGreetingServices")GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public  String getGreeting(){
        return greetingServices.sayGreetings();
    }
}
