package com.ambiyo.sfgpetcliniq.services;

import com.ambiyo.sfgpetcliniq.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
