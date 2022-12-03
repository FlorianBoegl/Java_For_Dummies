package XX_TestSomeStuff;

public class ErsteRechnung {
    public static void main(String[] args) {
        // Quadrat ausrechnen mit Eingabe von Zahl
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Bitte Seitenlaenge eingeben: ");
        int seitenlaenge = scanner.nextInt();
        int quadrat = seitenlaenge * seitenlaenge;
        System.out.println(quadrat);
    }
}