package Kapitel14_Random;

import java.util.Random;

public class WuerfelWerfen {
    public static void main(String[] args) {
        Random zufall = new Random();
        // int wurf = Math.abs(zufall.nextInt()) % 6 + 1;
        int wurf = Math.abs(zufall.nextInt(6)) + 1;
        System.out.println(wurf);
    }
}

