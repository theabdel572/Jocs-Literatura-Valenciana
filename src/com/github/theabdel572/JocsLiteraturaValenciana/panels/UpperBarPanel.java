package com.github.theabdel572.JocsLiteraturaValenciana.panels;

import com.github.theabdel572.JocsLiteraturaValenciana.main.MainFrame;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.CreditsButton;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.GamemodesComboBox;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.components.ResetButton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class UpperBarPanel extends JPanel implements AppPanels{
    private final JFrame parentFrame;

    public UpperBarPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        //Setting Properties
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        //Adding Components
        add(new GamemodesComboBox(this));
        add(new ResetButton((MainFrame) parentFrame));
        add(new CreditsButton());
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
        return parentFrame;
    }
}
