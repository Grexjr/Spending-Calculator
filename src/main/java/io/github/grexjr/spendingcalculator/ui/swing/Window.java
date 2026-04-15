package io.github.grexjr.spendingcalculator.ui.swing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Window {

    private JFrame frame;
    private JPanel contentPanel;

    public Window(String title, int width, int height) {
        // Initialize the variables
        frame = new JFrame(title);
        // This contentPanel replaces the basic ContentPane panel already in the frame
        contentPanel = new JPanel();

        // Set initial and minimum size of the frame
        frame.setSize(width,height);
        frame.setMinimumSize(new Dimension(width,height));
        // Frame defaults to not resizable to maintain sizing integrity
        frame.setResizable(false);
        // Set close behavior of the frame
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Defaults to Flow Layout--demand it uses BorderLayout
        contentPanel.setLayout(new BorderLayout());

        // Set the content of the frame to our custom panel
        frame.setContentPane(contentPanel);
    }

    public String getTitle() { return frame.getTitle(); }

    public void setTitle(String title) { frame.setTitle(title); }

    public void setSize(int width, int height){
        // Also sets the minimum size in case the user inputs a size smaller than current min to prevent silent fails
        frame.setSize(width,height);
        setMinSize(width,height);
    }
    public void setMinSize(int width, int height) { frame.setMinimumSize(new Dimension(width,height)); }

    public void show() { frame.setVisible(true); }
    public void hide() { frame.setVisible(false); }

    public void close() { frame.dispose(); }

    public void centerOnScreen() { frame.setLocationRelativeTo(null); }

    public void setResizable(boolean resizable) { frame.setResizable(resizable); }

    // TODO bound so it only accepts proper close integers
    public void setCloseBehavior(int closeBehavior) { frame.setDefaultCloseOperation(closeBehavior); }

    public void setView(Screen newView){
        // Clears the content panel of the window, removing the old panel that is on it
        contentPanel.removeAll();
        // Adds the new content panel and all of its components. Defaults to borderLayout center
        contentPanel.add(newView.getPanel());
        // Revalidates sizing and layout of content panel
        contentPanel.revalidate();
        // Repaints all components to update the content panel
        contentPanel.repaint();
    }


}
