package kapitel6;

class windowsPfadToLinux {
    public static void main(String[] args) {
        StringBuffer pfad = new StringBuffer("/media/usbstick/daten/unfug");
        int pos = 0;
        int oldPos = 0;
        while (pos>=0) {
            // Schrägstrichposition merken
            pos = pfad.indexOf("/", oldPos);
            if (pos>=0) {
                // einfach durch Backslash ersetzen
                pfad.setCharAt(pos, '\\');
            }
            if (pos>=0) oldPos = pos+1;
        }
        System.out.println(pfad);
    }
}


