package Kapitel13_Input;

import javax.swing.JOptionPane;

public class DiaInputWerfen {
    public static double diaDoubleInput()
            throws NumberFormatException {
        String eingabe="";
        double zahl = 0.0;
        eingabe = JOptionPane.showInputDialog(
                "Bitte eine Zahl!");
        zahl = Double.parseDouble(eingabe);
        return zahl;
    }
    public static void main(String[] args) {
        double zahl = 0.0;
        try {
            zahl = diaDoubleInput();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "War wohl keine tolle Zahl!");
        }
        System.out.println((zahl*zahl));
    }
}