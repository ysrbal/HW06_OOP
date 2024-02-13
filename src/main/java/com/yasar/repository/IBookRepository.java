package com.yasar.repository;

import com.yasar.entity.BaseEntity;
import com.yasar.entity.Book;

import java.util.ArrayList;

public interface IBookRepository {
    void save(Book book);

    void remove(int index);

    ArrayList<Book> findAll();
}
