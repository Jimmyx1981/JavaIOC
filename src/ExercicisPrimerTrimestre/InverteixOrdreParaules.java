import java.util.Scanner;
//Programa que inverteix l'ordre de les paraules d'una frase.
public class InverteixOrdreParaules {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix una frase: ");
        String text = lector.nextLine();
        //Dividim la frase en paraules, separades per espais.
        String[] paraules = text.split(" ");
        System.out.println("El text invertit es: ");
        //Imprimim les paraules en ordre invers.
        for (int i = paraules.length -1; i >=0; i--) {
            System.out.println(paraules[i]);
            //El mètode split aelimina el text de separació (en aquest cas,
            //els espais)
            System.out.println(" ");
        }
        System.out.println();
    }
}
