package com.github.theabdel572.JocsLiteraturaValenciana.main;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.AppPanels;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.MemoryCardsPanel;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.UpperBarPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    // Creates the frame. It's the main window of the application.
    public MainFrame() {
        super("Jocs Literatura Valenciana v1.0.0");
        // Some Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setIconImage(new ImageIcon("src/com/github/theabdel572/JocsLiteraturaValenciana/resources/icon.png").getImage());
        // Adding Panels
        add(new UpperBarPanel(this), BorderLayout.NORTH);
        add(new MemoryCardsPanel(this), BorderLayout.CENTER);

        setVisible(true);
    }

    // Gets the panel in the center of the frame.
    public AppPanels getCenterPanel(){
        Container contentPane = getContentPane();
        BorderLayout layout = (BorderLayout) contentPane.getLayout();
        return (AppPanels) layout.getLayoutComponent(BorderLayout.CENTER);
    }

    /**
     * Sets the panel in the center of the frame.
     * @param panel The panel to set. Must be a subclass of AppPanels.
     */
    public void setCenterPanel(AppPanels panel){
        Container contentPane = getContentPane();
        BorderLayout layout = (BorderLayout) contentPane.getLayout();
        contentPane.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        contentPane.add((Component) panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

}
