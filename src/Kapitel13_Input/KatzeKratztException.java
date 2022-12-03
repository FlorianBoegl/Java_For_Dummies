package Kapitel13_Input;

public class KatzeKratztException extends KatzenException{
    private Katze katze;
    public KatzeKratztException(Katze katze) {
        this.katze = katze;
    }

    public Katze getKatze() {
        return this.katze;
    }
}
