package Kapitel4;

public class Schach {

    public static void main(String[] args) {
        System.out.println(countCorn());

        float korn = 1;
        for (int reihe = 0; reihe < 8; reihe++) {
            for (int spalte = 0; spalte < 8; spalte++) {
                korn = korn * 2;
            }
            System.out.println("" + reihe + ": " + korn);
        }
    }

    public static double countCorn() {
        return Math.pow(2, 64);
    }
}
