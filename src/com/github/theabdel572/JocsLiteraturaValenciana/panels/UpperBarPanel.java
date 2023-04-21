package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.GamemodesComboBox;

import javax.swing.*;
import java.awt.*;

public class UpperBarPanel extends JPanel {
    public UpperBarPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        setBackground(Color.GREEN);
        add(new GamemodesComboBox());
    }


}
