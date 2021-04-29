package src.core;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private ViewContainer mainPanel;
    
    public Frame() {
        setSize(946, 540);
        setTitle("Google2: MainFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(0, 1));

        mainPanel = new ViewContainer(this);

        add(mainPanel);
        setVisible(true);
    }

    public void addPanel(Object panel) {
        mainPanel.addPanel((View)panel);
    }

    public ViewContainer getMainPanel() {
        return mainPanel;
    }
}
