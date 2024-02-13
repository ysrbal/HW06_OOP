package com.yasar.repository;

import com.yasar.entity.Customer;

import java.util.ArrayList;

public interface ICustomerRepository {
    void save(Customer customer);

    void remove(int index);

    ArrayList<Customer> findAll();
}
