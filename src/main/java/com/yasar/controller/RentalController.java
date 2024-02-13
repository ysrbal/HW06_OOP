package com.yasar.controller;

import com.yasar.entity.Rental;
import com.yasar.service.RentalService;
import com.yasar.utility.DataBase;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalController {
    private RentalService service;

    public RentalController() {
        service = new RentalService();
    }
    
}
