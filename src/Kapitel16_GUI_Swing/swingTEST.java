package Kapitel16_GUI_Swing;

import javax.swing.*;
import java.awt.*;

public class swingTEST extends JFrame{

    private static class PaintPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {

        }
    }

    public swingTEST() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setName("Zeichnen probieren");
        this.setSize(400, 400);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Insets insets = getInsets();
        int links = insets.left;
        int oben = insets.top;
        int breite = getWidth() - insets.left - insets.right;
        int hoehe = getHeight() - insets.top - insets.bottom;
        g.clearRect(links, oben, breite, hoehe);
        g.setColor(Color.CYAN);
        g.fillOval(links + 2, oben + 2, breite - 50, hoehe - 100);

        g.setColor(Color.BLACK);
        g.drawOval(links + 100, oben + 100, breite - 250, hoehe - 250);
        String st = "Hallo";
        g.drawString(st, 200, 200);
    }

    public static void main(String[] args) {
        new swingTEST();
    }
}
