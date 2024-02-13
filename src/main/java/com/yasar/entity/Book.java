package com.yasar.entity;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Book extends BaseEntity {

    private String writer;
    private String releaseDate;
    private String genre;
    private String isbnCode;
    private boolean isRental;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Book() {
        this.isbnCode = UUID.randomUUID().toString();
    }

    public Book(String name, Long id, String writer, String releaseDate, String genre) {
        this();
        this.name = name;
        this.id = id;
        this.writer = writer;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append("writer='").append(writer).append('\'');
        sb.append(", releaseDate='").append(releaseDate).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", isbnCode='").append(isbnCode).append('\'');
        sb.append(", isRental=").append(isRental);
        sb.append(", customers=").append(customers);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public boolean isRental() {
        return isRental;
    }

    public void setRental(boolean rental) {
        isRental = rental;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
