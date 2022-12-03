import java.util.*;

public class ComparatorTest {

    // Person als zu sortierende lokale Klasse
    class Person {
        public String vorname, nachname;
        // Konstruktor: Vorname und Name als Parameter
        public Person(String v, String n) {
            vorname = v;
            nachname = n;
        }
        // Um die Person anzeigen zu können
        public String toString() {
            return vorname + " " + nachname;
        }
    }

    // Wir bilden ein Array von Personen, um später ...
    Person personenArray[] = {
            new Person("Helmut", "Schmidt"),
            new Person("Karl", "Bart"),
            new Person("Marta", "Haari"),
            new Person("Peter", "Schulz"),
            new Person("Ingrid", "Schulz")
            };
    // ... eine Liste daraus zu machen. Darüber wird sortiert.
    List<Person> personen = Arrays.asList(personenArray);

    // Der Konstruktor, damit nicht alles static läuft.
    public ComparatorTest() {
        // Zur Kontrolle ausgeben
        System.out.println(personen);
    }

    public static void main(String[] args) {
        new ComparatorTest(); // Starte den eigenen Konstruktor.
    }
}
