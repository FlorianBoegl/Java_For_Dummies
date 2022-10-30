package kapitel7;

public class Kartenspiel {
    static int KARTENZAHL = 32;

    public static void main(String[] args) {

        int[] blatt = new int[KARTENZAHL];

        for (int i=0; i < KARTENZAHL; i++) {
            blatt[i] = i;
        }

        Kartenspiel a = new Kartenspiel();

    }
}


