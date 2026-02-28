package io.github.grexjr.spendingcalculator.input;

import io.github.grexjr.spendingcalculator.constants.StringConstants;
import io.github.grexjr.spendingcalculator.ui.UI;

import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler(){
        scanner = new Scanner(System.in);
    }

    /**
     * Method to read string input from the user. Trims the String input and prevents blank inputs.
     * @param display
     * @return
     */
    public String readString(UI display){
        // While true loop continuously calls unless broken out of
        while(true) {
            String input = scanner.nextLine().trim();
            if (!input.isBlank()) return input;
            display.display(StringConstants.BLANK_STRING_INVALID,true);
        }
    }

    /**
     * Method to read integer input from the user and validate its integer-nature.
     * @param display
     * @param min
     * @param max
     * @return
     */
    public int readInt(UI display, int min, int max){
        while(true){
            try {
                int input = Integer.parseInt(scanner.nextLine().trim());
                if(min <= input && input <= max) return input;
                display.display(String.format(StringConstants.INT_OUT_OF_BOUNDS,min,max),true);
            } catch (NumberFormatException e) {
                display.display(StringConstants.INVALID_INT_INPUT,true);
            }
        }
    }

    public double readDouble(UI display){
        while(true){
            try{
                double input = Double.parseDouble(scanner.nextLine().trim());
                return input;
            } catch (NumberFormatException e) {
                display.display(StringConstants.INVALID_DOUBLE_INPUT,true);
            }
        }
    }

    public String[] readAccountingItem(UI display){
        while(true){
            String[] values = readString(display).split(",");
            if (values.length != 3) display.display(StringConstants.INVALID_INCOME_INPUT, true);
            return values;
        }
    }








}
