package com.ambiyo.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServices implements GreetingServices {
    @Override
    public String sayGreetings() {
        return "Hello World-Constructor";
    }
}
