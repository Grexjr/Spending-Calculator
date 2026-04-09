package io.github.grexjr.spendingcalculator.ui.swing;

import io.github.grexjr.spendingcalculator.ui.UI;

import javax.swing.*;
import java.awt.*;

public class SwingUI implements UI {

    private AppFrame appFrame;

    public SwingUI(){
        appFrame = new AppFrame("Spending Calculator SWING", 800,600);
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
        appFrame.addPanel(main);
        appFrame.setVisible(true);
    }


    private OptionsPanel createMainMenu() {
        OptionsPanel mainMenu = new OptionsPanel(BoxLayout.Y_AXIS,true);
        mainMenu.addButton(
                mainMenu.createButton("Start",
                        _ -> System.out.println("Started!")));
        mainMenu.addButton(
                mainMenu.createButton("Swap",
                        _ -> System.out.println("Swapped!")));
        mainMenu.setLabelText("MAIN MENU");
        mainMenu.init();
        mainMenu.renderButtons();
        return mainMenu;
    }







}
