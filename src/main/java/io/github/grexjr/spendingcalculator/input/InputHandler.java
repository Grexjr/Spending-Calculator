package io.github.grexjr.spendingcalculator.input;

import io.github.grexjr.spendingcalculator.constants.StringConstants;
import io.github.grexjr.spendingcalculator.ui.UI;

import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler(){
        scanner = new Scanner(System.in);
    }

    public String readString(UI display){
        // While true loop continuously calls unless broken out of
        while(true) {
            String input = scanner.nextLine().trim();
            if (!input.isBlank()) return input;
            display.display(StringConstants.BLANK_STRING_INVALID);
        }
    }

    public int readInt(UI display, int min, int max){
        while(true){
            try {
                int input = Integer.parseInt(scanner.nextLine().trim());
                if(min <= input && input <= max) return input;
                display.display(StringConstants.INT_OUT_OF_BOUNDS);
            } catch (NumberFormatException e) {
                display.display(StringConstants.INVALID_INT_INPUT);
            }
        }
    }








}
