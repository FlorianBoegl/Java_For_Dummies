package kapitel7;

public class ZeigArgs {
    public static void main(String[] args) {
        // Durchlaufe args und lege die Elemente je in str ab
        for (String str : args) {
            // Für jedes Argument eine eigene Zeile
            System.out.println(str);
        }
    }
}

