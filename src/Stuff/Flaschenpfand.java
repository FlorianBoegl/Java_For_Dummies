package Stuff;

public class Flaschenpfand {

 public static void main(String[] args) {

     final int flaschenAnzahl = 12;
     final double colaPreis = 0.5;
     final double flaschenPfand = 0.2;
     final double kastenPfand = 2.0;
     double totalPrice = 0.0;
     totalPrice = flaschenAnzahl * (colaPreis + flaschenPfand) + kastenPfand;
     totalPrice = Math.pow(10.0, -2.0) * Math.round(totalPrice * 100.0);
     //totalPrice = totalPrice / 100;
     System.out.println(totalPrice);
     char test = '\u0030';  // Unicode die 0
     System.out.println(test);
     char test2 = '\u04D2'; // Unicodce Ä
     System.out.println(test2);
    }
}