package com.microbrew.msscbrewery.services.v2;

import com.microbrew.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteBeer(UUID beerId) {

    }
}
