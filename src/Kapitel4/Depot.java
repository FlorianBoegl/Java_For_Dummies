package Kapitel4;

import java.io.PrintStream;

public class Depot {
    public static void main(String[] args) {
        double geld = 2000;
        double gebuehr = 100;
        double zins = 5.5;
        int year = 4;
        double endGeld = xYears(geld, gebuehr, zins, year);
        System.out.printf("%.2f", endGeld);
    }

    public static double nextYear(double geld, double gebuehr, double zins) {
        return geld - gebuehr +  (geld * zins / 100.0);
    }

    public static double xYears(double geld, double gebuehr, double zins, int years) {
        double geldMenge = geld;
        for (int i = 0; i < years; i++) {
            geldMenge = nextYear(geldMenge, gebuehr, zins);
        }
        return geldMenge;
    }
}
