package Stuff;

public class Zeichenzeiger {

    public static void main(String[] args) {

        char zeichen = 'A';
        zeichen++;
        System.out.println(zeichen);
        zeichen -= 16;
        System.out.println(zeichen);
        zeichen += 32;
        System.out.println(zeichen);

    }
}
