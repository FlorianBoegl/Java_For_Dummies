package Kapitel14_Random;

import java.util.Random;

public class LottoZiehen {

    public static void main(String[] args) {
        int[] num = new int[6];
        Random random = new Random();
        int insert;
        boolean check;
        for (int i = 0; i < num.length; i++) {
            check = true;
            insert = random.nextInt(49) + 1;
            for (int j = 0; j < i; j++) {
                if (insert == num[j]) {
                    check = false;
                    break;
                }
            }
            if (check) num[i] = insert;
            else i--;
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}