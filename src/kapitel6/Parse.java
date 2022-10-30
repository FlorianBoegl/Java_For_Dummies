package kapitel6;

class Parse {
    public static void main(String[] args) {
        String input = "haha 1245,00 huhu";
        int pos=0;
        double ergebnis = 0.0;
        char zeichen = input.charAt(pos);
        // wir suchen nach der ersten Ziffer
        while (zeichen < '0' || zeichen > '9' ) {
            pos++;
            zeichen = input.charAt(pos);
        }
        while (zeichen >= '0' && zeichen <= '9') {
            ergebnis *= 10;
            ergebnis += zeichen - '0';
            pos++;
            zeichen = input.charAt(pos);
        }
        if (zeichen=='.' || zeichen==',') { // Nachkommastellen?
            pos++; // Komma ueberspringen
            zeichen = input.charAt(pos);
            double nachkomma = 1.0; // Zaehlt Runden in 10er Potenzen
            while (zeichen>='0' && zeichen <='9') {
                nachkomma *= 10;
                // ab hier alles wie bisher
                ergebnis *= 10;
                ergebnis += zeichen-'0';
                pos++;
                zeichen = input.charAt(pos);
            }
            ergebnis /= nachkomma; // Nun noch das Komma verschieben!
        }
        System.out.println(ergebnis);
    }
}
