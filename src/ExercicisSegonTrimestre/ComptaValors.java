package ExercicisSegonTrimestre;

import java.util.Scanner;

public class ComptaValors {

    Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        ComptaValors programa = new ComptaValors();
        programa.inici();
    }
    public void inici() {
        int[] valors = {3, 5, 6, 3, 2, 6, 4, 6, 2, 6, 10};
        System.out.println("Introdueix un nombre enter per teclat: ");
        int valor = introduirValor();
        int resultat = comptaValors(valors, valor);
        System.out.println("El número de vegades que el nombre es repeteix es " + resultat);
    }
    public int introduirValor() {
        int enterLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextInt();
            if (llegit) {
                enterLlegit = lector.nextInt();
            } else {
                System.out.println("Això no es un enter.");
                lector.next();
            }
        }
        lector.nextLine();
        return enterLlegit;
    }
    public int comptaValors(int[] array, int valor) {
        int acumulador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                acumulador++;
            }
        }
        return acumulador;
    }
}
