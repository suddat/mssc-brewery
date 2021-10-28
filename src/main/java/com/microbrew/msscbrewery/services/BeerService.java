package com.microbrew.msscbrewery.services;

import com.microbrew.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
