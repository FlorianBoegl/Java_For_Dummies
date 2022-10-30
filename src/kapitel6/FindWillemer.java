package kapitel6;

class FindWillemer {
    public static void main(String[] args) { 
        String suchStr = "Willhelmar"; 
        boolean ergebnis = suchStr.matches("Wil.*m[ea]r");
        System.out.println(ergebnis);
    } 
}

