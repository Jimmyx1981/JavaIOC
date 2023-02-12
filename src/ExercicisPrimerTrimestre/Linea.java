//Un programa que escriu una línea amb 100 caràcters
import java.util.Scanner;
public class Linea {
    public static void main(String[] args) {
        //Preguntem al usuari cuantes vegades vol escriure el caràcter
        System.out.println("Quantes vegades vol escriure el caràcter?");
        Scanner lector = new Scanner(System.in);
        int vegades = lector.nextInt();
        //Inicialitzem un comptador
        int i = 0;
        //Ja hem fet això 100 cops?
        while (i < vegades){
            System.out.print("-");
            //Ho hem fet un cop, sumem 1 al comptador
            i = i + 1;
       }
       //Forcem un salt de línea
        System.out.println();
    }
    
}
