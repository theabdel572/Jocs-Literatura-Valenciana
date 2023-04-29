package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import com.github.theabdel572.JocsLiteraturaValenciana.main.MainFrame;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.AppPanels;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.FlashCardsPanel;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.MemoryCardsPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GamemodesComboBox extends JComboBox<String> {
    private final AppPanels parentPanel;

    //Constructor that gets the parent panel of the JComboBox as an argument.
    public GamemodesComboBox(AppPanels parentPanel) {
        super(new String[]{"Joc de memòria", "FlashCards"});
        this.parentPanel = parentPanel;
        //Setting Properties
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
            MainFrame parentFrame = (MainFrame) parentPanel.getParentFrame();
            switch (getSelectedGamemode()) {
                case "Joc de memòria" -> parentFrame.setCenterPanel(new MemoryCardsPanel(parentFrame));
                case "FlashCards" -> parentFrame.setCenterPanel(new FlashCardsPanel(parentFrame));
            }
        }
    }
}
