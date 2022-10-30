package Stuff;

import java.util.Random;

public class TypBerechnung {

    public static void main(String[] args) {
        char zeichen = '0';
        int zahl = 12;
        float flies = (float)12e-2;
        double ergebnis =  flies / zeichen;
        System.out.println(ergebnis + flies);
        int a =  (int)(200 * Math.random());
        Random rand = new Random(100);
        rand.doubles();
        if (a < 10) {
            zahl++;
        } else if (a < 100){
            zahl--;
        } else if (a < 1e5) {
            zahl++;
        } else {
            zahl--;
        }
        System.out.println(zahl);
        System.out.println(false);
    }
}