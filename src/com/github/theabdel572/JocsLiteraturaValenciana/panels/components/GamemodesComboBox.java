package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GamemodesComboBox extends JComboBox<String> {

    public GamemodesComboBox() {
        super(new String[]{"Joc de memòria", "Pedra paper i tisores", "FlashCards"});
        this.setBackground(Color.CYAN);
        this.setForeground(Color.BLACK);
        addActionListener(new Listener());
    }


    public String getSelectedGamemode() {
        return getSelectedItem().toString();
    }

    private class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
