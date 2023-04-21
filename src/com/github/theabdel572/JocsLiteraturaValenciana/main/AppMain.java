package com.github.theabdel572.JocsLiteraturaValenciana.main;

import com.github.theabdel572.JocsLiteraturaValenciana.panels.UpperBarPanel;

import javax.swing.*;
import java.awt.*;

public class AppMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jocs Literatura Valenciana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new UpperBarPanel(), BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
