package Kapitel9;

public class Datum {
    private int jahr;
    private int monat;
    private int wochentag;
    private int tag;

    public int getTag() {
        return tag;
    }
    public int getJahr() {
        return jahr;
    }
    public int getMonat() {
        return monat;
    }
    public int getWochentag() {
        return wochentag;
    }

    public Datum clone() {
        Datum doppel = new Datum();
        doppel.tag = this.getTag();
        doppel.monat = this.getMonat();
        doppel.jahr = this.getJahr();
        return doppel;
    }
}