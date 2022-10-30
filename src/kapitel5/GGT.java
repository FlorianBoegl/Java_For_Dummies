package kapitel5;

public class GGT {

    public static void main(String[] args) {
        teiler(77, 21);
    }

    public static void teiler(int t1, int t2) {
        if (t2 > t1)teiler(t2 - t1, t1);
        if (t1 > t2) teiler(t1 - t2, t2);
        if (t1 == t2) System.out.println("GGT ist: " + t2);
    }

    /**
     class GGT {
     static int ggT(int a, int b) {
     while (b>0) {
     if (b>a) {
     // Tausche a und b
     int hilf = a;
     a = b;
     b = hilf;
     }
     a = a - b;
     }
     return a;
     }
     public static void main(String[] args) {
     System.out.println(ggT(36, 24));
     }
     }


     *
     */
}
