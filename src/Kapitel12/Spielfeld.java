package Kapitel12;

public class Spielfeld extends Flotte {
    final static int MAXX = 9;
    final static int MAXY = 7;

    private final char[][] spielfeld = new char[MAXX][MAXY];

    public Spielfeld() {
        for (int x = 0; x < MAXX; x++) {
            for (int y = 0; y < MAXY; y++) {
                spielfeld[x][y] = '+';
            }
        }
    }

    void enttarneSchiffe() {
        for (int i=0; i < MAXSCHIFF; i++) {
            Position pos = getSchiffPos(i);
            set(pos, SCHIFF);
        }
    }

    public char get(Position pos) {
        return spielfeld[pos.getX()][pos.getY()];
    }

    public void set(Position pos, char zeichen) {
        spielfeld[pos.getX()][pos.getY()] = zeichen;
    }

    public boolean istImSpielfeld(Position pos) {
        int x = pos.getX();
        int y = pos.getY();
        return x>=0 && y>=0 && x<Spielfeld.MAXX && y< Spielfeld.MAXY;
    }
}
