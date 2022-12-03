public class Vergleichbar implements Comparable<Vergleichbar> {
    String vorname, nachname;
    public int compareTo(Vergleichbar vgl) {
        int vergleichsWert = 0;
        vergleichsWert = nachname.compareTo(vgl.nachname);
        if (vergleichsWert==0) {
             vergleichsWert = vorname.compareTo(vgl.vorname);
        }
        return vergleichsWert;
    }
    public String toString() {
        return vorname + " " + nachname;
    }
    Vergleichbar(String vor, String nach) {
        vorname = vor; nachname = nach;
    }
}
