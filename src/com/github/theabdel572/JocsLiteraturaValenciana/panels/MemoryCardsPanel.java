package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import com.github.theabdel572.JocsLiteraturaValenciana.main.AuthorsInfo;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.CardButton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class MemoryCardsPanel extends JPanel implements AppPanels{
    private CardButton[] pairClickedCards = new CardButton[2];
    private String[] pairClickedCardsText = new String[2];
    private int cardClicks = 0;
    private final JFrame parentFrame;

    private final Map<String, String> cardRelations = AuthorsInfo.createCardsMap();


    public MemoryCardsPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new GridLayout(4, 4, 10, 10));

        for(String card : shuffleCards()){
            add(new CardButton(this, card));
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

    // Execute the proper actions when a correct pair of cards is clicked.
    public void setPairCompleted(){
        Toolkit.getDefaultToolkit().beep();

        for(CardButton cardButton : getPairClickedCards()){
            cardButton.setEnabled(false);
            cardButton.setPaired(true);
            cardButton.setVisible(false);
        }
    }

    /** Reset the CardButton and String arrays that store the clicked cards.
     * This method is called when the player clicks the second button when trying to pair two cards.
     */
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
        return parentFrame;
    }
}
