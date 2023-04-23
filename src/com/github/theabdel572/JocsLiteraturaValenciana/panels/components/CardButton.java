package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.MemoryCardsPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Map;

public class CardButton extends JButton {
    private boolean isPaired = false;
    private final String text;
    private final MemoryCardsPanel parentPanel;


    public CardButton(MemoryCardsPanel parentPanel, String text) {
        super();
        this.text = text;
        this.parentPanel = parentPanel;
        addActionListener(new Listener());
    }

    public void setPaired(boolean paired) {
        isPaired = paired;
    }

    public boolean isPaired() {
        return isPaired;
    }

    // The actions to execute when the player clicks the second button when trying to pair two cards.
    private void onSecondButtonClickedActions(Timer timer){
        parentPanel.disableCardButtons();

        timer.setRepeats(false);
        timer.start();

        parentPanel.resetCardButtonArrays();
    }

    private class Listener implements ActionListener {
        // A timer that iterates over all the buttons in the parent panel and sets their text to "".
        // It also resets the card clicks to 0.
        Timer timer = new Timer(1500, actions -> {
            Arrays.stream(parentPanel.getComponents()).iterator().forEachRemaining(component -> {
                if(!(component instanceof CardButton)){
                    return;
                }
                ((CardButton) component).setText("");

                if(!((CardButton) component).isPaired()){
                    component.setEnabled(true);
                }
            });
            parentPanel.resetCardClicks();
        });

        public void actionPerformed(ActionEvent e) {
            if(parentPanel.getCardClicks() < 2){
                setText(text);
                parentPanel.addCardClick();
            }

            switch (parentPanel.getCardClicks()) {
                case 1 -> {
                    parentPanel.getPairClickedCardsText()[0] = text;
                    parentPanel.getPairClickedCards()[0] = (CardButton) e.getSource();
                }
                case 2 -> {
                    parentPanel.getPairClickedCardsText()[1] = text;
                    parentPanel.getPairClickedCards()[1] = (CardButton) e.getSource();

                    for (Map.Entry<String, String> entry : parentPanel.getCardRelations().entrySet()) {
                        if (entry.getValue().equals(parentPanel.getPairClickedCardsText()[0])) {
                            String key = entry.getKey();
                            if(key.equals(parentPanel.getPairClickedCardsText()[1])){
                                parentPanel.setPairCompleted();
                                onSecondButtonClickedActions(timer);
                                return;
                            }

                            onSecondButtonClickedActions(timer);
                            return;
                        }
                    }

                    if(parentPanel.getCardRelations().get(parentPanel.getPairClickedCardsText()[0]).equals(parentPanel.getPairClickedCardsText()[1])){
                        parentPanel.setPairCompleted();
                        onSecondButtonClickedActions(timer);
                        return;
                    }

                    onSecondButtonClickedActions(timer);
                }
            }
        }
    }
}
