package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class FlashcardButton extends JButton {

    public FlashcardButton(String text, String[] info) {
        super(text);
        addActionListener(e -> {
            JFrame flashcardFrame = new JFrame();
            JPanel flashcardPanel = new JPanel();
            flashcardPanel.setLayout(new BoxLayout(flashcardPanel, BoxLayout.Y_AXIS));

            Arrays.stream(info).forEach(s -> {
                JLabel label = new JLabel("- " + s);
                Font font = new Font("Consolas", Font.PLAIN, 16);
                label.setFont(font);
                flashcardPanel.add(Box.createVerticalStrut(10));
                flashcardPanel.add(label);
            });

            flashcardFrame.setSize(500, 500);
            flashcardFrame.add(flashcardPanel);
            flashcardFrame.setVisible(true);
        });
        }
    }
