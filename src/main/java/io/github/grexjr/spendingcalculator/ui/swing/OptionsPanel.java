package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OptionsPanel {

    private final JPanel container;
    private final List<JButton> buttons;
    private LayoutManager layout;

    ///  Box layout constructor
    public OptionsPanel(int axis){
        this.container = new JPanel();
        this.buttons = new ArrayList<>();
        this.layout = new BoxLayout(container,axis);
    }

    public JPanel getContainer() { return container;}

    public void init() {
        container.setVisible(true);
    }

    public OptionsPanel(LayoutManager layout){
        this.container = new JPanel(layout);
        this.buttons = new ArrayList<>();
        this.layout = layout;
    }

    public List<JButton> getButtons() { return buttons; }
    public LayoutManager getLayout() { return layout; }
    public void setLayout(LayoutManager layout) { this.layout = layout;}

    // Will need to change this for different layouts but for now its fine, flow layout
    protected void renderButtons(){
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
