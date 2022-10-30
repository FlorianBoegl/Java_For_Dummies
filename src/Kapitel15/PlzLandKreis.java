package Kapitel15;

import java.util.HashSet;
public class PlzLandKreis extends LandKreis {

    protected HashSet<String> plzset = new HashSet<>();

    PlzLandKreis(String w, long e) {
        super(w, e);
    }

    public void addPlz(String plz) {
        plzset.add(plz);
    }

    public boolean enthaeltPlz(String plz) {
        return plzset.contains(plz);
    }

    // Hauptprogramm zum Testen der Klasse
    public static void main(String args[]) {
        PlzLandKreis plzKreis = new PlzLandKreis("Recklinghausen",628817);
        plzKreis.addPlz("45601");
        plzKreis.addPlz("45665");
        System.out.println(plzKreis.enthaeltPlz("45666"));
    }
}

