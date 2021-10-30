package com.microbrew.msscbrewery.web.controller.v2;

import com.microbrew.msscbrewery.services.v2.BeerServiceV2;
import com.microbrew.msscbrewery.web.model.BeerDto;
import com.microbrew.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    public BeerControllerV2(BeerServiceV2 beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDtoV2 beerDto){
        BeerDtoV2 saveDto = beerService.saveNewBeer(beerDto);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "http:/api/v1/beer/"+saveDto.getId().toString());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED );
    }

  @PutMapping({"/{beerId}"})
  public ResponseEntity<BeerDtoV2> updateBeer(@PathVariable UUID beerId, @RequestBody BeerDtoV2 beerDto) {
        beerService.updateBeer(beerId, beerDto);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping({"/{beerId}"})
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteBeer(beerId);
  }
}
