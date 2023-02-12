import java.util.Scanner;
//Un programa en què cal endevinar un nombre
public class EndevinaControlErrorsEntrada {
    //PAS 1
    //El nombre per endevinar serà el 4.
    public static final int VALOR_SECRET = 4;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Comecem el joc.");
        System.out.println("Endevina el valor enter, entre 0 i 10: ");
        boolean tipusCorrecte = lector.hasNextInt();
        if (tipusCorrecte){
            //S'ha escrit un enter correctament. Ja es pot llegir.
            int valorUsuari = lector.nextInt();
            lector.nextLine();
            if (VALOR_SECRET == valorUsuari){
                System.out.println("Exacte! Era " + VALOR_SECRET + ".");
            } else {
                System.out.println("T'has equivocat");
            }
            System.out.println("Hem acabat el joc");
        } else{
            //No s'ha escrit un enter.
            System.out.println("El valor introduït no és un enter.");
        }
    }
    
}
