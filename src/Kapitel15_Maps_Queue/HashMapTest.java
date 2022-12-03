package Kapitel15_Maps_Queue;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, LandKreis> kfzLandKreis = new HashMap<>();
        kfzLandKreis.put("SL", new LandKreis("Schleswig-Flensburg",197903));
        kfzLandKreis.put("HG", new LandKreis("Hochtaunuskreis",227425));
        kfzLandKreis.put("MH", new LandKreis("Muehlheim",167344));
        kfzLandKreis.put("PI", new LandKreis("Pinneberg",303481));

        System.out.println("Es gibt " + kfzLandKreis.size() + " Kennzeichen.");

        if (kfzLandKreis.containsKey("PI")) {
            System.out.println("PI ist das Kennzeichen von: " + kfzLandKreis.get("PI").getWo());
        } else {
            System.out.println("Kennzeichen PI unbekannt");
        }
        kfzLandKreis.remove("PI");

        System.out.println("Eine Liste: ");
        Set<String> s = kfzLandKreis.keySet();
        for (String k : s) {
            System.out.println("Key: " + k + "\t Landkreis: "
                    + kfzLandKreis.get(k).getWo());
        }
    }
}