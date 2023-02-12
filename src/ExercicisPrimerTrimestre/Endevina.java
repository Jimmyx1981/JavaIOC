import java.util.Scanner;
//Un programa en què cal endevinar un nombre.
public class Endevina {
    //PAS 1
    //El nombre per endevinar serà el 4.
    public static final int VALOR_SECRET = 4;
    public static void main(String[] args) {
        int valorUsuari = 0;
        Scanner lector = new Scanner(System.in);
        //Pas 2 i 3.
        System.out.println("Començem el joc.");
        System.out.println("Endevina el valor enter, entre 0 i 10: ");
        valorUsuari = lector.nextInt();
        lector.nextLine();
        //PAS 4
        //Estructura de selecció doble.
        //0 s'endevina o falla.
        if ((valorUsuari >= 0)&&(valorUsuari <= 10)){
            if (VALOR_SECRET == valorUsuari){
            System.out.println("Exacte! Era " + VALOR_SECRET + ".");
            } else if ((VALOR_SECRET >= 0)&&(VALOR_SECRET <= 10)){
        //PAS II
        //Si l'expressió avalua false, executa el bloc dins l'else.
            System.out.println("T'has equivocat");
            }
            System.out.println("Hem acabat el joc");
            } else {
                System.out.println("El número no es correcte"); 
        }
    }
    
}
