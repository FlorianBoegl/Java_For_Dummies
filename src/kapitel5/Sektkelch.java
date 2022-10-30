package kapitel5;

public class Sektkelch {

    public static void main(String[] args) {
        int hoehe = 4;
        int radius = hoehe * 2 + 1;
        int zaehler = 3;

        zeichneKelch(radius, zaehler);
        zeichneStiel(radius, hoehe);
        zeichneFuss(radius);

    }

    public static void zeichneKelch(int radius, int zaehler) {
        if (zaehler <= radius) {
            zeichneKelch(radius, zaehler + 2);
            zeichneLeer(radius, zaehler);
            zeichneStern(radius, zaehler);
            zeichneLeer(radius, zaehler);
            System.out.println("");
        }
    }

    public static void zeichneStiel(int radius, int hoehe) {
        if (hoehe > 0) {
            zeichneStiel(radius, hoehe - 1);
            for (int i = 1; i <= radius; i++) {
                if (i != (radius + 1) / 2) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void zeichneFuss(int radius) {
        for (int i = 0; i < radius; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void zeichneLeer(int radius, int zaehler) {
        for (int i = 0; i < (radius - zaehler) / 2; i++) {
            System.out.print(" ");
        }
    }

    public static void zeichneStern(int radius, int zaehler) {
        for (int i = 0; i < zaehler; i++) System.out.print("*");
    }
}
    /**
     * class Sektkelch {
     *     static void zeichneChar(int anzahl, char zeichen) {
     *         for (int i=0; i<anzahl; i++) {
     *             System.out.print(zeichen);
     *         }
     *     }
     *
     *     static void zeichneKelch(int stiel) {
     *         for (int i=0; i<stiel; i++) {
     *             zeichneChar(i, ' ');
     *             zeichneChar((stiel-i)*2+1, '*');
     *             System.out.println();
     *         }
     *     }
     *
     *     static void zeichneStiel(int stiel) {
     *         for (int i=0; i<stiel; i++) {
     *             zeichneChar(stiel, ' ');
     *             zeichneChar(1, '*');
     *             System.out.println();
     *         }
     *     }
     *
     *     static void zeichneFuss(int stiel) {
     *         zeichneChar(stiel*2+1, '*');
     *     }
     *
     *     static void zeichneSektkelch(int stiel) {
     *         zeichneKelch(stiel);
     *         zeichneStiel(stiel);
     *         zeichneFuss(stiel);
     *     }
     *
     *     public static void main(String[] args) {
     *         zeichneSektkelch(4);
     *     }
     * }
     */



