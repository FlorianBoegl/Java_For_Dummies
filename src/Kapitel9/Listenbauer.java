package Kapitel9;

public class Listenbauer {

    public static void main(String[] args) {
        Liste test = new Liste();
        test.setName("anfang");
        Character b = 'a';
        test.next = new Liste();
        Liste zwei = test.next;
        zwei.setName("zwei");
        zwei.next = new Liste();
        Liste drei = zwei.next;
        drei.setName("drei");
        Liste lauf = new Liste();
        lauf = test;
        lauf.setNext(test.next);
        while (lauf != null) {
            System.out.println(lauf.getName());
            lauf = lauf.next;
        }
    }
}
