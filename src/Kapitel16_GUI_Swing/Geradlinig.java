package Kapitel16_GUI_Swing;

import javax.swing.*;
import java.awt.*;

public class Geradlinig extends JFrame {

    public static void main(String[] args) {
        new Geradlinig();
    }

    public Geradlinig() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Zeichnen mit Java");
        setSize(500, 300);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        // Ermittle die Größe der nutzbaren Zeichenfläche
        Insets insets = getInsets();
        int links  = insets.left;
        int oben   = insets.top;
        int breite = getWidth()-insets.left-insets.right;
        int hoehe  = getHeight()-insets.top-insets.bottom;
        // Fenster freimachen
        g.clearRect(links, oben, breite-1, hoehe-1);
        // Lege die Variablen für die Viertelung fest
        int dist = 16;
        int x = links + dist;
        int y = oben + dist;
        int w = breite/2 - 2*dist;
        int h = hoehe/2 - 2*dist;

        g.setColor(Color.yellow);
        g.fillRect(x, y, w, h);
        g.setColor(Color.black);
        g.drawRect(x, y, w, h);
        String meldung  = "drawRect/fillRect";
        g.drawString(meldung, x, y);

        x = links + breite/2 + dist;
        g.setColor(Color.pink);
        g.fillRoundRect(x, y, w, h, dist*2, dist*2);
        g.setColor(Color.black);
        g.drawRoundRect(x, y, w, h, dist*2, dist*2);
        meldung  = "drawRoundRect/fillRoundRect";
        g.drawString(meldung, x, y);

        x = links + dist;
        y = oben + hoehe/2 + dist;
        g.setColor(Color.BLACK);
        g.draw3DRect(x, y, w, h, true);
        g.setColor(Color.CYAN);
        g.fill3DRect(x, y, w, h, true);
        meldung  = "draw3DRect/fill3DRect";
        g.drawString(meldung, x, y);

        x = links + breite/2 + dist;
        y = oben + hoehe/2 + dist;
        g.setColor(Color.GREEN);
        int xl = x;
        int xr = links + breite - dist;
        int[] px = { xl, xr, xr, xl };
        int yo = y;
        int yu = oben + hoehe - dist;
        int[] py = { yo, yu, yo, yu };
        g.fillPolygon(px, py, px.length);
        g.setColor(Color.BLACK);
        g.drawPolygon(px, py, px.length);
        meldung  = "drawPolygon/fillPolygon";
        g.drawString(meldung, x, y);
    }
}
