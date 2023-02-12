package ExercicisPrimerTrimestre;
import java.util.Scanner;

public class ArrayQualificacions {
    public static int MAX = 100;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean sencer = false;
        boolean finalitzat = false;
        int notes = 0;
        int aprovats = 0;
        int index = 0;
        int[] array = new int[MAX];
        
        do {
            System.out.println("Introdueïx les notes:");
                while (index < MAX && !finalitzat) {
                    if (notes != -1) {
                        notes = lector.nextInt();
                        array[index] = notes;
                        index++;
                    } else {
                        System.out.println("Programa finalitzat");
                        finalitzat = true;
                    }
                }
        } while (!finalitzat);
        
        for (int i = 0; i < index - 1; i++) {
            System.out.print(array[i] + ", ");
            if (array[i] >= 5 && array[i] <= 10) {
                aprovats ++;
            }
        }
        System.out.println("\nEl número de aprovats es " + aprovats);
    }
}
