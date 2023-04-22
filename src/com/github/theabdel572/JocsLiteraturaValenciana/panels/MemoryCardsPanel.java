package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.CardButton;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class MemoryCardsPanel extends JPanel implements AppPanels{
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


    private List<String> shuffleCards(){
        List<String> keys = new ArrayList<>(cardRelations.keySet());
        List<String> values = new ArrayList<>(cardRelations.values());
        keys.addAll(values);
        Collections.shuffle(keys);
        return keys;
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