package com.ambiyo.sfgpetcliniq.services;


import com.ambiyo.sfgpetcliniq.model.Vet;

import java.util.Set;

public interface VetServices {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
