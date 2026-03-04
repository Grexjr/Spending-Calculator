package io.github.grexjr.spendingcalculator.controller;

import io.github.grexjr.spendingcalculator.constants.StringConstants;
import io.github.grexjr.spendingcalculator.model.Account;
import io.github.grexjr.spendingcalculator.model.AccountingItem;
import io.github.grexjr.spendingcalculator.ui.ConsoleUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SpendingCalculator {

    private final ConsoleUI ui;
    private final Account account;

    private boolean running;
    private boolean doingTask;


    public SpendingCalculator(){
        this.ui = new ConsoleUI();
        this.running = true;
        this.doingTask = false;

        this.account = new Account();
    }


    public void run(){
        while(running){
            ui.printMainMenu();

            int choice = ui.getIntInput(1,6);

            // Handle choice
            handleMainMenuChoice(choice);
        }
    }

    private void handleMainMenuChoice(int choice){
        switch(choice){
            case 1 -> {
                doingTask = true;
                runAddItem();
            } // Option 1: add items
            case 2 -> {
                doingTask = true;
                printSummary();
            } // Print account summary
            case 3 -> {
                doingTask = true;
                printInstructions();
            }// Run instructions text
            case 4 -> running = false;
            default -> ui.display(StringConstants.ERROR + "SpendingCalculator.35;",true); // Maybe throw exception here
        }
    }

    private void runAddItem(){
        while(doingTask){
            printAccountSoFar();
            ui.display(String.format(StringConstants.NEWLINE),true);
            ui.display(String.format(StringConstants.ASK_FOR_ACCT_ITEM),true);
            ui.display(String.format(StringConstants.NEWLINE),false);
            ui.display(String.format(StringConstants.INPUT),false);
            addItem(ui.getAccountingItemInput());
        }
    }

    private void addItem(String[] values){
        try{
            AccountingItem addition;
            if(values[0].equalsIgnoreCase(StringConstants.BACK_STRING)) {
                doingTask = false;
                return;
            }
            if(values.length == 3){ // Or could catch the out of bounds? B/c if array too small, keeps going
                double amount = Double.parseDouble(values[0].trim());
                DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/[yyyy][yy]");
                LocalDate date = LocalDate.parse(values[1].trim(), format);
                String description = values[2].trim();
                if(amount >= 0){
                    addition = new AccountingItem(amount,date,description,false);
                } else {
                    addition = new AccountingItem(amount,date,description,true);
                }
                account.addAccountingItem(addition);
                ui.display(StringConstants.INCOME_ADDED,true);
            }
        } catch(NumberFormatException | DateTimeParseException e){
            ui.display(StringConstants.INVALID_INCOME_INPUT,true);
        } catch(RuntimeException e){
            e.printStackTrace();
        }
    }

    private void printAccountSoFar(){
        ui.display(String.format(StringConstants.ACCOUNT_TITLE),true);
        for(int i = 0; i < account.getCount(); i++){
            ui.display(
                    String.format(
                            StringConstants.ACCOUNTING_ITEM,
                            account.getItems().get(i).getDate(),
                            account.getItems().get(i).getDescription(),
                            account.getItems().get(i).getAmount()
                    ),
                    true
            );
        }
    }

    private void printTotals(){
        // DISPLAY ====ACCOUNT TOTALS==== (or stats)
        // Then just get the stats of the account in simple list:
        // 1. count, 2. total income, 3. average income over 1 week, 1 month, 1 year, 4. total expense, 5. avg expense same
        // Need to write the calculations for different timeframes; for now just of the account
        ui.display(StringConstants.ACCOUNT_TOTALS, true);
        ui.display(
                String.format(
                        StringConstants.ACCOUNT_TOTAL_ITEMS,
                        account.getTotalIncome(),
                        account.getTotalExpenses(),
                        account.getAverageIncome(),
                        account.getAverageExpense()
                ),
                true
        );
    }

    private void printSummary(){
        while(doingTask){
            ui.display(StringConstants.SUMMARY_TITLE,true);
            ui.display(String.format(StringConstants.NEWLINE),false);
            printAccountSoFar();
            printTotals();

            ui.display(String.format(StringConstants.INPUT),false);
            if(ui.getStringInput().equalsIgnoreCase(StringConstants.BACK_STRING)){
                doingTask = false;
                return;
            }
        }
    }

    private void printInstructions(){
        while(doingTask){
            ui.display(StringConstants.INSTRUCTIONS_HEADER,true);
            ui.display(String.format(StringConstants.NEWLINE),false);
            ui.display(String.format(StringConstants.INSTRUCTIONS),true);

            ui.display(String.format(StringConstants.INPUT),false);
            if(ui.getStringInput().equalsIgnoreCase(StringConstants.BACK_STRING)){
                doingTask = false;
                return;
            }
        }
    }








}
