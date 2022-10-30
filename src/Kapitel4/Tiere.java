package Kapitel4;

public class Tiere {

    // meine Loesung
    public static void zaehlen() {
        int gesamt = 252;
        int huhn = 16; // 8 * gans = 2 * kuh * 2 , 2 Beine
        int kuh = 16; // 4 * gans = 2 * katze * 4 , 4 Beine
        int katze = 8; // 2 * gans * 4, 4 Beine
        int gans = 2; // 1 * gans * 2, 2 Beine

        int gesamteVerteilungGans = kuh + huhn + katze + gans;

        System.out.println(anzahlGans(gesamt, gesamteVerteilungGans));
    }

    public static int anzahlGans(int gesamt, int verteilung) {
        return gesamt / verteilung;
    }


    // Buch
    public static void main(String[] args) {

        int gaense = 0, huehner = 0, katzen = 0, kuehe = 0, fuesse = 0;
        while (fuesse < 252) {
            gaense++;
            katzen = gaense * 2;
            kuehe = katzen * 2;
            huehner = kuehe * 2;
            fuesse = gaense * 2 + huehner * 2 + katzen * 4 + kuehe * 4;
            System.out.println(fuesse);
        }
        System.out.println("Anzahl Gaense: " + gaense);
        System.out.println(katzen);
        System.out.println(kuehe);
        System.out.println(huehner);


        System.out.println("\n");
        zaehlen();
    }
}
