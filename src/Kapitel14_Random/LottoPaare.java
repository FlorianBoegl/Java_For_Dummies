package Kapitel14_Random;

import java.util.Random;

public class LottoPaare {

    public static void main(String[] args) {

        final int MAX = 6;
        int[] lotto = new int[MAX];
        int[] lottoZahlen = { 13, 3, 35, 27, 11, 45};
        int gewonnen = 0;
        int maxZaheler = 0;
        int minZahl = 49;
        int maxZahl = 0;
        boolean check;
        int insert;
        Random random = new Random();
        for (int ziehungen = 0; ziehungen < 140000000; ziehungen++) {
            for (int i = 0; i < lotto.length; i++) {
                check = true;
                insert = random.nextInt(49) + 1;
                for (int j = 0; j < i; j++) {
                    if (insert == lotto[j]) {
                        check = false;
                        break;
                    }
                }
                if (check) lotto[i] = insert;
                else i--;
            }
            int zaehler = 0;
            for (int i = 0; i < MAX; i++) {
                if(lotto[i] == lottoZahlen[i]) zaehler++;
                if (minZahl > lotto[i]) minZahl = lotto[i];
                if (maxZahl < lotto[i]) maxZahl = lotto[i];
            }
            if(zaehler == 6) gewonnen++;
            if (zaehler > maxZaheler) maxZaheler = zaehler;
        }
        System.out.println(gewonnen);
        System.out.println(maxZaheler);
        System.out.println(maxZahl);
        System.out.println(minZahl);
    }
}