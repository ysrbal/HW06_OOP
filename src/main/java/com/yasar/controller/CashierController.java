package com.yasar.controller;

import com.yasar.entity.Cashier;
import com.yasar.service.CashierService;
import com.yasar.utility.DataBase;

import java.util.ArrayList;
import java.util.Scanner;

public class CashierController implements IController {
    private CashierService service;

    public CashierController() {
        service = new CashierService();
    }

    public void add() {
        System.out.println("""
                *******************************
                *****   KASİYER EKLEME   ******
                *******************************
                                
                """);
        System.out.print("Lütfen ID numarasını giriniz ........ : ");
        Long id = new Scanner(System.in).nextLong();
        System.out.print("Lütfen kasiyerin adını giriniz ...... : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Lütfen kasiyerin soyadını giriniz ... : ");
        String lastname = new Scanner(System.in).nextLine();
        System.out.print("Lütfen cinsiyetini giriniz .......... : ");
        String gender = new Scanner(System.in).nextLine();
        Cashier cashier = new Cashier(id, name, lastname, gender);
        service.save(cashier);
    }

    @Override
    public void remove() {
        int index;
        boolean isThere = false;
        System.out.println("""
                *******************************
                ******   KASİYER SİLME   ******
                *******************************
                            
                """);
        System.out.print("Lütfen silmek istediğiniz kasiyerin ID numarasını giriniz... : ");
        Long id = new Scanner(System.in).nextLong();
        for (int i = 0; i < DataBase.cashiers.size(); i++) {
            if (id.equals(DataBase.cashiers.get(i).getId())) {
                isThere = true;
                System.out.println("Kayıt başarıyla silindi.");
                index = i;
                service.remove(index);
                break;
            }
        }
        if (isThere = false) {
            System.out.println("Geçerli bir kayıt bulunamadı.");
        }
    }

    public ArrayList<Cashier> findAll() {
        return service.findAll();
    }
}


