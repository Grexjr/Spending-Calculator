package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;

public class Frame {

    private final JFrame frame;

    public Frame(String title, int width, int height){
        // NOTE - frame defaults to border layout
        this.frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public JFrame getFrame() { return frame; }

    public void setVisible(boolean visible) { frame.setVisible(visible); }
    public void setFocusable(boolean focusable) { frame.setFocusable(focusable); }



}
