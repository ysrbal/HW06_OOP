package com.yasar.repository;

import com.yasar.entity.Book;
import com.yasar.utility.DataBase;

import java.util.ArrayList;

public class BookRepository implements IBookRepository {

    @Override
    public void save(Book book) {
        DataBase.books.add(book);
    }

    @Override
    public void remove(int index) {
        DataBase.books.remove(index);
    }

    @Override
    public ArrayList<Book> findAll() {
        return DataBase.books;
    }
}
