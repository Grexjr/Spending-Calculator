package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;

public class FlowScreen extends SequentialScreen {

    // Constructor to create a screen that has a flow layout
    // Extends sequential screen because no constraints required for adding components
    public FlowScreen() {
        super();
        setLayout(new FlowLayout());
    }

}
