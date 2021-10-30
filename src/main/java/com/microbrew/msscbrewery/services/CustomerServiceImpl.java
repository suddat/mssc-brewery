package com.microbrew.msscbrewery.services;

import com.microbrew.msscbrewery.web.model.BeerDto;
import com.microbrew.msscbrewery.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
  @Override
  public CustomerDto getCustomerById(UUID customerID) {
    return CustomerDto.builder().id(customerID).customerName("shanaben").build();
  }


}
