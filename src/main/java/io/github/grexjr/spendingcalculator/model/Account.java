package io.github.grexjr.spendingcalculator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Account {

    private final List<AccountingItem> items;
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

    public List<AccountingItem> getItems() {
        return items;
    }

    public int getCount() {
        return count;
    }

    public double getAverageIncome() {
        return averageIncome;
    }

    public double getAverageExpense() {
        return averageExpense;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void addAccountingItem(AccountingItem toAdd){
        items.add(toAdd);
        count += 1;
        averageIncome = averageIncome();
        averageExpense = averageExpense();
        totalIncome = sumIncome();
        totalExpenses = sumExpense();
    }

    public void updateAccount(){
        count++;
        averageIncome = averageIncome();
        averageExpense = averageExpense();
        totalIncome = sumIncome();
        totalExpenses = sumExpense();
    }

    private double averageIncome(){
        List<AccountingItem> incomes = items.stream()
                .filter(i -> !i.isExpense())
                .toList();
        if(incomes.isEmpty()) return 0;
        return (sumIncome()/incomes.size());
    }

    private double averageExpense(){
        List<AccountingItem> expenses = items.stream()
                .filter(AccountingItem::isExpense)
                .toList();
        if(expenses.isEmpty()) return 0;
        return (sumExpense()/expenses.size());
    }

    private double sumIncome(){
        List<AccountingItem> incomes = items.stream()
                .filter(i -> !i.isExpense())
                .toList();
        double sum = 0.00;
        for(AccountingItem i : incomes){
            sum += i.getAmount();
        }
        return sum;
    }

    private double sumExpense(){
        List<AccountingItem> expenses = items.stream()
                .filter(AccountingItem::isExpense)
                .toList();
        double sum = 0.00;
        for(AccountingItem i : expenses){
            sum += i.getAmount();
        }
        sum *= -1; // Turn it negative
        return sum;
    }




}
