package com.microbrew.msscbrewery.services;

import com.microbrew.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
  @Override
  public CustomerDto getCustomerById(UUID customerID) {
    return CustomerDto.builder().id(customerID).customerName("shanaben").build();
  }
}
