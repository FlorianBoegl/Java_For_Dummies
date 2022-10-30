package Kapitel9;

public class Kalender {

    static class Monat {
        String name = "";
        int nr = 0;
        int tage = 0;
        Monat next = null;
    }

    static Monat kalender = null;

    public static void main(String[] args) {
        String[] monatsName = {"Jan", "Feb", "Mrz", "Apr",
                "Mai", "Jun", "Jul", "Aug",
                "Sep", "Okt", "Nov", "Dez"};
        int[] monatsTage = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        int monate = monatsTage.length;
        kalender = new Monat();
        kalender.name = monatsName[0];
        kalender.tage = monatsTage[0];
        kalender.nr = 1;
        Monat erster = kalender;
        Monat lauf = kalender;
        for (int i = 0; i < monate; i++) {
            Monat neu = new Monat();
            neu.name = monatsName[i];
            neu.tage = monatsTage[i];
            neu.nr = i + 1;
            lauf.next = neu;
            lauf = neu;
        }
        lauf.next = kalender;
        int anzahl = 0;
        do {
            String str = javax.swing.JOptionPane.showInputDialog("Wie viele Monate?");
            if (str == null || str.isEmpty()) {
                anzahl = Integer.parseInt(str);
            }
            else {
            anzahl = Integer.parseInt(str);
            }

            for (int j = 0; j < anzahl; j++) {
                Monat monat = naechster();
                zeige(monat);
            }
        } while (anzahl > 0);
    }

    static Monat naechster() {
        kalender = kalender.next;
        return kalender;
    }

    static void zeige(Monat monat) {
        if (monat != null) {
            System.out.print(monat.name);
            System.out.print(" - ");
            System.out.println(monat.tage);
        }
    }
}