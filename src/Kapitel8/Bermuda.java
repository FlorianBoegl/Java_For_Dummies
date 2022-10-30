package Kapitel8;

import java.util.Random;
import java.util.Scanner;

public class Bermuda {
    private final static int LaengeXRichtung = 9;
    private final static int LaengeYRichtung = 7;
    private final static char SCHIFF = 'X';
    private final static int ANZAHLSCHIFFE = 4;

    static void init(char[][] feld,
                     int schiffX[], int schiffY[],
                     boolean schiffGefunden[]) {
        // Spielfeld vorbereiten
        for (int x = 0; x < LaengeXRichtung; x++) {
            for (int y = 0; y < LaengeYRichtung; y++) {
                feld[x][y] = '+';
            }
        }
        // Schiffe vorbereiten und verteilen
        Random zufall = new Random();
        for (int i = 0; i < ANZAHLSCHIFFE; i++) {
            boolean kollidieren = false;
            do {
                int x = Math.abs(zufall.nextInt()) % LaengeXRichtung;
                int y = Math.abs(zufall.nextInt()) % LaengeYRichtung;
                schiffX[i] = x;
                schiffY[i] = y;
                kollidieren = false;
                for (int j = 0; j < i; j++) {
                    if (schiffX[j] == x && schiffY[j] == y) {
                        kollidieren = true;
                        break;
                    }
                }
            } while (kollidieren);
            schiffGefunden[i] = false;
        }
    }

    static boolean sindAlleSchiffeGefunden(
            boolean[] schiffGefunden) {
        boolean gefunden = true;
        for (int i = 0; i < ANZAHLSCHIFFE; i++) {
            if (!schiffGefunden[i]) {
                gefunden = false;
                break;
            }
        }
        return gefunden;
    }

    /**
     * Liefert den Index des Schiffes an dieser Position.
     * Ist dort nichts, gibt die Methode -1 zurück.
     */
    static int getSchiffIndex(int x, int y,
                              int[] schiffX, int[] schiffY) {
        int index = -1;
        int i = 0;
        while(index<0 && i< ANZAHLSCHIFFE) {
            if (schiffX[i]==x && schiffY[i]==y) {
                index = i;
            }
            i++;
        }
        return index;
    }

    /**
     * Ermittle die Anzahl der sichtbaren Schiffe durch
     * Ablaufen der Richtungen
     * @param feld
     * @param posX
     * @param posY
     * @return Richtungen oder Schiff als char
     */
    static char suche(char[][] feld, int posX, int posY,
                      boolean schiffGefunden[],
                      int schiffX[], int schiffY[]) {
        char fund = ' ';
        int funde = 0;
        int index = getSchiffIndex(posX, posY, schiffX, schiffY);
        if (index >= 0) {
            schiffGefunden[index] = true;
            fund = SCHIFF;
        } else {
            for (int diffX = -1; diffX <= 1; diffX++) {
                for (int diffY = -1; diffY <= 1; diffY++) {
                    if (diffX != 0 || diffY != 0) {
                        int x = posX;
                        int y = posY;
                        int zahl = 0;
                        while (zahl==0 && x>=0 && x< LaengeXRichtung
                                && y>=0 && y< LaengeYRichtung) {
                            x += diffX;
                            y += diffY;
                            if (getSchiffIndex(x, y,
                                    schiffX, schiffY)>=0)
                                zahl = 1;
                        }
                        funde += zahl;
                    }
                }
            }
            fund = (char) ('0' + funde);
        }
        return fund;
    }

    static void enttarneSchiffe(char[][] feld,
                                int schiffX[], int schiffY[]) {
        for (int i = 0; i< ANZAHLSCHIFFE; i++) {
            feld[schiffX[i]][schiffY[i]] = SCHIFF;
        }
    }

    // -------------- Interaktion mit dem Anwender ------------

    /**
     * Zeigt das Spielfeld als Zeichenmatrix
     * @param feld - Das Spielfeld muss initialisiert sein
     */
    static void zeige(char[][] feld) {
        System.out.println();
        System.out.print("  ");
        for (int x = 0; x < LaengeXRichtung; x++) {
            System.out.print(" " + (char) ('A' + x));
        }
        // Zuerst zeilenweise
        for (int y = 0; y < LaengeYRichtung; y++) {
            System.out.println();
            System.out.print(""+(y+1)+" ");
            for (int x = 0; x < LaengeXRichtung; x++) {
                System.out.print(" " + feld[x][y]);
            }
        }
    }

    /**
     * Bitte den Anwender um die Position
     * @return int-Array mit x und y
     */
    static int[] eingabe() {
        int[] pos = new int[2];
        pos[0] = -1;
        pos[1] = -1;
        System.out.println("\nPosition eingeben ");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.next();
        if (eingabe.length() > 1) {
            char cx = eingabe.charAt(0);
            if (cx >= 'A' && cx <= 'A' + LaengeXRichtung) {
                pos[0] = (int) (cx - 'A');
            }
            char cy = eingabe.charAt(1);
            if (cy >= '1' && cy <= '1' + LaengeXRichtung) {
                pos[1] = (int) (cy - '1');
            }
        }
        return pos;
    }


    public static void main(String[] args) {
        char[][] feld = new char[LaengeXRichtung][LaengeYRichtung];
        int schiffX[] = new int[ANZAHLSCHIFFE];
        int schiffY[] = new int[ANZAHLSCHIFFE];
        boolean schiffGefunden[] = new boolean[ANZAHLSCHIFFE];
        init(feld, schiffX, schiffY, schiffGefunden);
        int[] pos;
        boolean spielAbbruch = false;
        while (!spielAbbruch &&
                !sindAlleSchiffeGefunden(schiffGefunden)) {
            zeige(feld);
            pos = eingabe();
            char zeichen = suche(feld, pos[0], pos[1],
                    schiffGefunden, schiffX, schiffY);
            if (pos[0]<0 || pos[1]<0) {
                spielAbbruch = true;
            } else {
                feld[pos[0]][pos[1]] = zeichen;
            }
        }
        if (spielAbbruch) {
            System.out.println("Hier waren die Schiffe");
            enttarneSchiffe(feld, schiffX, schiffY);
            zeige(feld);
        } else {
            System.out.println("Gewonnen");
        }
    }
}
