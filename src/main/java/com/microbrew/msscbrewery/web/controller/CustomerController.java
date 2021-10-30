package com.microbrew.msscbrewery.web.controller;

import com.microbrew.msscbrewery.services.CustomerService;
import com.microbrew.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping({"/{customerId}"})
  public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId) {
    return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity saveCustomer(@RequestBody CustomerDto customerDto){
    CustomerDto savedDto =  customerService.saveCustomer(customerDto);

    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.add("Location", "/api/v1/customer/"+savedDto.getId());

    return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
  }

  @PutMapping({"/{customerId}"})
  public ResponseEntity updateCustomer(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto){
    customerService.updateCustomer(customerId, customerDto);

    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping({"/{customerId}"})
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteCustomer(@PathVariable UUID customerId){
    customerService.deleteCustomerById(customerId);
  }
}
