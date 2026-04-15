package io.github.grexjr.spendingcalculator.ui;

import io.github.grexjr.spendingcalculator.ui.swing.BoxScreen;
import io.github.grexjr.spendingcalculator.ui.swing.FlowScreen;
import io.github.grexjr.spendingcalculator.ui.swing.Screen;
import io.github.grexjr.spendingcalculator.ui.swing.Window;

import javax.swing.*;

public class SwingUI {
    // Constants
    private static final String TITLE = "Spending Calculator";
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Window window;

    public SwingUI(){
        // Main window of the application
        window = new Window(TITLE,WIDTH,HEIGHT);
        window.setResizable(true);
    }

    public void start(){
        window.show();
        runMainMenu();
    }

    private void runMainMenu() {
        BoxScreen mainMenu = new BoxScreen(BoxLayout.Y_AXIS);
        mainMenu.addButton("Hello");
        mainMenu.addLabel("B");
        window.setView(mainMenu);
    }




}
