package com.ambiyo.sfgdi.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryGreetingService implements GreetingServices {

    @Override
    public String sayGreetings() {
        return "Hello World-From the PRIMARY Bean";
    }

}
