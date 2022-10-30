package Kapitel9.Uebungen;

public class PunktLinieTest {

    public static void main(String[] args) {
        Punkt a = new Punkt(1,-1);
        Punkt b = new Punkt(0,0);
        Linie c = new Linie(a,b);

        System.out.println(c.getLaenge());

    }
}
