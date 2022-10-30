package Kapitel9.Uebungen;

class AddDatum {
    private int tag, monat, jahr;
    AddDatum(int pTag, int pMonat, int pJahr) {
        tag=pTag; monat=pMonat; jahr=pJahr;
    }
    private int tageImMonat[]
            = { 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31 };
    public void add(int tage) {
        if (tage>0) {
            this.tag += tage;
            while (tag > tageImMonat[monat-1]) {
                // Im Februar auf Schaltjahr achten!
                if (monat==2) {
                    if ((jahr%4)==0) {
                        tag--;
                    }
                    if (((jahr%100)==0)&&((jahr%400)!=0)) {
                        tag++;
                    }
                }
                tag -= tageImMonat[monat-1];
                monat++;
                if (monat>12) {
                    monat -= 12;
                    jahr++;
                }
            }
        }
    }
    void print() {
        System.out.print("" + tag + "."+  monat + "." + jahr);
    }
    public static void main(String[] args) {
        AddDatum tag = new AddDatum(18, 2, 1564);
        tag.add(66);
        tag.print();
    }
}

