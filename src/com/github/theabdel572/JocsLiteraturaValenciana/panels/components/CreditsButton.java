package com.github.theabdel572.JocsLiteraturaValenciana.panels.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class CreditsButton extends JButton {
    public CreditsButton() {
        super("Crèdits");
        addActionListener(new Listener());
    }

    private final class Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane creditsPane = new JOptionPane();
            creditsPane.setMessage("Desenvolupat per Abdel.\nDiscord: theabdel572#2908");
            creditsPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            creditsPane.setOptions(new Object[]{new JButton("Github"){
                {
                    addActionListener(e -> {
                        try {
                            Desktop.getDesktop().browse(new URI("https://github.com/theabdel572/Jocs-Literatura-Valenciana"));
                        } catch (IOException | URISyntaxException ioException) {
                            JOptionPane.showMessageDialog(CreditsButton.this, "Error al obrir el navegador", "Error", JOptionPane.ERROR_MESSAGE);
                        }
            });}}});

            JDialog dialog = creditsPane.createDialog(CreditsButton.this, "Autor");
            dialog.setVisible(true);
        }
    }
}
