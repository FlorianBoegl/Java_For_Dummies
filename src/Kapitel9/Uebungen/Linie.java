package Kapitel9.Uebungen;

public class Linie {
    private Punkt a;
    private Punkt b;
    private double laenge;
    Linie(Punkt a, Punkt b) {
        this.a = a;
        this.b = b;
        this.laenge = laenge();
    }

    public Punkt getA() {
        return a;
    }

    public Punkt getB() {
        return b;
    }

    public double getLaenge() {
        return laenge;
    }

    double laenge() {
        int xRichtung = this.getB().getX() - this.getA().getX();
        int yRichtung = this.getB().getY() - this.getA().getY();
        double a = Math.pow((double)xRichtung, 2) + Math.pow((double)yRichtung, 2);
        return Math.sqrt(a);
    }
}