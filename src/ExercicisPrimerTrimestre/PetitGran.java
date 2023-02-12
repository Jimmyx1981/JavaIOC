package ExercicisPrimerTrimestre;

import java.util.Scanner;
public class PetitGran {
    public static int FI = 0;
    public static int MAX = 100;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int array[] = new int[MAX];
        int numero = 0;
        int index = 0;
        int menor = 0;
        int mayor = 0;
        int canvi = 0;
        boolean enter = false;
        
        do {
            System.out.println("Introdueix números enters si vols acabar 0.");
            enter = lector.hasNextInt();
            if (enter) {
                numero = lector.nextInt();
                if (numero != 0) {
                    array[index] = numero;
                    index++;
                } else{
                    System.out.println("El programa ha finalitzat");
                }
            } else {
                System.out.println("El nombre no es enter.");
                enter = false;
                lector.nextLine();
            }
        } while (numero != 0 || !enter);
        
        System.out.println("El contingut de l'array és: ");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + ", ");
        }
        
        for ( int i = 0; i < index; i++) {
            for ( int j = i + 1; j < index; j++) {
                if ( array[i] > array[j]) {
                    canvi = array[j];
                    array[j] = array[i];
                    array[i] = canvi;
                }
                mayor = array[j];
                menor = array[i];   
            }
        }
        
        System.out.println("\nEl número mes gran es: " + mayor + " i el numero mes"
                + " petit es: " + array[0]);
    }
}
