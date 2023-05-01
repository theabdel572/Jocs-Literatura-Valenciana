package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.designs.ButtonDesign;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class FlashCardButton extends ButtonDesign {

    /** Creates a button with the author name and the birthdate as text of the button
     * and the info as a flashcard in a new window.
     * @param authorName The name of the author as a String.
     * @param info An array containing the info of the author.
     */
    public FlashCardButton(String authorName, String[] info) {
        setText(authorName);

        addActionListener(e -> {
            JFrame flashcardFrame = new JFrame();
            JPanel flashcardPanel = new JPanel();
            flashcardFrame.setTitle(authorName);
            flashcardPanel.setLayout(new BoxLayout(flashcardPanel, BoxLayout.Y_AXIS));

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            textArea.setFont(new Font("Consolas", Font.PLAIN, 16));
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setOpaque(false);

            // Add the info array to the text area formatting it and removing html tags.
            Arrays.stream(info).forEach(s -> textArea.append(("- " + s + "\n\n")
                    .replaceAll("<html>", "").replaceAll("</html>", "")));

            // Adding a space between the top of the window and the text area.
            flashcardPanel.add(Box.createVerticalStrut(10));
            flashcardPanel.add(textArea);

            flashcardFrame.setIconImage(new ImageIcon(getClass().getResource("/com/github/theabdel572/JocsLiteraturaValenciana/resources/icon.png")).getImage());
            flashcardFrame.setSize(700, 700);
            flashcardFrame.add(flashcardPanel);
            flashcardFrame.setVisible(true);
        });
        }
    }
