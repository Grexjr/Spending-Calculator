package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractPanel {

    protected final JPanel container;
    protected LayoutManager layout;

    /**
     * Constructor for constructing boxLayout panels
     */
    public AbstractPanel(int axis){
        this.container = new JPanel();
        container.setLayout(new BoxLayout(container,axis));
    }

    /**
     * Constructor for constructing all other panel types
     * @param layout The layout to give this panel
     */
    public AbstractPanel(LayoutManager layout){
        this.container = new JPanel();
        container.setLayout(layout);
    }

    protected Container getContainer() { return container; }
    protected LayoutManager getLayout() { return layout; }

}
