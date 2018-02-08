package com.firstproject.restaurantApp.repository;

/*


*/

import com.firstproject.restaurantApp.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class CustomerRepository {


    public List<Customer> getCustomerList() {
        return customerList;
    }

    List<Customer> customerList = new ArrayList<Customer>(Arrays.asList(

            new Customer(1,"utsav", "tiwari", "utsav@gmail.com","4056789857"),
            new Customer(2,"ramesh", "khadka", "ramkha@gmail.com","84512454112"),
            new Customer(3,"paras", "gautam", "paga@gmail.com","789515452")
            )
    );

}
