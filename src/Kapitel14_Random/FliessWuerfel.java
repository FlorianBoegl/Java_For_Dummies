package Kapitel14_Random;

import java.util.Random;

public class FliessWuerfel {
    public static void main(String[] args) {
        Random zufall = new Random();
        double wurf = Math.floor(
                Math.abs(
                        zufall.nextDouble()) * 6 + 1);
        System.out.println(wurf);
    }
}

