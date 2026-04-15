package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;

public class FlowScreen extends SequentialScreen {

    // Just here for easier reference
    private JPanel panel;

    // Constructor to create a screen that has a flow layout
    // Extends sequential screen because no constraints required for adding components
    public FlowScreen() {
        super();
        panel = getPanel();
        setLayout(new FlowLayout());
    }

}
