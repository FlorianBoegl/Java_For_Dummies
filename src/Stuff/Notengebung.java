package Stuff;

import java.util.Random;
import java.util.Scanner;

public class Notengebung {

    public static void main(String[] args) {
        double prozent;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Prozent eingeben (Zahl , Zahl): ");
        while (!(scanner.hasNextDouble())) {
            if(!(scanner.hasNextDouble())) System.out.print("Ungültige Eingabe: ");
            scanner.nextLine();
        }
        prozent = scanner.nextDouble();

        if (prozent < 30) System.out.println("Note 6");
        if (prozent >= 30 && prozent < 50) System.out.println("Note 5");
        if (prozent >= 50 && prozent < 67) System.out.println("Note 4");
        if (prozent >= 67 && prozent < 81) System.out.println("Note 3");
        if (prozent >= 81 && prozent < 92) System.out.println("Note 2");
        if (prozent >= 92) System.out.println("Note 1");
    }
}
