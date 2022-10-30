package Kapitel13;

import javax.swing.*;
import java.util.regex.*;
import java.awt.HeadlessException;

public class Eingabe {
    public static void main(String[] args) {

        String eingabe = "";
        double zahl = 0.0;
        boolean eingabeProblem = false;

        do {
            eingabeProblem = false;
            eingabe = JOptionPane.showInputDialog("Bitte Zahl eingeben: ");
            try {
                if (eingabe == null) {
                    JOptionPane.showMessageDialog(null, "Abgebrochen");
                    throw new NullPointerException("Abgebrochen");
                }
                else zahl = Double.parseDouble(eingabe);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                /*
                String fehler = e.toString();
                JOptionPane.showMessageDialog(null, fehler);
                 */
                eingabeProblem = true;
            } catch (HeadlessException e) {
                throw new HeadlessException();
            }
        } while (eingabeProblem);
        zahl = Math.pow(zahl,2);
        zahl = Math.round(zahl * 100.0);
        zahl = zahl / 100;
        System.out.print(zahl);


        //regex
        /*if (Pattern.matches("[0-9]*"+ "." + "[0-9]*", eingabe)) {
            zahl = Double.parseDouble(eingabe);
            System.out.print(Math.pow(zahl, 2));
        }
        else throw new RuntimeException("Falsche eingabe");
    }
    */
    }
}
