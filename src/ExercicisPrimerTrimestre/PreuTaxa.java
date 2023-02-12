public class PreuTaxa {
    public static void main(String[] args) {
        int edad = 18;
        boolean grauMitja = true;
        boolean SMX = false;
        boolean DAW = false;
        boolean ASIX = false;
        int taxa = 0;
        int preu = 0;
        int total = 0;
        
        if (edad >= 18) {
            preu = 150;
            if (grauMitja) {
                if (SMX) {
                    taxa = 150;
                } else {
                   taxa = 75;
               }
            } else {
               if (DAW) {
                   taxa = 200;
               } else if (ASIX) {
                   taxa = 250;
               } else {
                   taxa = 100;
               }
           }
           total = preu + taxa;
            System.out.println("L'import a pagar es: " + total);
        } else {
            System.out.println("Consulta al teu tutor legal");
        }
    }
    
}
