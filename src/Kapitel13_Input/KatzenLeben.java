package Kapitel13_Input;


public class KatzenLeben {
    public static void main(String[] args) {
        Mensch willemer = new Mensch("Willemer");
        Katze katze = new Katze();
        while (katze.lebtNochBeiEuch()) {
            try {
                katze.schlaeft();
                katze.frisst();
                katze.schnurrt();
            } catch (KatzeKotztException k) {
                System.out.println(katze.getZyklus());
                katze.mussZumTierarzt();
                willemer.macheDreckWeg();
            } catch (KatzeKacktException k) {
                System.out.println(katze.getZyklus());
                willemer.zeigeKatzenklo();
                willemer.macheDreckWeg();
            } catch (KatzeKratztException k) {
                if (k.getKatze().getAttackenZahl()>5) {
                    katze.mussInsHeim();
                }
            } catch(KatzenException k) {
                // sollte eigentlich nicht auftreten
                k.printStackTrace();
            }
        }
    }
}