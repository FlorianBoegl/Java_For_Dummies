package Kapitel9.Termin;

public class Datum2 {
        int tag, monat, jahr;
        public void verschiebe() {
            monat++;
            if (monat>12) {
                monat = 1;
                jahr++;
            }
        }
}
