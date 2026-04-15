package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;

// Wrapper class for JPanel
public abstract class Screen {

    private JPanel panel;

    // An abstract screen wrapper for JPanel, children inherit to create their own layouts
    public Screen() {
        panel = new JPanel();
    }

    // Protected to not expose JPanel
    protected JPanel getPanel() { return panel; }

    // Protected to prevent outside classes from changing layout
    protected void setLayout(LayoutManager layout) { panel.setLayout(layout); }

    // Formats components of the panel (can be all or individual depending on how it is coded)
    // TODO May want a different method for formatting individual components separately
    protected void setFormatting(JComponent c) {
        // no op by default
    }

}
