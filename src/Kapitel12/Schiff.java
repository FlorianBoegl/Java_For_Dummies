package Kapitel12;

public class Schiff {
    private Position pos;
    private boolean gefunden = false;

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public Position getPos() {
        return pos;
    }

    public boolean isGefunden() {
        return gefunden;
    }

    public void setGefunden(boolean gefunden) {
        this.gefunden = gefunden;
    }
}
