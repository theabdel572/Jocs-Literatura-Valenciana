package com.github.theabdel572.JocsLiteraturaValenciana.main;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.MemoryCardsPanel;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.UpperBarPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Jocs Literatura Valenciana");
        // Some Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        // Adding Panels
        add(new UpperBarPanel(this), BorderLayout.NORTH);
        add(new MemoryCardsPanel(this), BorderLayout.CENTER);

        setVisible(true);
    }
}
