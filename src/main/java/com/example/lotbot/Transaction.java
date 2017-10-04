package com.example.lotbot;

import java.time.LocalDateTime;

// TODO: Finish fields, introduce getters/setters
public class Transaction {
    private LocalDateTime checkedInDate;
    private LocalDateTime checkedOutDate;
    private Spaceship spaceship;
    private double price;

    public Transaction() {
    }

    public Transaction(LocalDateTime checkedInDate, LocalDateTime checkedOutDate, Spaceship spaceship, double price) {
        this.checkedInDate = checkedInDate;
        this.checkedOutDate = checkedOutDate;
        this.spaceship = spaceship;
        this.price = price;
    }

    public Transaction(LocalDateTime checkedInDate, Spaceship spaceship) {
        this.checkedInDate = checkedInDate;
        this.spaceship = spaceship;
    }

    public LocalDateTime getCheckedInDate() {
        return checkedInDate;
    }

    public void setCheckedInDate(LocalDateTime checkedInDate) {
        this.checkedInDate = checkedInDate;
    }

    public LocalDateTime getCheckedOutDate() {
        return checkedOutDate;
    }

    public void setCheckedOutDate(LocalDateTime checkedOutDate) {
        this.checkedOutDate = checkedOutDate;
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

