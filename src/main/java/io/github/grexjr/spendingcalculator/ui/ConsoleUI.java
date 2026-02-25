package io.github.grexjr.spendingcalculator.ui;

import io.github.grexjr.spendingcalculator.constants.StringConstants;

import java.util.Scanner;

public class ConsoleUI {

    private static final int MAIN_MENU_SPACING = 5;
    private final Scanner scanner;

    public ConsoleUI(){
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner(){return scanner;}

    public void printMainMenu(){
        render(StringConstants.TITLE_STRING);
        render(StringConstants.BYLINE);
        for(int i = 0; i < MAIN_MENU_SPACING; i++){
            render(StringConstants.NEWLINE);
        }
        String options = String.format(
                StringConstants.TITLE_OPTION_FORMAT,
                StringConstants.TITLE_OPTIONS[0],
                StringConstants.TITLE_OPTIONS[1],
                StringConstants.TITLE_OPTIONS[2],
                StringConstants.TITLE_OPTIONS[3]
        );
        render(options);
    }

    public void printAddExpense(){}

    public void printAddIncome(){}

    private void render(String message){
        System.out.println(message);
    }

}
