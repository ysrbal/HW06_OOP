package com.yasar.service;

import com.yasar.entity.Customer;
import com.yasar.repository.CustomerRepository;

import java.util.ArrayList;

public class CustomerService {
    private CustomerRepository repository;
  public   CustomerService(){
        repository = new CustomerRepository();
    }

    public void save(Customer customer){
        repository.save(customer);
    }
    public void remove(int index){
        repository.remove(index);
    }
    public ArrayList<Customer> findAll(){
        return repository.findAll();
    }
}
