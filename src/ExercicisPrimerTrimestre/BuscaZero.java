package ExercicisPrimerTrimestre;
import java.util.Scanner;

public class BuscaZero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int index = 0;
        int comptador = 0;
        int fi = -1;
        int[] array = new int [10];
        
        System.out.println("Introdueix nombres enters, si vols finalitzar -1:");
        
        while (index < array.length) {
            array[index] = lector.nextInt();
            index++;
        }
        
        System.out.println("El contingut de l'array es: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == fi ) {
                System.out.println("Programa finalitzat");
                break;
            } else {
                System.out.print(array[i] + ", ");
                if (array[i] == 0) {
                comptador++;
                    
                }
            }
        }
        System.out.println("Hi ha " + comptador + " zeros");
    }
}
