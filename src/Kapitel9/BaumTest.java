package Kapitel9;

public class BaumTest {

    static void ausgeben(Baum baum) {
        if (baum != null) {
            ausgeben(baum.kleiner);
            System.out.print(" " + baum.wert);
            ausgeben(baum.groesser);
        }
    }

    static void einsortieren(Baum baum, int zahl) {
        if (baum.wert > zahl) {
            if (baum.kleiner != null) {
                einsortieren(baum.kleiner, zahl);
            } else {
                baum.kleiner = new Baum();
                baum.kleiner.wert = zahl;
            }
        } else {
            if (baum.groesser != null) {
                einsortieren(baum.groesser, zahl);
            } else {
                baum.groesser = new Baum();
                baum.groesser.wert = zahl;
            }
        }
    }

    public static void main(String[] args) {
        java.util.Random zufall = new java.util.Random();
        Baum baum = new Baum();
        baum.wert = zufall.nextInt(100);
        for (int i = 0; i < 12; i++) {
            int zahl = zufall.nextInt(100);
            einsortieren(baum, zahl);
        }
        ausgeben(baum);
    }
}