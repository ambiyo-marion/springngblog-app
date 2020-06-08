package com.ambiyo.sfgdi.controllers;

import com.ambiyo.sfgdi.Services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingServices greetingServices;

    public I18nController(@Qualifier("i18nService")GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String sayHello(){
       return greetingServices.sayGreetings();
    }
}
