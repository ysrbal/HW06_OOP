package com.yasar.repository;

import com.yasar.entity.Customer;
import com.yasar.utility.DataBase;

import java.util.ArrayList;

public class CustomerRepository implements ICustomerRepository {

    @Override
    public void save(Customer customer) {
        DataBase.customers.add(customer);
    }

    @Override
    public void remove(int index) {
        DataBase.customers.remove(index);
    }

    @Override
    public ArrayList<Customer> findAll() {
        return DataBase.customers;
    }
}
