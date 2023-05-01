package com.github.theabdel572.JocsLiteraturaValenciana.panels.components.designs;

import javax.swing.border.Border;
import java.awt.*;

public class RoundedBorder implements Border {

    private final int radius;
    private final boolean invisibleBorder;


    public RoundedBorder(int radius, boolean invisibleBorder) {
        this.invisibleBorder = invisibleBorder;
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if(invisibleBorder){return;}
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}