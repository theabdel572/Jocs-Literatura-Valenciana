package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import com.github.theabdel572.JocsLiteraturaValenciana.main.MainFrame;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.MemoryCardsPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton{
    private final MainFrame parentFrame;

    public ResetButton(MainFrame parentFrame) {
        super("Reset");
        this.parentFrame = parentFrame;
        addActionListener(new ResetButtonListener());
    }

    private class ResetButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Check if the current panel is a MemoryCardsPanel, so it can reset it.
            if(!(parentFrame.getCenterPanel() instanceof MemoryCardsPanel)){
                return;
            }

            parentFrame.setCenterPanel(new MemoryCardsPanel(parentFrame));
        }
    }
}
