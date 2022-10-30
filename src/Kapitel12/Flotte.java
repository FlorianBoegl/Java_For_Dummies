package Kapitel12;

import java.util.Random;

class Flotte {
    final static char SCHIFF = 'X';
    final static int MAXSCHIFF = 4;

    private Schiff schiff[];

    public Flotte() {
        // Schiffe vorbereiten
        schiff = new Schiff[MAXSCHIFF];
        // Schiffe verteilen
        Random zufall = new Random();
        for (int i = 0; i < MAXSCHIFF; i++) {
            schiff[i] = new Schiff();
            boolean kollidieren = false;
            do {
                Position pos = new Position(
                        Math.abs(zufall.nextInt()) % Spielfeld.MAXX,
                        Math.abs(zufall.nextInt()) % Spielfeld.MAXY);
                schiff[i].setPos(pos);
                kollidieren = false;
                for (int j = 0; j < i; j++) {
                    if (schiff[j].getPos().equals(pos)) {
                        kollidieren = true;
                    }
                }
            } while (kollidieren);
        }
    }

    public char suche(Position suchPos) {
        final int RICHTUNGEN = 8;
        int richtung[] = new int[RICHTUNGEN];
        for (int i = 0; i < MAXSCHIFF; i++) {
            Position pos = schiff[i].getPos();
            if (pos.equals(suchPos)) {
                schiff[i].setGefunden(true);
                return SCHIFF;
            } else {
                int richt = suchPos.getRichtung(pos);
                if (richt>=0) {
                    richtung[richt] = 1;
                }
            }
        }
        int anzahl = 0;
        for (int i=0; i<RICHTUNGEN; i++) {
            anzahl += richtung[i];
        }
        char ergebnis = (char) ('0' + anzahl);
        return ergebnis;
    }

    public boolean alleSchiffeGefunden() {
        boolean gefunden = true;
        for (int i = 0; i < MAXSCHIFF; i++) {
            if (schiff[i].isGefunden() == false) {
                gefunden = false;
            }
        }
        return gefunden;
    }

    public Position getSchiffPos(int i) {
        return schiff[i].getPos();
    }
}