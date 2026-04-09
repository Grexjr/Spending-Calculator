package io.github.grexjr.spendingcalculator.ui.swing;

import io.github.grexjr.spendingcalculator.ui.UI;

import javax.swing.*;
import java.awt.*;

public class SwingUI implements UI {

    private Frame frame;
    private Container content;

    public SwingUI(){
        frame = new Frame("Spending Calculator SWING", 800,600);
        content = frame.getContent();
    }

    @Override
    public void display(String message, boolean newLine){
        // Checks if the contentPane of the frame has a displayer (custom class probably)
        // If so, write text to that displayer
        // If not, error: attempted but failed to write string to screen
    }

    // Start method that runs when the program is started, sets the content pane to the first screen of the program
    public void start(){
        OptionsPanel main = createMainMenu();
        frame.setContent(main.getContainer());
        frame.setVisible(true);
    }

    public void swapScreen(Container newScreen) {
        frame.setContent(newScreen);
        frame.getContent().revalidate();
        frame.getContent().repaint();
    }

    private OptionsPanel createMainMenu() {
        OptionsPanel mainMenu = new OptionsPanel(BoxLayout.Y_AXIS);
        mainMenu.addButton(
                mainMenu.createButton("Start",
                        _ -> System.out.println("Started!")));
        mainMenu.addButton(
                mainMenu.createButton("Swap",
                        _ -> swapScreen(
                                new ListPanel().getContainer()
                        ))
        );
        mainMenu.renderButtons();
        return mainMenu;
    }







}
