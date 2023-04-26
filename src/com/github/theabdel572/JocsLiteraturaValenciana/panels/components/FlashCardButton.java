package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class FlashCardButton extends JButton {

    public FlashCardButton(String text, String[] info) {
        super(text);
        addActionListener(e -> {
            JFrame flashcardFrame = new JFrame();
            JPanel flashcardPanel = new JPanel();
            flashcardFrame.setTitle(text);
            flashcardPanel.setLayout(new BoxLayout(flashcardPanel, BoxLayout.Y_AXIS));

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            textArea.setFont(new Font("Consolas", Font.PLAIN, 16));
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setOpaque(false);

            Arrays.stream(info).forEach(s -> textArea.append("- " + s + "\n\n"));

            flashcardPanel.add(Box.createVerticalStrut(10));
            flashcardPanel.add(textArea);

            flashcardFrame.setSize(500, 500);
            flashcardFrame.add(flashcardPanel);
            flashcardFrame.setVisible(true);
        });
        }
    }
