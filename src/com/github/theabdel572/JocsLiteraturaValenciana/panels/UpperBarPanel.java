package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.GamemodesComboBox;

import javax.swing.*;
import java.awt.*;

public class UpperBarPanel extends JPanel implements AppPanels{
    private final JFrame frame;

    public UpperBarPanel(JFrame frame) {
        this.frame = frame;
        //Setting Properties
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        setBackground(Color.GREEN);
        //Adding Components
        add(new GamemodesComboBox(this));
    }

    @Override
    public JPanel getPanel() {
        return this;
    }

    @Override
    public JFrame getParentFrame() {
        return frame;
    }
}
