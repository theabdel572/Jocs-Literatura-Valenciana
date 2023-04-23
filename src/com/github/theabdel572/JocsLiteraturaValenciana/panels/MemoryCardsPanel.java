package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.CardButton;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class MemoryCardsPanel extends JPanel implements AppPanels{
    private CardButton[] pairClickedCards = new CardButton[2];
    private String[] pairClickedCardsText = new String[2];
    private final Map<String, String> cardRelations = Map.ofEntries(
            Map.entry("a", "b"),
            Map.entry("c", "d"),
            Map.entry("e", "f")
    );
    private int cardClicks = 0;
    private final JFrame frame;

    public MemoryCardsPanel(JFrame frame) {
        this.frame = frame;
        setLayout(new GridLayout(4, 4, 10, 10));
        setBackground(Color.RED);

        for(String card : shuffleCards()){
            add(new CardButton(this, card));
        }
    }


    // Execute the proper actions when a correct pair of cards is clicked.
    public void setPairCompleted(){
        for(CardButton cardButton : getPairClickedCards()){
            cardButton.setEnabled(false);
            cardButton.setPaired(true);
            cardButton.setBackground(Color.GREEN);
            cardButton.setAction(null);
        }
    }

    // Reset the CardButton and String arrays that store the clicked cards.
    public void resetCardButtonArrays(){
        resetPairClickedCards();
        resetPairClickedCardsText();
    }

    // Disable all the CardButtons in the panel.
    public void disableCardButtons(){
        Arrays.stream(getComponents()).iterator().forEachRemaining(component -> {
            if(component instanceof CardButton){
                component.setEnabled(false);
            }
        });
    }

    // Shuffle the cards.
    private List<String> shuffleCards(){
        List<String> keys = new ArrayList<>(cardRelations.keySet());
        keys.addAll(cardRelations.values());
        Collections.shuffle(keys);
        return keys;
    }
    
    public String[] getPairClickedCardsText() {
        return pairClickedCardsText;
    }

    public void resetPairClickedCardsText() {
        this.pairClickedCardsText = new String[2];
    }

    public CardButton[] getPairClickedCards() {
        return pairClickedCards;
    }

    public void resetPairClickedCards() {
        this.pairClickedCards = new CardButton[2];
    }

    public Map<String, String> getCardRelations() {
        return cardRelations;
    }

    public int getCardClicks() {
        return cardClicks;
    }

    public void addCardClick() {
        this.cardClicks+=1;
    }

    public void resetCardClicks() {
        this.cardClicks = 0;
    }

    @Override
    public JPanel getPanel() {
        return this;
    }

    public JFrame getParentFrame() {
        return frame;
    }
}
