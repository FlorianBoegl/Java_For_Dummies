package Kapitel9.Uebungen;

public class Bruch {
    private int z=0, n=1;
    public Bruch(int zaehler, int nenner) {
        z = zaehler;
        n = nenner;
    }

    public Bruch add(Bruch a)  {
        z = z*a.n + a.z*n;
        n = n*a.n;
        return this;
    }

    public Bruch mul(Bruch a)  {
        n = n*a.n;
        z = z*a.z;
        return this;
    }

    private int ggt(int a, int b) {
        while (b > 0) {
            if (b > a) {
                int h = b;
                b = a;
                a = h;
            }
            a = a - b;
        }
        return a;
    }

    public String toString() {
        int g = ggt(z, n);
        if (g > 0) {
            z /= g;
            n /= g;
        }
        return "" + z + "/" + n;
    }

    static public void main(String[] args) {
        Bruch b = new Bruch(1, 2);
        Bruch c = b.add(new Bruch(4, 5));
        System.out.println(c);
        Bruch d = b.mul(new Bruch(4, 5));
        System.out.println(d);
    }
}
