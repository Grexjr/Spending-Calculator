package main.java.io.github.grexjr.spendingcalculator.ui;

import java.util.Scanner;

public class ConsoleUI {

    private final Scanner scanner;
    private boolean running = true;

    public ConsoleUI(){
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner(){return scanner;}

    public void setRunning(boolean running){this.running = running;}

    public void printMainMenu(){
        while(running){

        }
    }

    public void printAddExpense(){}

    public void printAddIncome(){}

    private void render(String message){
        System.out.println(message);
    }


}
