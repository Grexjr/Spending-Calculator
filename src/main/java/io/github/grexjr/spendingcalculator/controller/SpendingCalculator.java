package io.github.grexjr.spendingcalculator.controller;

import io.github.grexjr.spendingcalculator.constants.StringConstants;
import io.github.grexjr.spendingcalculator.ui.ConsoleUI;
import io.github.grexjr.spendingcalculator.ui.UI;

public class SpendingCalculator {

    private final ConsoleUI ui;

    private boolean running;


    public SpendingCalculator(){
        this.ui = new ConsoleUI();
        this.running = true;
    }


    public void run(){
        while(running == true){
            ui.printMainMenu();

            int choice = ui.getIntInput(1,4);

            // Handle choice
            handleMainMenuChoice(choice);
        }
    }

    private void handleMainMenuChoice(int choice){
        switch(choice){
            case 1 -> {System.out.println("success 1");}
            case 2 -> {System.out.println("success 2");}
            case 3 -> {System.out.println("success 3");}
            case 4 -> running = false;
            default -> ui.display(StringConstants.ERROR + "SpendingCalculator.35;"); // Maybe throw exception here
        }
    }








}
