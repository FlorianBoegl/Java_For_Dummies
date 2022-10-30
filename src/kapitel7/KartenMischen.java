package kapitel7;
import java.util.Arrays;
import java.util.Random;


public class KartenMischen {
    static final int KARTENZAHL = 52;
    static final int SPIELER = 4;

    static void mische(int[] karten) {
        Random zufall = new Random();
        int tausch, i, j;
        final int MISCH = 10000;
        for (int c = 0; c < MISCH; c++) {
            i = zufall.nextInt(KARTENZAHL);
            j = zufall.nextInt(KARTENZAHL);
            tausch = karten[i];
            karten[i] = karten[j];
            karten[j] = tausch;
        }
    }

    static void zeige(int karte) {
        String[] farbe = { "Kreuz", "Pik" , "Herz", "Karo" };
        String[] wert = {"Ass", "Koenig", "Dame", "Bube", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        System.out.print(wert[karte / 4] + " " + farbe[karte % 4]);
    }

    public static void main(String[] args) {
        int[] blatt = new int[KARTENZAHL];
        for (int i = 0; i < KARTENZAHL; i++) {
            blatt[i] = i;
        }
        mische(blatt);
        int[] a = new int[KARTENZAHL / SPIELER];
        int[] b = new int[KARTENZAHL / SPIELER];
        int[] c = new int[KARTENZAHL / SPIELER];
        int[] d = new int[KARTENZAHL / SPIELER];
        for (int i = 0; i < KARTENZAHL / SPIELER; i++) {
            a[i] = blatt[i * SPIELER];
            b[i] = blatt[i * SPIELER + 1];
            c[i] = blatt[i * SPIELER + 2];
            d[i] = blatt[i * SPIELER + 3];
        }
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        java.util.Arrays.sort(c);
        java.util.Arrays.sort(d);
        print(a);
        print(b);
        print(c);
        print(d);
        System.out.println();
    }

    public static void print(int[] p) {
        for (int j : p) {
            zeige(j);
            System.out.print(" | ");
        }
        System.out.println();
    }
}