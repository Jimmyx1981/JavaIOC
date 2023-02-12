import java.util.Scanner;
//Un programa que extreu tot el text d'una frase, excepte la primera i la 
//darrera paraula.
public class ExtreureParaules {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase de text i pitja retorn:");
        String text = lector.nextLine();
        //Cerca el primer i el darrer espai en blanc.
        int iniciSubcadena = text.indexOf(' ');
        int fiSubcadena = text.lastIndexOf(' ');
        System.out.println("El text sense la primera i la darrera paraula és: ");
        if (iniciSubcadena == fiSubcadena) {
            //O bé no hi ha espais (els dos mètodes avaluan a -1).
            //O bé només hi ha dues paraules (els dos mètodes avaluen la mateixa
            //posició)
            //No es mostra res.
            System.out.println("No hi ha res per escriure...");
        } else {
            //Es mostra la cadena intermèdia.
            //La segona paraula comença una posició després del primer espai en blanc.
            //La darrera paraula comença una posició després del darrer espai en blanc.
            String textFinal = text.substring(iniciSubcadena + 1, fiSubcadena);
            System.out.println(textFinal);
        }
    }
}
