package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;
import java.awt.*;

public class AppFrame {

    private final JFrame frame;

    public AppFrame(String title, int width, int height){
        // NOTE - frame defaults to border layout
        this.frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setVisible(boolean visible) { frame.setVisible(visible); }
    public void setFocusable(boolean focusable) { frame.setFocusable(focusable); }

    public void refresh() {
        frame.revalidate();
        frame.repaint();
    }

    // Adds to the frame based on a border layout location
    public void addPanel(AbstractPanel panel, String location){
        frame.add(panel.getContainer(),location);
        refresh();
    }

    // Method for convenience to add something to center immediately
    public void addPanel(AbstractPanel panel){
        frame.add(panel.getContainer(),BorderLayout.CENTER);
        refresh();
    }

    public void removePanel(AbstractPanel panel){
        if(panel == null) {
            System.err.println("ERROR: Panel to be removed not found");
            return;
        }

        Component toRemove = panel.getContainer();
        boolean found = false;

        for(Component c : frame.getContentPane().getComponents()){
            if(c.equals(toRemove)) {
                frame.remove(toRemove);
                found = true;
                break;
            }
        }

        if(!found){
            System.err.println("Panel to remove not found!");
        } else {
            refresh();
        }
    }



}
