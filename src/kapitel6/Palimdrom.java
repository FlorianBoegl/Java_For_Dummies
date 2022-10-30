package kapitel6;

class Palindrom {
    public static void main(String[] args) {
        String pali = "ein neger mit gazelle zagt im regen nie";
        int vor=0;
        int rueck = pali.length();
        boolean istPalindrom = true;    // die Ergebnisvariable
        while (istPalindrom && rueck > 0) {
            rueck--;
            // Ueberspringen der Leerzeichen
            while (rueck >=0 && pali.charAt(rueck) == ' ') rueck--;
            while (vor < pali.length() && pali.charAt(vor) == ' ') vor++;

            // Pruefung auf Palindrom
            if ( pali.charAt(vor) != pali.charAt(rueck) ) {
                istPalindrom = false;
            }
            vor++;
        }
        // Ergebnisausgabe: true oder false
        System.out.println(istPalindrom);
    }
}
