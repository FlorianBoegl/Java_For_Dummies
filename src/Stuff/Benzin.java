package Stuff;

import java.io.IOException;
import java.util.Scanner;

public class Benzin {
    private final static double UNTERGRENZE = 5;  // declare a constant
    private final static double OBERGRENZE = 10;  // declare a constant

    public static void main(String[] args)
            throws NumberFormatException, IOException {
        float a = (float)1.2e-12;
        String name;
        double kmh, liter, verbrauch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Name eingeben: ");
        name = scanner.nextLine();
        System.out.print("Bitte km eingeben: ");
        kmh = scanner.nextDouble();
        System.out.print("Bitte Liter eingeben: ");
        liter = scanner.nextDouble();
        verbrauch = liter / kmh * 100;
        System.out.println("Verbrauch = " + verbrauch);
        if (verbrauch > OBERGRENZE) System.out.println(name + ", Du bist ein Energieverschwender!!");
        if (verbrauch <= UNTERGRENZE) System.out.println(name + ", Du bist ein Schwindler!!");
    }
}