package ExercicisPrimerTrimestre;

import java.util.Scanner;
//Un programa que recorreix un array en sentit invers i l'imprimeix en pantalla.
public class ArrayInvers {
    public static int MAXIM = 5;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] llista = new int [MAXIM];
        boolean enter = false;
        int nombres = 0;
        int index = 0;
        
        System.out.println("Introdueix 5 nombres enters: ");
        enter = lector.hasNextInt();
        
        while (nombres < MAXIM) {
            if (enter) {
                nombres = lector.nextInt();
                llista[index] = nombres;
                index++;
            } else {
                System.out.println("El nombre no es enter.");
            }
        }
        
        for (int i = llista.length -1; i >= 0; i--) {
            System.out.print(llista[i] + ", ");
        }
    }
}
