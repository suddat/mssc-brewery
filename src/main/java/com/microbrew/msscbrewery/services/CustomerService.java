package com.microbrew.msscbrewery.services;

import com.microbrew.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
  CustomerDto getCustomerById(UUID customerID);

  CustomerDto saveCustomer(CustomerDto customerDto);

  void updateCustomer(UUID customerId, CustomerDto customerDto);

  void deleteCustomerById(UUID customerId);
}
