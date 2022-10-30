package Kapitel12;

public class Position {
    final int NORD = 0;
    final int SUED = 1;
    final int OST = 2;
    final int WEST = 3;
    final int NORDOST = 4;
    final int NORDWEST = 5;
    final int SUEDOST = 6;
    final int SUEDWEST = 7;

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRichtung(Position vgl) {
        int richtung = -1;
        if (x == vgl.x && y < vgl.y) {
            richtung = NORD;
        } else if (x == vgl.x && y > vgl.y) {
            richtung = SUED;
        } else if (x < vgl.x && y == vgl.y) {
            richtung = OST;
        } else if (x > vgl.x && y == vgl.y) {
            richtung = WEST;
        }
        // Für die Diagonalen werden die Differenzen
        // berechnet
        int diffx = x - vgl.x;
        int diffy = y - vgl.y;
        if (diffx == diffy && x < vgl.x) {
            richtung = NORDOST;
        } else if (diffx == diffy && x > vgl.x) {
            richtung = SUEDWEST;
        } else if (diffx == -diffy && x < vgl.x) {
            richtung = SUEDOST;
        } else if (diffx == -diffy && x > vgl.x) {
            richtung = NORDWEST;
        }
        return richtung;
    }

    @Override
    public boolean equals(Object obj) {
        Position pos = (Position) obj;
        return this.x == pos.x && this.y == pos.y;
    }
}
