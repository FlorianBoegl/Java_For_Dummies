package Kapitel4;

public class EinMalEins {
    public static void main(String[] args) {
        int zahl = 27;

        System.out.println(zeile(zahl));
    }

    public static String zeile(int a) {
        StringBuilder retString = new StringBuilder();
        int i = 1;
        for (i = 1; i < a; i++) {
            retString.append(i * i);
            retString.append("\t");
            if (i % 6 == 0) retString.append("\n");
        }
        retString.append(i * i);
        return retString.toString();
    }

}
