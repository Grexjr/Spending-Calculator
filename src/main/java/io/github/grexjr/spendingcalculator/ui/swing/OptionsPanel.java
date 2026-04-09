package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OptionsPanel extends AbstractPanel {

    private final List<JButton> buttons;
    private final boolean isLabeled;
    private int axis;

    private JLabel label;


    ///  Default constructor, defaults to Y Axis and non-labeled
    public OptionsPanel(){
        super(BoxLayout.Y_AXIS);
        this.axis = BoxLayout.Y_AXIS;
        this.buttons = new ArrayList<>();
        this.isLabeled = false;
    }

    ///  Non-labeled options suite constructor
    public OptionsPanel(int axis){
        super(axis);
        this.axis = axis;
        this.buttons = new ArrayList<>();
        this.isLabeled = false;
    }

    /// Full constructor, axis and label
    public OptionsPanel(int axis, boolean isLabeled){
        super(axis);
        this.axis = axis;
        this.buttons = new ArrayList<>();
        // If the box is set to be labeled, prints with default label
        this.isLabeled = isLabeled;
        if(isLabeled){
            this.label = new JLabel("DEFAULT TEXT"); //NOTE move constant
            if(this.axis == BoxLayout.X_AXIS){
                this.label.setAlignmentY(Component.CENTER_ALIGNMENT);
            } else if(this.axis == BoxLayout.Y_AXIS){
                this.label.setAlignmentX(Component.CENTER_ALIGNMENT);
            }
        }
    }

    public List<JButton> getButtons() { return buttons; }

    public void setLabelText(String text) {
        if(label != null) {
            label.setText(text);
        } else {
            System.err.println("LABEL DOES NOT EXIST");
        }
    }

    // Adds label if it exists first for labeled buttons
    public void init() {
        if(label != null){
            container.add(this.label);
        }
        container.setVisible(true);
    }

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
        if(this.axis == BoxLayout.X_AXIS){
            button.setAlignmentY(Component.CENTER_ALIGNMENT);
        } else if (this.axis == BoxLayout.Y_AXIS){
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
        }
        return button;
    }

}
