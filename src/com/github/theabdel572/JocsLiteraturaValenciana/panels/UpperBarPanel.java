package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.GamemodesComboBox;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class UpperBarPanel extends JPanel implements AppPanels{
    private final JFrame frame;

    public UpperBarPanel(JFrame frame) {
        this.frame = frame;
        //Setting Properties
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        //Adding Components
        add(new GamemodesComboBox(this));
    }


    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        try {
            page.drawImage(ImageIO.read(new File("src/com/github/theabdel572/JocsLiteraturaValenciana/resources/background1.png")), 0, 0, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
