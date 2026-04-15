package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;

import java.awt.*;

import static java.awt.Component.CENTER_ALIGNMENT;

public class BoxScreen extends SequentialScreen {

    private int axis;
    private float alignment;

    // A screen with a box layout
    // Components are added sequentially depending on layout
    public BoxScreen(int axis) {
        super();

        // Reference to axis for proper alignment setting (either x or y depending on alignment value)
        this.axis = axis;
        // Defaults to center alignment
        this.alignment = JComponent.CENTER_ALIGNMENT;

        // Check if the axis value is valid, if not throw exception
        if(axis < 0 || axis > 3) {
            throw new IllegalArgumentException("Invalid axis value: " + axis + ". Must be 0-3.");
        }

        // If so, continue with setting layout
        setLayout(new BoxLayout(getPanel(), axis));
    }

    @Override
    public void formatComponent(JComponent c) {
        // Details alignment formatting depending on axis value
        if(axis == BoxLayout.X_AXIS) c.setAlignmentY(alignment);
        if(axis == BoxLayout.Y_AXIS) c.setAlignmentX(alignment);
    }

    // Sets the alignment variable, must be done before the components are added
    public void setAlignment(float alignment) {
        // If invalid argument, throw exception
        if (alignment < 0.0 || alignment > 1.0) {
            throw new IllegalArgumentException("Invalid alignment value: " + alignment + ". Must be 0.0-1.0.");
        }
        // Question: should this be declared in the signature to be caught?
        if (getPanel().getComponents().length != 0){
            throw new IllegalStateException("Invalid call to setAlignment(): must be called before components added.");
        }
        // If all is valid, set the alignment
        this.alignment = alignment;
    }

}
