package com.yasar.service;

import com.yasar.entity.Cashier;
import com.yasar.repository.CashierRepository;

import java.util.ArrayList;

public class CashierService {
    private CashierRepository repository;

   public CashierService() {
        repository = new CashierRepository();
    }

    public void save(Cashier cashier) {
        repository.save(cashier);
    }

    public void remove(int index) {
        repository.remove(index);
    }

    public ArrayList<Cashier> findAll() {
        return repository.findAll();
    }
}
