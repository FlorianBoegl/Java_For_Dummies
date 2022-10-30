package Kapitel9;

public class Liste {

    String name;
    Liste next;

    public void setName(String a) {
        this.name = a;
    }
    public void setNext(Liste b) {
        this.next = b;
    }
    public String getName() {
        return this.name;
    }
}
