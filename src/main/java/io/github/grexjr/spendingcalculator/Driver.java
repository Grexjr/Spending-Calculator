package io.github.grexjr.spendingcalculator;

import io.github.grexjr.spendingcalculator.controller.SpendingCalculator;
import io.github.grexjr.spendingcalculator.inout.AccountIO;
import io.github.grexjr.spendingcalculator.ui.ConsoleUI;

public class Driver {


    public static void main(String[] args){
        SpendingCalculator calculator = new SpendingCalculator();

        calculator.run();
    }

}
