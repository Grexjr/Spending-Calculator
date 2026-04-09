package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;

public class ListPanel {

    private JPanel container;
    private JTextArea listBox;

    public ListPanel() {
        container = new JPanel();
        listBox = new JTextArea();
        container.setLayout(new BorderLayout());
        container.add(listBox,BorderLayout.CENTER);
    }

    public Container getContainer() { return container; }



}
