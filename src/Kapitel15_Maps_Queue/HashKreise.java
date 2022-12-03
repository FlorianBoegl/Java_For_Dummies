package Kapitel15_Maps_Queue;
import java.util.Set;
import java.util.HashSet;

public class HashKreise {
    public HashKreise() {
        Set<LandKreis> kreise = new HashSet<>();
        kreise.add(new LandKreis("Schleswig-Flensburg",197903));
        kreise.add(new LandKreis("Schleswig-Flensburg",197903));
        kreise.add(new LandKreis("Recklinghausen",628817));


        for (LandKreis k : kreise) {
            System.out.print("" + k.getWo());
            System.out.print(" (" + k.getEinwohner());
            System.out.println(" Einwohner)");
        }
    }
}

