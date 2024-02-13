package com.yasar.entity;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Customer extends BaseEntity {
    private String lastName;
    private String address;
    private String phoneNumber;
    private String eMail;
    private String gender;
    private ArrayList<Book> books = new ArrayList<>();

    public Customer(Long id, String name, String lastName, String address, String phoneNumber, String eMail, String gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", eMail='").append(eMail).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", books=").append(books);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
