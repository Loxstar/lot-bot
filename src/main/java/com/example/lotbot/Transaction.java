package com.example.lotbot;

import java.time.LocalDateTime;

// TODO: Finish fields, introduce getters/setters
public class Transaction {
    private LocalDateTime checkedInDate;
    private LocalDateTime checkedOutDate;

    public Transaction(LocalDateTime checkedInDate, LocalDateTime checkedOutDate) {
        this.checkedInDate = checkedInDate;
        this.checkedOutDate = checkedOutDate;
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
}
