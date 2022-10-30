package kapitel6;

public class Selbstlaute {

    public static void main(String[] args) {

        String test = "Maustuollppena";
        int len = test.length();
        System.out.println();
        for (int i = 0; i < len; i++) {
            if ((test.charAt(i) == 'a') || (test.charAt(i) == 'A')
                    || (test.charAt(i) == 'E') || (test.charAt(i) == 'e')
                    || (test.charAt(i) == 'I') || (test.charAt(i) == 'i')
                    || (test.charAt(i) == 'O') || (test.charAt(i) == 'o')
                    || (test.charAt(i) == 'U') || (test.charAt(i) == 'u'))
                test = test + test.charAt(i);
        }
        System.out.println(test);

    }
}
