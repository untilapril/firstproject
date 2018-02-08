package com.firstproject.restaurantApp.service;


import com.firstproject.restaurantApp.model.Customer;
import com.firstproject.restaurantApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

@Autowired
CustomerRepository customerRepository;
public List<Customer> getAllCustomers(){
    return customerRepository.getCustomerList();
}


}
