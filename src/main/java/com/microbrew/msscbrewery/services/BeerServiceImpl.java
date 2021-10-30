package com.microbrew.msscbrewery.services;

import com.microbrew.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
  @Override
  public BeerDto getBeerById(UUID beerId) {
    return BeerDto.builder()
        .id(UUID.randomUUID())
        .beerName("corona")
        .beerStyle("hefeweizen")
        .build();
  }

  @Override
  public BeerDto saveNewBeer(BeerDto beerDto) {
    return BeerDto.builder().id(UUID.randomUUID()).build();
  }

  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {
    //todo impl - will add real implementation in future
    log.info("updating beer values");
  }

  @Override
  public void deleteBeer(UUID beerId) {
    log.info("Deleting Beer...");
  }
}
