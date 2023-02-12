import java.util.Scanner;
//Cerca un caràcter concret dins d'una cadena de text qualsevol.
public class CercaCaracterText {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Escriu una línea de text qualsevol i pitja retorn:");
        String text = lector.nextLine();
        
        System.out.println("Quin caràcter vols cercar? ");
        String charText = lector.next();
        lector.nextLine();
        
        char charCerca = charText.charAt(0);
        
        int posInit = text.indexOf(charCerca);
        int posFi = text.lastIndexOf(charCerca);
        if (posInit > -1) {
            System.out.println("Les aparicions del caràcter '" + charCerca + "' són:");
            System.out.println("Primer cop - " + posInit);
            System.out.println("Darrer cop - " + posFi);
        } else {
            System.out.println("Aquest caràcter no es troba al text.");
        }
    }
}
