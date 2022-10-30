package Kapitel9.Uebungen;

public class DatumSetter {

    enum tageMonat {
        JAN (1, "Januar"), FEB (2, "Februar"), MAR (3, "März"),
        APR (4, "April"), MAI (5, "Mai"), JUN (6, "Juni"),
        JUL (7, "Juli"), AUG (8, "August"), SEP (9, "September"),
        OKT ( 10, "Oktober"), NOV (11, "November"), DEZ (12, "Dezember");

        private int monat;
        private String nameMonat;

        tageMonat(int i, String nameMonat) {
            this.monat = i;
            this.nameMonat = nameMonat;
        }

        @Override
        public String toString() {
            return nameMonat;
        }
    }

}
