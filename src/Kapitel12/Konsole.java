package Kapitel12;
import java.util.Scanner;

public class Konsole {
    public Position eingeben() {
        int x = -1, y = -1;
        System.out.print("\nPosition eingeben : ");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.next();
        if (eingabe.length() > 1) {
            char cx = eingabe.charAt(0);
            if (cx >= 'A' && cx <= 'A' + Spielfeld.MAXX) {
                x = (int) (cx - 'A');
            }
            char cy = eingabe.charAt(1);
            if (cy >= '1' && cy <= '1' + Spielfeld.MAXY) {
                y = (int) (cy - '1');
            }
        }
        return new Position(x, y);
    }

    public void zeige(Spielfeld spiel) {
        System.out.println();
        System.out.print("  ");
        for (int x = 0; x < Spielfeld.MAXX; x++) {
            System.out.print(" " + (char) ('A' + x));
        }
        for (int y = 0; y < Spielfeld.MAXY; y++) {
            System.out.println();
            System.out.print("" + (y + 1) + " ");
            for (int x = 0; x < Spielfeld.MAXX; x++) {
                Position pos = new Position(x, y);
                System.out.print(" " + spiel.get(pos));
            }
        }
    }
}
