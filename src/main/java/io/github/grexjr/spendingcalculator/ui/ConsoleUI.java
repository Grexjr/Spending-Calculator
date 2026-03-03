package io.github.grexjr.spendingcalculator.ui;

import io.github.grexjr.spendingcalculator.constants.StringConstants;
import io.github.grexjr.spendingcalculator.input.InputHandler;

public class ConsoleUI implements UI {

    private static final int MAIN_MENU_SPACING = 2;
    private final InputHandler input;

    public ConsoleUI(){
        input = new InputHandler();
    }

    @Override
    public void display(String message,boolean newLine) {
        render(message,newLine);
    }

    public String getStringInput(){
        return input.readString(this);
    }

    public int getIntInput(int min, int max){
        return input.readInt(this,min,max);
    }

    public String[] getAccountingItemInput(){return input.readAccountingItem(this);}

    public void printMainMenu(){
        render(StringConstants.TITLE_STRING,true);
        render(StringConstants.BYLINE,true);
        for(int i = 0; i < MAIN_MENU_SPACING; i++){
            render(String.format(StringConstants.NEWLINE),false);
        }

        for(int i = 0; i < StringConstants.TITLE_OPTIONS.length; i++){
            render(String.format(StringConstants.TITLE_OPTION_FORMAT,StringConstants.TITLE_OPTIONS[i]),true);
        }

        render(String.format(StringConstants.NEWLINE),false);

        render(StringConstants.INPUT,false);
    }

    private void render(String message, boolean newLine){
        if(newLine)System.out.println(message);
        else System.out.print(message);
    }

}
