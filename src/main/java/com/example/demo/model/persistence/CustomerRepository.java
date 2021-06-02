package com.example.demo.model.persistence;

import com.example.demo.model.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
