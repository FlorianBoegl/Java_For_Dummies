package Kapitel13_Input;


public class Katze {
    private boolean istNochDa = true;

    public long getZyklus() {
        return zyklus;
    }

    private long zyklus = 0;
    private int attacken = 0;
    // lebtNochBeiEuch ist die Schleifenbedingung für das
    // Katzenleben.
    boolean lebtNochBeiEuch() {
        zyklus++; // Die Schleifenrunde wird gezählt
        return istNochDa;
    }
    void schlaeft() throws KatzenException {
        // Jedes 7. Mal muss sie sich übergeben.
        if (zyklus%7==0) {
            throw new KatzeKotztException();
        }
    }
    void frisst() throws KatzenException {
        // Jedes 3. Mal muss sie sich entleeren.
        if (zyklus%3==0) {
            throw new KatzeKacktException();
        }
    }
    void schnurrt() throws KatzenException {
        // Die Katze tut nur lieb. Jedes 3. Mal kratzt sie.
        if (zyklus%13==0) {
            attacken++;
            System.out.println(this.getZyklus());
            System.out.println("Autsch!");
            throw new KatzeKratztException(this);
        }
    }
    // Bilanzauswertung
    int getAttackenZahl() {
        return attacken;
    }
    // Reparatur
    void mussZumTierarzt() {
        System.out.println("Zum Tierarzt");
    }
    // Die Hoffnung!
    void mussInsHeim() {
        this.istNochDa = false;
        System.out.println("Katze weg!!!!");
    }
}