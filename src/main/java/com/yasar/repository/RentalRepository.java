package com.yasar.repository;



import com.yasar.entity.Rental;
import com.yasar.utility.DataBase;

import java.util.ArrayList;

public class RentalRepository implements IRentalRepository {
    @Override
    public void save(Rental rental) {
        DataBase.rentals.add(rental);
    }

    @Override
    public void remove(int index) {
        DataBase.rentals.remove(index);
    }

    @Override
    public ArrayList<Rental> findAll() {
        return DataBase.rentals;
    }


}
