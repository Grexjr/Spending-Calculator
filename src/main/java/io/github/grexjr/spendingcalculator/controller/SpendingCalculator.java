package io.github.grexjr.spendingcalculator.controller;

import io.github.grexjr.spendingcalculator.constants.StringConstants;
import io.github.grexjr.spendingcalculator.model.Account;
import io.github.grexjr.spendingcalculator.model.AccountingItem;
import io.github.grexjr.spendingcalculator.ui.ConsoleUI;
import io.github.grexjr.spendingcalculator.ui.UI;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SpendingCalculator {

    private final ConsoleUI ui;
    private final Account account;

    private boolean running;
    private boolean adding;


    public SpendingCalculator(){
        this.ui = new ConsoleUI();
        this.running = true;
        this.adding = false;

        this.account = new Account();
    }


    public void run(){
        while(running == true){
            ui.printMainMenu();

            int choice = ui.getIntInput(1,6);

            // Handle choice
            handleMainMenuChoice(choice);
        }
    }

    private void handleMainMenuChoice(int choice){
        switch(choice){
            case 1 -> {
                adding = true;
                runIncomes();
            } // Option 1: add incomes
            case 2 -> {System.out.println("success 2");}
            case 3 -> {System.out.println("success 3");}
            case 4 -> {} // Print account summary
            case 5 -> {}// Run instructions text
            case 6 -> running = false;
            default -> ui.display(StringConstants.ERROR + "SpendingCalculator.35;",true); // Maybe throw exception here
        }
    }

    private void runIncomes(){
        while(adding == true){
            ui.display(String.format(StringConstants.ASK_FOR_ACCT_ITEM,StringConstants.INCOME), true);
            ui.display(String.format(StringConstants.INPUT),false);
            addIncome(ui.getAccountingItemInput());
        }

    }

    private void addIncome(String[] values){
        try{
            if(values[0].equalsIgnoreCase(StringConstants.BACK_STRING)) {
                adding = false;
                return;
            }
            if(values.length == 3){ // Or could catch the out of bounds? B/c if array too small, keeps going
                double amount = Double.parseDouble(values[0].trim());
                DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/[yyyy][yy]");
                LocalDate date = LocalDate.parse(values[1].trim(), format);
                String description = values[2].trim();
                AccountingItem addition = new AccountingItem(amount, date, description, false);
                account.addAccountingItem(addition);
                ui.display(StringConstants.INCOME_ADDED,true);
            }
        } catch(NumberFormatException | DateTimeParseException e){
            ui.display(StringConstants.INVALID_INCOME_INPUT,true);
        } catch(RuntimeException e){
            e.printStackTrace();
        }
    }

    private void runExpenses(){

    }

    private void addExpense(){

    }








}
