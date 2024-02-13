package com.yasar.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Rental extends BaseEntity {
    private Long startDate;
    private Long finishDate;
    private final double price = 12.99D;
    private String customerId;
    private boolean isActive;
    private ArrayList<Book> rentalBooks;

    public Rental() {
        this.id = new Random().nextLong(999);
    }

    public Rental(String customerId) {
        this();
        this.customerId = customerId;
        this.startDate = System.currentTimeMillis();

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rental{");
        sb.append("id=").append(id);
        sb.append(", startDate=").append(startDate);
        sb.append(", finishDate=").append(finishDate);
        sb.append(", price=").append(price);
        sb.append(", customerId='").append(customerId).append('\'');
        sb.append(", isActive=").append(isActive);
        sb.append(", rentalBooks=").append(rentalBooks);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Long finishDate) {
        this.finishDate = finishDate;
    }

    public double getPrice() {
        return price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public ArrayList<Book> getRentalBooks() {
        return rentalBooks;
    }

    public void setRentalBooks(ArrayList<Book> rentalBooks) {
        this.rentalBooks = rentalBooks;
    }
}
