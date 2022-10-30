package Kapitel4;

public class Fuchs {

    public static void main(String[] args) {
        float fuchssprung = 1.0f;
        float hundsprung = fuchssprung * 7.0f / 3.0f;
        float vorsprung = 60.0f;
        float verhaeltnisSprung = 9.0f / 6.0f;

    }

    public float hetzen(float abstand) {
        float fuchssprung = 1.0f;
        float hundsprung = fuchssprung * 7.0f / 3.0f;
        float vorsprung = 60.0f;
        float verhaeltnisSprung = 9.0f / 6.0f;

        float neuerAbstand = 0f;

        neuerAbstand = vorsprung + fuchssprung * 9.0f - hundsprung * verhaeltnisSprung;

        return neuerAbstand;
    }
}
