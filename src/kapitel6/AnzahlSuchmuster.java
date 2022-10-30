package kapitel6;

public class AnzahlSuchmuster {
    public static void main(String[] args) { 
        String string = "atzventzkrantzkertzenglantz"; 
        String suchmuster = "tz"; 
        int pos = 0;  // akt. Position im String
        int oldPos = 0; // wo wir zuletzt waren
        int zaehler = 0;
        // wiederholen, wenn es noch Muster gibt
        while (pos>=0) {
            pos = string.indexOf(suchmuster, oldPos);
            if (pos>=0) {
            	zaehler++;
                oldPos = pos+1;
            } 
        }
        System.out.println(zaehler); 
    } 
}
