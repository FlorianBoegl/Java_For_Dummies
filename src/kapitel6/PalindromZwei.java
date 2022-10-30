package kapitel6;

public class PalindromZwei {


    public static void main(String[] args) {

        String test = "caaaaaaaaaaabbbbbaaaaaaaaaaac";
        boolean printThis = checkPalindrom(test);
        System.out.println(printThis);

    }

    public static boolean checkPalindrom(String pali) {
        char a, b;
        for (int i = 0; i < pali.length()/2; i++) {
            a = pali.charAt(i);
            b = pali.charAt(pali.length() - 1 - i);
            if (a != b) return false;
        }

        return true;
    }

}
