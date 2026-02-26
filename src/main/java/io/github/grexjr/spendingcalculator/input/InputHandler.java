package io.github.grexjr.spendingcalculator.input;

import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler(){
        scanner = new Scanner(System.in);
    }

    public String readString(){
        // While true loop continuously calls unless broken out of
        while(true) {
            String input = scanner.nextLine().trim();
            if (!input.isBlank()) return input;
            // Display
        }
    }








}
