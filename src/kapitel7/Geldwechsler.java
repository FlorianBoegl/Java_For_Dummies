package kapitel7;

public class Geldwechsler {
    public static void main(String[] args) {
        int muenzen[] = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int betrag = 784;
        int anzahl;
        for (int i = 0; i < muenzen.length; i++) {

            anzahl = betrag / muenzen[i];
            betrag = betrag % muenzen[i];

            /**int anzahl = 0;
            while (betrag >= muenzen[i]) {
                betrag -= muenzen[i];
                anzahl++;
            }
             */
            System.out.println(""+anzahl+" Münzen zu "+muenzen[i]);
        }
    }
}

