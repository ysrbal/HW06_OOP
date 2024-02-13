package com.yasar.controller;

import com.yasar.entity.Book;
import com.yasar.service.BookService;
import com.yasar.utility.DataBase;

import java.util.ArrayList;
import java.util.Scanner;

public class BookController implements IController {
    private BookService service;

    public BookController() {
        service = new BookService();
    }

    public void add() {
        System.out.println("""
                *******************************
                ******   KİTAP EKLEME   *******
                *******************************
                                
                """);
        System.out.print("Lütfen ID numarasını giriniz ... : ");
        Long id = new Scanner(System.in).nextLong();
        System.out.print("Lütfen kitabın adını giriniz ... : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Lütfen yazarın adını giriniz ... : ");
        String writer = new Scanner(System.in).nextLine();
        System.out.print("Kitabın yayın yılını giriniz ... : ");
        String releaseDate = new Scanner(System.in).nextLine();
        System.out.print("Kitabın türünü giriniz .......... :");
        String genre = new Scanner(System.in).nextLine();
        Book book = new Book(name, id, writer, releaseDate, genre);
        book.setRental(false);
        service.save(book);
    }

    public void remove() {
        int index;
        boolean isThere;
        System.out.println("""
                *******************************
                *******   KİTAP SİLME   *******
                *******************************
                            
                """);
        System.out.print("Lütfen silmek istediğiniz kitabın ID numarasını giriniz... : ");
        Long id = new Scanner(System.in).nextLong();
        for (int i = 0; i < DataBase.books.size(); i++) {
            if (id.equals(DataBase.books.get(i).getId())) {
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

    public ArrayList<Book> findAll() {
        return service.findAll();
    }
}