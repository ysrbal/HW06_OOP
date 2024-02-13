package com.yasar.repository;

import com.yasar.entity.Rental;

import java.util.ArrayList;

public interface IRentalRepository {
    void save(Rental rental);
    void remove(int index);
    ArrayList<Rental> findAll();
}
