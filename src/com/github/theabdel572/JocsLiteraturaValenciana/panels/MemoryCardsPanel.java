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
    // The CardButton and String arrays that store the clicked cards (which reset after the second card is clicked).
    private CardButton[] pairClickedCards = new CardButton[2];
    private String[] pairClickedCardsText = new String[2];
    // The amount of cards clicked (which resets after the second card is clicked).
    private int cardClicks = 0;

    private final JFrame parentFrame;

    /** The map that stores the cards and their pairs, created with random pair key-values from the AuthorsInfo class.
     * @see AuthorsInfo#createCardsMap()
     */
    private final Map<String, String> cardRelations = AuthorsInfo.createCardsMap();


    public MemoryCardsPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new GridLayout(4, 4, 10, 10));

        // Add the shuffled cards from the cardRelations map to the panel.
        for(String card : shuffleCards()){
            add(new CardButton(this, card));
        }
    }


    // Paint the background image.
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
        // Play a beep sound when a pair is completed.
        Toolkit.getDefaultToolkit().beep();

        for(CardButton cardButton : getPairClickedCards()){
            cardButton.setEnabled(false);
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

    // Shuffle the cards in the cardRelations map.
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
