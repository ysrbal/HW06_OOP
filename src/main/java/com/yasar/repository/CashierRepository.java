package com.yasar.repository;

import com.yasar.entity.Cashier;
import com.yasar.utility.DataBase;

import java.util.ArrayList;

public class CashierRepository implements ICashierRepository {
    @Override
    public void save(Cashier cashier) {
        DataBase.cashiers.add(cashier);
    }

    @Override
    public void remove(int index) {
        DataBase.cashiers.remove(index);
    }

    @Override
    public ArrayList<Cashier> findAll() {
        return DataBase.cashiers;
    }
}
