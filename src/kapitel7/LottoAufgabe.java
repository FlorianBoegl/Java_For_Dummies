package kapitel7;

import java.util.Arrays;

public class LottoAufgabe {
    static final int LOTTO = 6;
    static int getLotto(int index) {
        int lotto = index * index + 1;
        for (int i = 0; i < index; i++) {
            lotto += i;
        }
        lotto = lotto * lotto;
        lotto = lotto % 49;
        if (lotto == 0) {
            lotto = 49;
        }
        return lotto;
    }

    static void entdopple(int lottoZahl[]) {
        for (int i=0; i<LOTTO; i++) {
            for (int j=0; j<i; j++) {
                if (lottoZahl[i]==lottoZahl[j]) {
                    lottoZahl[i]++;
                    i--;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Das Array wird angelegt
        int lottoZahl[] = new int[LOTTO];
        for (int i=0; i<LOTTO; i++) {
            lottoZahl[i] = getLotto(i);
        }
        // Alternativ zum Testen der Doppelten:
        // int lottoZahl[] = { 12, 12, 12, 13, 23, 23 };
        entdopple(lottoZahl);
        Arrays.sort(lottoZahl);
        // Und alles auf dem Bildschirm ausgeben.
        for (int zahl : lottoZahl) {
            System.out.println(zahl);
        }
    }
}


