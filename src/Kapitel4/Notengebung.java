package Kapitel4;

public class Notengebung {

    public static void main(String[] args) {
        double gesamtpunkteKlausur = 100;
        double punkte = 80;
        int note = noteBerechnen(punkte, gesamtpunkteKlausur);
        System.out.println(noteSchreiben(note));

    }

    public static int noteBerechnen(double punkte, double maximalePunkte) {
        double prozen = prozentNote(punkte, maximalePunkte);
        if (prozen < 30.0) return 6;
        else if (prozen < 50.0) return 5;
        else if (prozen < 67.0) return 4;
        else if (prozen < 81.0) return 3;
        else if (prozen < 92.0) return 2;
        else return 1;
    }

    public static double prozentNote(double punkte, double maximalePunkte) {
        return punkte / maximalePunkte * 100;
    }

    public static String noteSchreiben(int note) {
        return switch (note) {
            case 1 -> "Sehr gut";
            case 2 -> "Gut";
            case 3 -> "Befriedigend";
            case 4 -> "ausreichend";
            case 5 -> "Schlecht";
            case 6 -> "Sehr schlecht";
            default -> "Was schief gelaufen";
        };
    }
}
