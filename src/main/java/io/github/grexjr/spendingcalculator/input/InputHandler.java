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








}
