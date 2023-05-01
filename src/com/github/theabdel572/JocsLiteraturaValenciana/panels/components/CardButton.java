package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.MemoryCardsPanel;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.designs.ButtonDesign;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Map;

public class CardButton extends ButtonDesign {
    private final String text;
    private final MemoryCardsPanel parentPanel;

    public CardButton(MemoryCardsPanel parentPanel, String text) {
        this.text = text;
        this.parentPanel = parentPanel;
        addActionListener(new Listener());

        // Changing some decoration of the button.
        setBorderColor(new Color(50, 144, 255));
        setColor(Color.WHITE);
        setColorOver(new Color(225, 239, 255));
    }

    /** The actions to execute when the player clicks the second button when trying to pair two cards.
     * It disables all the buttons in the parent panel and starts the timer that will reset the text of the buttons.
     * It also resets the card button arrays in the parent panel.
     * @param timer The timer that will reset the text of the buttons.
     */
    private void onSecondButtonClickedActions(Timer timer){
        parentPanel.disableCardButtons();

        timer.setRepeats(false);
        timer.start();

        parentPanel.resetCardButtonArrays();
    }

    private class Listener implements ActionListener {
        /* A timer that iterates over all the CardButtons in the parent panel and sets their text to "".
         It also resets the card clicks to 0 and enables all the buttons in the parent panel again.

         The process is: the player clicks the first button, the text is set to the card's text and the card clicks
            are incremented by 1. Then the player clicks the second button, the text is set to the card's text and the
            card clicks are incremented by 1. Then the timer starts and after 1.5 seconds it resets the text of the
            buttons and enables them again.
         */
        Timer timer = new Timer(1500, actions -> {
            Arrays.stream(parentPanel.getComponents()).iterator().forEachRemaining(component -> {
                if(!(component instanceof CardButton)){
                    return;
                }
                // After the timer is done, the text of the buttons is reset to "" and they are enabled again.
                // This occurs after the player clicks the second button when trying to pair two cards.
                ((CardButton) component).setText("");
                component.setEnabled(true);
            });
            // Reset the card clicks to 0 so the player can click two more cards and start the process again.
            parentPanel.resetCardClicks();
        });

        public void actionPerformed(ActionEvent e) {
            // Show the text of the button and add 1 to the card clicks when pressed.
            setText(text);
            parentPanel.addCardClick();

            switch (parentPanel.getCardClicks()) {
                /*
                When clicking the first button, add the text of the button to the pairClickedCardsText array
                and add the button to the pairClickedCards array.
                 */
                case 1 -> {
                    parentPanel.getPairClickedCardsText()[0] = text;
                    parentPanel.getPairClickedCards()[0] = (CardButton) e.getSource();
                }

                case 2 -> {
                    /*
                    Adding the text of the button to the pairClickedCardsText array and adding the button to the
                     pairClickedCards array, so we can compare them later with the first button.
                    */
                    parentPanel.getPairClickedCardsText()[1] = text;
                    parentPanel.getPairClickedCards()[1] = (CardButton) e.getSource();

                    /*
                    Check if the two cards clicked are a pair by comparing if the first card is a value
                     instead of a key in the cardRelations map.
                     */
                    for (Map.Entry<String, String> entry : parentPanel.getCardRelations().entrySet()) {
                        if (entry.getValue().equals(parentPanel.getPairClickedCardsText()[0])) {
                            if (entry.getKey().equals(parentPanel.getPairClickedCardsText()[1])) {
                                // Set the buttons invisible if they are a pair and play a sound.
                                parentPanel.setPairCompleted();
                            }
                            onSecondButtonClickedActions(timer);
                            return;
                        }
                    }

                    // Check if the two cards clicked are a pair by comparing if the first card is a key on the map.
                    if(parentPanel.getCardRelations().get(parentPanel.getPairClickedCardsText()[0]).equals(parentPanel.getPairClickedCardsText()[1])){
                        parentPanel.setPairCompleted();
                        onSecondButtonClickedActions(timer);
                        return;
                    }

                    // If the two cards clicked are not a pair, resets the text of the buttons and enables them again.
                    onSecondButtonClickedActions(timer);
                }
            }
        }
    }
}
