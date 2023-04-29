package com.github.theabdel572.JocsLiteraturaValenciana.main;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.AppPanels;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.MemoryCardsPanel;
import com.github.theabdel572.JocsLiteraturaValenciana.panels.UpperBarPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Jocs Literatura Valenciana");
        // Some Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        // Adding Panels
        add(new UpperBarPanel(this), BorderLayout.NORTH);
        add(new MemoryCardsPanel(this), BorderLayout.CENTER);

        setVisible(true);
    }

    public AppPanels getCenterPanel(){
        Container contentPane = getContentPane();
        BorderLayout layout = (BorderLayout) contentPane.getLayout();
        return (AppPanels) layout.getLayoutComponent(BorderLayout.CENTER);
    }

    public void setCenterPanel(AppPanels panel){
        Container contentPane = getContentPane();
        BorderLayout layout = (BorderLayout) contentPane.getLayout();
        contentPane.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        contentPane.add((Component) panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

}
