package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;

public class BorderScreen extends Screen {

    // Adds a component at the specified border layout region
    public void addComponent(JComponent c, String region) {
        getPanel().add(c,region);
    }

    public JButton addButton(String text, String region) {
        // Instantiate a new button
        JButton b = new JButton(text);
        // Add button to the panel
        addComponent(b,region);
        // Return the button so that you can add action listener
        return b;
    }

    public JTextArea addTextArea(String startingText, int rows, int columns, String region) {
        // Instantiate new text area
        JTextArea jta = new JTextArea(startingText,rows,columns);
        // Add it to the panel
        addComponent(jta,region);
        // Return it to use it to change text, etc.
        return jta;
    }

    public JTextField addTextField(String text, int columns,String region) {
        // Instantiate a new text field
        JTextField jtf = new JTextField(text,columns);
        // Add jtf to the panel
        addComponent(jtf,region);
        // Return it so you can add action listener
        return jtf;
    }

    public JLabel addLabel(String text,String region) {
        // Instantiate
        JLabel jl = new JLabel(text);
        // Add to panel
        addComponent(jl,region);
        // Return to change text, etc.
        return jl;
    }






}
