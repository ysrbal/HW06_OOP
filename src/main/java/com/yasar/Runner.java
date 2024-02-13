package com.yasar;

import com.yasar.controller.BookController;
import com.yasar.utility.DataBase;

public class Runner {
    public static void main(String[] args) {
        BookController controller = new BookController();
        controller.add();
        controller.add();
        controller.add();
        System.out.println(DataBase.books.toString());
        controller.remove();
        System.out.println(DataBase.books.toString());
    }
}
