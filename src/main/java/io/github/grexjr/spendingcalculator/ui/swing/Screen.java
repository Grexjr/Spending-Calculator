package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;

// Wrapper class for JPanel
public class Screen {

    private JPanel panel;

    public Screen() {
        panel = new JPanel();
    }

    JPanel getPanel() { return panel; }

    public void addLabel(String text) {
        JLabel label = new JLabel(text);
        panel.add(label);
    }


}
