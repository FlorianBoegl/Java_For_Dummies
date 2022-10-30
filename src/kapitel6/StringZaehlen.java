package kapitel6;

public class StringZaehlen {

    public static void main(String[] args) {
        String testString = "Hallo mein Name ist Hallo Hallo.";
        String test = "l";
        int len = test.length();
        int len2 = testString.length();
        int zaehler = 0;

        if ( len < len2) {
            for (int i = 0; i < len2 - len; i++) {
                if (test.equals(testString.substring(i, i+len))) zaehler++;
            }
        }
        System.out.println(zaehler);
    }
}
