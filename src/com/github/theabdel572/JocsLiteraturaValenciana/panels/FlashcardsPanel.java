package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import com.github.theabdel572.JocsLiteraturaValenciana.main.AuthorsInfo;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.FlashcardButton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Set;

public class FlashcardsPanel extends JPanel implements AppPanels{
    private final JFrame parentFrame;

    public FlashcardsPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new GridLayout(10, 10, 10, 10));

        for (AuthorsInfo author : Set.of(AuthorsInfo.values())){
            add(new FlashcardButton(author.getName() + " (" + author.getYear() + ")", author.getInfo()));
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
