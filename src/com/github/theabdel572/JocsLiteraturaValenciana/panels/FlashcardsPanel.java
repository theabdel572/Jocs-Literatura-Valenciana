package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FlashcardsPanel extends JPanel implements AppPanels{
    private final JFrame parentFrame;



    public FlashcardsPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new GridLayout(10, 10, 10, 10));
        for (int i = 0; i < 11; i++){
            add(new JButton("Flashcards"));
        }
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        try {
            page.drawImage(ImageIO.read(new File("src/com/github/theabdel572/JocsLiteraturaValenciana/resources/background1.png")), 0, 0, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public JPanel getPanel() {
        return this;
    }

    @Override
    public JFrame getParentFrame() {
        return parentFrame;
    }
}
