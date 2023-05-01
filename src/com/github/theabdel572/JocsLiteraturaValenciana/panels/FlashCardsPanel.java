package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import com.github.theabdel572.JocsLiteraturaValenciana.main.AuthorsInfo;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.FlashCardButton;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class FlashCardsPanel extends JPanel implements AppPanels{
    private final JFrame parentFrame;

    public FlashCardsPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new GridLayout(10, 10, 10, 10));

        // Creating all the FlashCardButtons (taking all the information from the AuthorsInfo enum) and adding them to the panel.
        for (AuthorsInfo author : Set.of(AuthorsInfo.values())){
            add(new FlashCardButton(author.getName() + " (" + author.getBirthYear() + ")", author.getInfo()));
        }
    }

    // Painting the background image.
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        page.drawImage(
                new ImageIcon(getClass().getResource("/com/github/theabdel572/JocsLiteraturaValenciana/resources/background1.png")).getImage(),
                0, 0, null);
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
