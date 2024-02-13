package com.yasar.service;

import com.yasar.entity.Book;
import com.yasar.repository.BookRepository;

import java.util.ArrayList;

public class BookService {
    private BookRepository repository;

  public   BookService() {
        repository = new BookRepository();
    }

    public void save(Book book) {
        repository.save(book);
    }

    public void remove(int index) {
        repository.remove(index);
    }

    public ArrayList<Book> findAll() {
        return repository.findAll();
    }
}
