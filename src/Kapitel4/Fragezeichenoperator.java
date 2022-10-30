package Kapitel4;

public class Fragezeichenoperator {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        System.out.println(minimum(b, a));
    }


    public static int minimum(int a, int b) {
        int c;
        boolean d = a < b;
        return c = d ? a : b;
    }

}
