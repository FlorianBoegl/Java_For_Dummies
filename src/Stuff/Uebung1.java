package Stuff;

public class Uebung1 {
    public static void main(String[] args) {
        boolean b;
        int a = 7, c = 22, d;
        d = (c / a) * 2;
        b = (( c % a) <= (c / a)) && (d == 6);
        if (b) {
            System.out.println("True");
        }
    }
}