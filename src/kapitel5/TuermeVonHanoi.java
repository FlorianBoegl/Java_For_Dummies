package kapitel5;

public class TuermeVonHanoi {

        public static void main(String[] args) {
            ziehe(1, 3, 5);
        }



        static void ziehe(int von, int nach, int scheibenZahl) {
            if (scheibenZahl > 0) {
                int frei = 6 - (von + nach);
                ziehe(von, frei, scheibenZahl-1);
                zeigeZug(von, nach);
                ziehe(frei, nach, scheibenZahl-1);
            }
        }

        private static void zeigeZug(int von, int nach) {
            zeigeStab(von);
            System.out.print(" - ");
            zeigeStab(nach);
            System.out.println("");
        }

        static void zeigeStab(int stabnr) {
            switch (stabnr) {
                case 1 -> System.out.print("links ");
                case 2 -> System.out.print("mitte ");
                case 3 -> System.out.print("rechts");
            }
        }
    }