import java.util.Scanner;
//Joc d'endevinar una paraula, donat pistes del seu ordre alfabètic.
public class EndevinaParaula {
    //La paraula per endevinar es "objecte".
    public static final String PARAULA_SECRETA = "java";
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Comemcem el joc. ");
        System.out.println("Endevina el valor de la paraula del diccionari. ");
        boolean haEncertat = false;
        while (!haEncertat) {
            System.out.println("Quina paraula creus que és? ");
            String paraulaUsuari = lector.next();
            lector.nextLine();
            int posicio = paraulaUsuari.compareTo(PARAULA_SECRETA);
            if (posicio < 0) {
                //La paraula de l'usuari es anterior a la secreta.
                System.out.println("Has fallat! La paraula va després...");
            } else if (posicio > 0) {
                //La paraula de l'usuari és posterior a la secreta.
                System.out.println("Has fallat! La paraula va abans...");
            } else {
                //Si val 0, és que s'ha encertat.
                haEncertat = true;
            }
        }
        System.out.println("Enhorabona. Has encertat.");
    }
}
