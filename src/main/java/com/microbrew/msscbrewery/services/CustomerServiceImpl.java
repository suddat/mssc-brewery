package com.microbrew.msscbrewery.services;

import com.microbrew.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
  @Override
  public CustomerDto getCustomerById(UUID customerID) {
    return CustomerDto.builder().id(customerID).customerName("shanaben").build();
  }

  @Override
  public CustomerDto saveCustomer(CustomerDto customerDto) {
    log.info("saving customer");
    return CustomerDto.builder().id(UUID.randomUUID()).build();
  }

  @Override
  public void updateCustomer(UUID customerId, CustomerDto customerDto) {
    log.info("updating customer data...");
  }

  @Override
  public void deleteCustomerById(UUID customerId) {
    log.info("Deleting customer record...");
  }
}
