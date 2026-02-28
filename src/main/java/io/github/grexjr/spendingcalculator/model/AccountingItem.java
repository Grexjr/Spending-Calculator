package io.github.grexjr.spendingcalculator.model;

import java.time.LocalDate;

public class AccountingItem {

    private final double amount;
    private LocalDate date;
    private String description;

    /**
     * Default constructor
     */
    public AccountingItem(){
        amount = 0.00;
        date = LocalDate.parse("01/01/1900");
        description = "Description";
    }

    /**
     * Constructor
     */
    public AccountingItem(double amount, LocalDate date, String description){
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
