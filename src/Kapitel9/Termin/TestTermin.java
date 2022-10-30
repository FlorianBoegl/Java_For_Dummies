package Kapitel9.Termin;

public class TestTermin {
    public static void main(String[] args) {
        Datum2 abgabe = new Datum2();
        abgabe.tag = 12;
        abgabe.monat = 12;
        abgabe.jahr = 2012;
        abgabe.verschiebe();
        System.out.print(abgabe.monat);
        System.out.print("/");
        System.out.println(abgabe.jahr);
    }
}

