package kapitel6;

class HeimatPfadUmbau {
    public static void main(String[] args) { 
        String linuxPfad = "/home/willemer/usbstick/daten/unfug"; 
        // Beginnt der String mit /home/ ? 
        if (linuxPfad.substring(0, 6).equals("/home/")) { 
             // Suche Positionen des Benutzers 
             int vorUser = "/home/".length(); 
             int nachUser = linuxPfad.indexOf('/', vorUser); 
             // Merke Dir den Benutzernamen 
             String user = linuxPfad.substring(vorUser, nachUser); 
             // Baue Heimatpfad für Windows mit dem Restpfad zusammen 
             linuxPfad = "C:\\Dokumente und Einstellungen\\" + user 
                 + linuxPfad.substring(nachUser, linuxPfad.length()); 
        } 
        // Nun noch alle Schraegstriche in Backslash umwandeln 
        String windowsPfad = linuxPfad.replace("/", "\\"); 
        System.out.println(windowsPfad); 
    } 
} 

