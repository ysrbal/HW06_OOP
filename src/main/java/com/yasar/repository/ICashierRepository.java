package com.yasar.repository;

import com.yasar.entity.Cashier;

import java.util.ArrayList;

public interface ICashierRepository {
    void save(Cashier cashier);

    void remove(int index);

    ArrayList<Cashier> findAll();
}
