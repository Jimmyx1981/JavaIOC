package ExercicisPrimerTrimestre;

import java.util.Scanner;
//Un programa que crea un array i després el còpia a un segon array però en sentit
//invers.
public class ArrayInversDoble {
    public static int MAX = 5;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] array = new int[MAX];
        int[] arrayDos = new int[array.length];
        boolean sencer = false;
        int nombres = 0;
        int index = 0;
        
        System.out.println("Introdueix 5 nombres sencers. ");
        sencer = lector.hasNextInt();
            
        while (index < MAX) {
            if (sencer) {
                nombres = lector.nextInt();
                array[index] = nombres;
                index++;
            } else {
                System.out.println("El nombre no es sencer.");
            } 
        }
        
        System.out.println("El contingut del primer array es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        
        System.out.println("\nEl contingut de segon array a l'invers es: ");
        for (int i = array.length -1; i >= 0; i--) {
            for (int j = 0; j < 1; j++) {
                arrayDos[j] = array[i];
                System.out.print(arrayDos[j] + ", ");
            }
        }
    }
}
