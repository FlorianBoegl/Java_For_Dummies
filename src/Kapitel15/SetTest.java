package Kapitel15;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static Set<String> test2 = new TreeSet<>();
    public static Set<String> test3 = new LinkedHashSet<>(64);

    public static void main(String[] args) {
        int doppelteZaehlen = 0;
        Set<String> test1 = new HashSet<>(64);
        test1.add("a");
        doppelteZaehlen += test1.add("a")?0:1;
        doppelteZaehlen += test1.add("b")?0:1;
        doppelteZaehlen += test1.add("c")?0:1;
        doppelteZaehlen += test1.add("b")?0:1;
        System.out.println("Duplicates added: " + doppelteZaehlen + "\t\tSize: " + test1.size() + "\t\tSet: " + test1);
    }
}
