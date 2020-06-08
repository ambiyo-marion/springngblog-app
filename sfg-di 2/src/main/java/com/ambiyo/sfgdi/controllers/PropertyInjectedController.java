package com.ambiyo.sfgdi.controllers;

import com.ambiyo.sfgdi.Services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingServices greetingServices;

    public  String getGreeting(){
        return greetingServices.sayGreetings();
    }
}
