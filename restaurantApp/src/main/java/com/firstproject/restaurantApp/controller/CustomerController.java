package com.firstproject.restaurantApp.controller;

import com.firstproject.restaurantApp.model.Customer;
import com.firstproject.restaurantApp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CustomerController {

@Autowired
CustomerService customerService;

@GetMapping("/customers")
public List<Customer> getList (){
 return customerService.getAllCustomers();
 }
}
