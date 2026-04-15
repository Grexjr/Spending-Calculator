package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;

public class FlowScreen extends Screen {

    // Just here for easier reference
    private JPanel panel;

    // Constructor to create a screen that has a flow layout
    public FlowScreen() {
        super();
        setLayout(new FlowLayout());
        panel = getPanel();
    }

    public void addScreen(Screen s) {
        panel.add(s.getPanel());
    }

    public JButton addButton(String text) {
        // Instantiate a new button
        JButton b = new JButton(text);
        // Add button to the panel
        panel.add(b);
        // Return the button so that you can add action listener
        return b;
    }

    public JTextArea addTextArea(String startingText, int rows, int columns) {
        // Instantiate new text area
        JTextArea jta = new JTextArea(startingText,rows,columns);
        // Add it to the panel
        panel.add(jta);
        // Return it to use it to change text, etc.
        return jta;
    }

    public JTextField addTextField(String text, int columns) {
        // Instantiate a new text field
        JTextField jtf = new JTextField(text,columns);
        // Add jtf to the panel
        panel.add(jtf);
        // Return it so you can add action listener
        return jtf;
    }

    public JLabel addLabel(String text) {
        // Instantiate
        JLabel jl = new JLabel(text);
        // Add to panel
        panel.add(jl);
        // Return to change text, etc.
        return jl;
    }

}
