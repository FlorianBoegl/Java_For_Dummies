package Stuff;

public class Kapital {
    final static double zins = 0.06;
    final static double zahlung = 2400;
    final static int jahre = 10;

    public static void main(String[] args) {
        double kapital = 0.00;
        for (int i = 1; i < jahre; i++) {
            kapital = kapital * (1 + zins) + zahlung;
            System.out.println(i + " Jahr  -  Kapital: " + kapital);
        }
    }
}
