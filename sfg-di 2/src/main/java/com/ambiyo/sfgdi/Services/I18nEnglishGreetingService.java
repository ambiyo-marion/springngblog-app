package com.ambiyo.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingServices {

    @Override
    public String sayGreetings() {
        return "Hello World-EN";
    }
}
