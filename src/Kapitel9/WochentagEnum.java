package Kapitel9;

public class WochentagEnum {


    enum Wochentag { MO(0, "Montag"), DI(1, "Dienstag"),
        MI(2, "Mittwoch"), DO(3, "Donnerstag"),
        FR(4, "Freitag"), SA(5, "Samstag"), SO(6, "Sonntag");

        private int tagnr;
        private String tagname;

        Wochentag(int nr, String name) {
            tagnr = nr;
            tagname = name;
        }

        @Override
        public String toString() {
            return tagname;
        }
    }

    public static void main(String[] args) {
        Wochentag wochentag = Wochentag.DI;
        System.out.println(wochentag);
        String asd = new String("asdasd");
        System.out.printf(asd);
    }
}

