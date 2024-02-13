package com.yasar.controller;

import com.yasar.entity.Book;
import com.yasar.entity.Customer;
import com.yasar.service.CustomerService;
import com.yasar.utility.DataBase;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController implements IController {
    private CustomerService service;

    public CustomerController() {
        service = new CustomerService();
    }

    @Override
    public void add() {
        System.out.println("""
                *******************************
                *****   MÜŞTERİ EKLEME   ******
                *******************************
                                
                """);
        System.out.print("Lütfen ID numarasını giriniz ... : ");
        Long id = new Scanner(System.in).nextLong();
        System.out.print("Lütfen adınızı giriniz ... : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Lütfen soyadınızı giriniz ... : ");
        String lastname = new Scanner(System.in).nextLine();
        System.out.print("Lütfen adresinizi giriniz.... : ");
        String address = new Scanner(System.in).nextLine();
        System.out.print("Lütfen telefon numaranızı giriniz ... :");
        String phoneNumber = new Scanner(System.in).nextLine();
        System.out.print("Lütfen email adresinizi giriniz ... :");
        String eMail = new Scanner(System.in).nextLine();
        System.out.print("Lütfen cinsiyetinizi giriniz ... :");
        String gender = new Scanner(System.in).nextLine();
        Customer customer = new Customer(id, name, lastname, address, phoneNumber, eMail, gender);
        service.save(customer);


    }

    @Override
    public void remove() {
        int index;
        boolean isThere = false;
        System.out.println("""
                *******************************
                ******   MÜŞTERİ SİLME   ******
                *******************************
                            
                """);
        System.out.print("Lütfen silmek istediğiniz müşterinin ID numarasını giriniz... : ");
        Long id = new Scanner(System.in).nextLong();
        for (int i = 0; i < DataBase.customers.size(); i++) {
            if (id.equals(DataBase.customers.get(i).getId())) {
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

    public ArrayList<Customer> findAll() {
        return service.findAll();
    }
}
