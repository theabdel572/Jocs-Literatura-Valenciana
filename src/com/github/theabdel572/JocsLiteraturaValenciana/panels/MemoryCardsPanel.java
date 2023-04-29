package com.github.theabdel572.JocsLiteraturaValenciana.panels;

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

    private final Map<String, String> cardRelations = Map.ofEntries(
            Map.entry("Pompeu Fabra", "<html>Va ser el principal <br>artífex de la normativització<br> de la llengua catalana moderna.</html>"),
            Map.entry("Ramon Llull", "<html>Va ser un escriptor, <br>filòsof, teòleg i <br>missioner mallorquí.</html>"),
            Map.entry("Francesc Eiximenis", "<html>Va ser un escriptor <br>franciscà de la <br>Corona d’Aragó.</html>"),
            Map.entry("Bernat Metge", "<html>Va ser un escriptor, <br>traductor i primer representant <br>de l’humanisme en les <br>lletres catalanes.</html>"),
            Map.entry("Joanot Martorell", "<html>Va ser un escriptor <br>valencià, autor de <br>Tirant lo Blanc.</html>"),
            Map.entry("Anselm Turmeda", "<html>Va ser un escriptor, <br>traductor i poeta <br>mallorquí.</html>"),
            Map.entry("Sant Vicent Ferrer", "<html>Va ser un religiós <br>dominic valencià que va <br>influir decisivament en el <br>Compromís de Casp i en la <br>resolució del Cisma d’Occident.</html>"),
            Map.entry("Jordi de Sant Jordi", "<html>Va ser un poeta <br>cortesà i militar.</html>")
            /*Map.entry("Ausias March", "Va ser un poeta i cavaller valencià medieval."),
            Map.entry("Joan Roís de Corella", "Va ser senyor de l’alqueria de Beneito i senyor de Miraflor (La Marina Alta)."),
            Map.entry("Jaume Roig", "Va ser un metge i escriptor valencià, famós per ser l’autor d’Espill o Llibre de les dones, una de les obres més rellevants de la literatura catalana medieval.")*/
    );

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
            /* Other options:
            cardButton.setBackground(Color.GREEN);
            cardButton.setAction(null);
            */
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
        return parentFrame;
    }
}
