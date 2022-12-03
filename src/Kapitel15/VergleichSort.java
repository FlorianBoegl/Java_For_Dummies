import java.util.*;

public class VergleichSort {
    public static void main(String[] args) {
        Vergleichbar nameArray[] = {
            new Vergleichbar("Helmut", "Schmidt"),
            new Vergleichbar("Karl", "Bart"),
            new Vergleichbar("Marta", "Haari"),
            new Vergleichbar("Peter", "Schulz"),
            new Vergleichbar("Ingrid", "Schulz")
        };
        List<Vergleichbar> names = Arrays.asList(nameArray);
        Collections.sort(names);
        System.out.println(names);
    }
}
