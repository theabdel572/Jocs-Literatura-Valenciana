package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.MemoryCardsPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class CardButton extends JButton {
    private final String text;
    private final MemoryCardsPanel parentPanel;


    public CardButton(MemoryCardsPanel parentPanel, String text) {
        super();
        this.text = text;
        this.parentPanel = parentPanel;
        addActionListener(new Listener());
    }

    private class Listener implements ActionListener {

        // A timer that iterates over all the buttons in the parent panel and sets their text to "".
        // It also resets the card clicks to 0.
        Timer timer = new Timer(2000, e1 -> {
            Arrays.stream(parentPanel.getComponents()).iterator().forEachRemaining(component -> {
                if(component instanceof CardButton){
                    ((CardButton) component).setText("");
                }
            });
            parentPanel.resetCardClicks();
        });

        public void actionPerformed(ActionEvent e) {
            if(parentPanel.getCardClicks() == 1){
                timer.setRepeats(false);
                timer.start();
            }
            if(parentPanel.getCardClicks() < 2){
                setText(text);
                parentPanel.addCardClick();
            }
        }
    }
}
