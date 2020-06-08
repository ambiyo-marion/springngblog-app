package com.ambiyo.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cat")
public class CatPetServices implements PetService {

    @Override
    public String getPetType() {
        return "Cats are the best!";
    }
}
