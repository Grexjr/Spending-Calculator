package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OptionsPanel {

    private final JPanel container;
    private final List<JButton> buttons;
    private final LayoutManager layout;

    public OptionsPanel(LayoutManager layout){
        this.container = new JPanel(layout);
        this.buttons = new ArrayList<>();
        this.layout = layout;
    }

    public List<JButton> getButtons() { return buttons; }
    public LayoutManager getLayout() { return layout; }

    // Will need to change this for different layouts but for now its fine, flow layout
    protected void addButtons(){
        for(JButton b : buttons){
            container.add(b);
        }
    }

    protected void addButton(JButton button) {
        buttons.add(button);
    }

    protected JButton createButton(String name, ActionListener action){
        JButton button = new JButton(name);
        button.addActionListener(action);
        return button;
    }

}
