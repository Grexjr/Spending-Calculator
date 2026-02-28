package io.github.grexjr.spendingcalculator.model;

import java.util.ArrayList;

public class Account {

    private final ArrayList<AccountingItem> items;
    private int count;
    private double averageIncome, averageExpense, totalIncome, totalExpenses;

    public Account(){
        items = new ArrayList<>();
        count = 0;
        averageIncome = 0;
        averageExpense = 0;
        totalIncome = 0;
        totalExpenses = 0;
    }




}
