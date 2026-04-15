package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;

public class BoxScreen extends SequentialScreen {

    private JPanel panel;

    // A screen with a box layout
    // Components are added sequentially depending on layout
    public BoxScreen(int axis) {
        super();
        panel = getPanel();
        //TODO Bounds to ensure wrong ints are not used/error handling
        setLayout(new BoxLayout(panel, axis));
    }

}
