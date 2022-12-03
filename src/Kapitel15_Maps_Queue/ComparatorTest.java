package Kapitel15_Maps_Queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ComparatorTest {

    // Person als zu sortierende lokale Klasse
    // private static inner class
    private static class Person {
        public String vorname, nachname;
        public Person(String vorname, String nachname) {
            this.vorname = vorname;
            this.nachname = nachname;
        }
        // Um die Person anzeigen zu können
        public String toString() {
            return this.vorname + " " + this.nachname;
        }
    }

    // Wir bilden ein Array von Personen, um später ...
    Person[] personenArray = {
            new Person("Helmut", "Schmidt"),
            new Person("Karl", "Bart"),
            new Person("Marta", "Haari"),
            new Person("Peter", "Schulz"),
            new Person("Ingrid", "Schulz"),
            new Person("A", "XXXA")
            };
    // ... eine Liste daraus zu machen. Darüber wird sortiert.

   List<Person> personen = Arrays.asList(personenArray);

    public ComparatorTest() {
        /* anders
        Comparator<Person> test = (person1, person2) -> {
            int vergleiche = person1.vorname.compareTo(person2.vorname);
            if (vergleiche == 0) {
                vergleiche = person1.nachname.compareTo(person2.nachname);
            }
            return vergleiche;
        };

        nochmal anders
        Comparator<Person> test = Comparator.comparing((Person person) -> person.vorname).thenComparing(person -> person.nachname);
        personen.sort(test);
        */

        // übersichtlicher sortieren
        personen.sort(Comparator.comparing((Person a) -> a.vorname)
                .thenComparing(a -> a.nachname));
        System.out.println(personen + "\n");

        //mit stream filtern und ausgeben vor und Nachname
        personen.stream().filter(p -> p.nachname.equals("A"))
                .filter(p -> p.vorname.equals("A"))
                .forEach(p -> System.out.println("Person gefunden: " + p));

    }

    public static void main(String[] args) {
        ComparatorTest a = new ComparatorTest();

        Stream<Person> b = Arrays.stream(a.personenArray).filter(person -> person.vorname.equals("Helmut"));
        b.forEach(p -> System.out.println("Personen gefunden: " + p));

        Optional<Person> test = a.personen.stream()
                .max((p, v) -> (p.nachname.compareTo(v.nachname)));
        System.out.println(test);

        // collect(Collectors.toList() stream wird wieder zur einer Liste
        List<Person> c = a.personen.stream().filter(person -> person.vorname.equals("Helmut")).toList();
        System.out.println("Liste: " + c);
    }
}
