package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.AppPanels;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.FlashcardsPanel;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.MemoryCardsPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GamemodesComboBox extends JComboBox<String> {
    private final AppPanels parentPanel;

    //Constructor that gets the parent panel of the JComboBox as an argument.
    public GamemodesComboBox(AppPanels parentPanel) {
        super(new String[]{"Joc de memòria", "Pedra paper i tisores", "FlashCards"});
        this.parentPanel = parentPanel;
        //Setting Properties
        this.setBackground(Color.CYAN);
        this.setForeground(Color.BLACK);

        addActionListener(new Listener());
    }

    private void changeGamemodePanel(AppPanels panel){
        JFrame parentFrame = parentPanel.getParentFrame();
        Container contentPane = parentFrame.getContentPane();
        BorderLayout layout = (BorderLayout) contentPane.getLayout();
        contentPane.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        contentPane.add((Component) panel, BorderLayout.CENTER);
        parentFrame.revalidate();
        parentFrame.repaint();
    }


    public String getSelectedGamemode() {
        return getSelectedItem().toString();
    }

    private class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame parentFrame = parentPanel.getParentFrame();
            switch (getSelectedGamemode()){
                case "Joc de memòria":
                    changeGamemodePanel(new MemoryCardsPanel(parentFrame));
                    break;
                case "Pedra paper i tisores":
                    break;
                case "FlashCards":
                    changeGamemodePanel(new FlashcardsPanel(parentFrame));
                    break;
            }
        }
    }
}
