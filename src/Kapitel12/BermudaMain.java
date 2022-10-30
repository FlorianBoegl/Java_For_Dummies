package Kapitel12;
public class BermudaMain {

    static public void main(String[] args) {
        Spielfeld spiel = new Spielfeld();
        Konsole view = new Konsole();

        boolean spielAbbruch = false;
        while (!spielAbbruch && !spiel.alleSchiffeGefunden()) {
            view.zeige(spiel);
            Position pos = view.eingeben();
            if (spiel.istImSpielfeld(pos)) {
                char zeichen = spiel.suche(pos);
                spiel.set(pos, zeichen);
            } else {
                spielAbbruch = true;
            }
        }
        if (spielAbbruch) {
            System.out.println("Hier waren die Schiffe");
            spiel.enttarneSchiffe();
            view.zeige(spiel);
        } else {
            System.out.println("Gewonnen");
        }
    }
}