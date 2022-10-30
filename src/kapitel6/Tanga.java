package kapitel6;

class Tanga {
    public static void main(String[] args) { 
        String input = "Tang"; 
        String anhang = ""; 
        final String selbstlaut = "auoAUO"; 
        for (int i=0; i < input.length(); i++) {
            char zeichen = input.charAt(i);
            if (selbstlaut.indexOf(zeichen )>= 0) {
                anhang = anhang + zeichen;
            }
        } 
        System.out.println(input+anhang);
    } 
} 

