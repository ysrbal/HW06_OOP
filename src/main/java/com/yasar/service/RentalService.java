package com.yasar.service;

import com.yasar.entity.Rental;
import com.yasar.repository.RentalRepository;

import java.util.ArrayList;

public class RentalService {
    private RentalRepository repository;

    public RentalService() {
        repository = new RentalRepository();
    }

    public void save(Rental rental) {
        repository.save(rental);
    }

    public void remove(int index) {
        repository.remove(index);
    }

    public ArrayList<Rental> findAll() {
        return repository.findAll();
    }
}
