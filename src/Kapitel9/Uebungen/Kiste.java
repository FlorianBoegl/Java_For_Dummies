package Kapitel9.Uebungen;

public class Kiste {

    double breite;
    double hoehe;
    double laenge;

    Kiste(double breite, double hoehe, double laenge) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getVolume() {
        return this.getBreite()*this.getHoehe()*this.getLaenge();
    }

    public static void main(String[] args) {

        Kiste test = new Kiste(12.2, 13.5, 2.1);

        System.out.println(test.getVolume());


    }


}
