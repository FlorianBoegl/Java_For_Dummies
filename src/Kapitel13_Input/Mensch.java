package Kapitel13_Input;


public class Mensch {
    String name;
    public Mensch(String pName) {
        name = pName;
    }
    void macheDreckWeg() {
        System.out.println("Willemer macht Dreck weg.");
    }
    void zeigeKatzenklo() {
        System.out.println(name + " zeigt Katze das Katzenklo.");
    }
}

