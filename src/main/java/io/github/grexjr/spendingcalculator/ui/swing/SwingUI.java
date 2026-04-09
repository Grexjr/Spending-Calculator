package io.github.grexjr.spendingcalculator.ui.swing;

import io.github.grexjr.spendingcalculator.ui.UI;

public class SwingUI implements UI {

    private Frame frame;

    public SwingUI(){
        frame = new Frame("Spending Calculator SWING", 800,600);
        frame.setVisible(true);
    }

    @Override
    public void display(String message, boolean newLine){}







}
