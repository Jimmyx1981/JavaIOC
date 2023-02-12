package ExercicisSegonTrimestre;

import java.util.Scanner;

public class ExerciciDepuracio {
    float[] valors = {4.2f, 2.5f, 3f, 1f};
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ExerciciDepuracio programa = new ExerciciDepuracio();
        programa.cercarValor();
    }

    void cercarValor(){
        /* Aquest algorisme demana a l'usuari que introdueixi una col·lecció
        de dades per teclat. Després demana que introdueixi un valor a
        cercar i finalment mostra per pantalla la posició dins la col·lecció
        on es troba el valor cercat.
         */
        int midaColleccio;
        double[] colleccio;
        double aCercar;
        int posicio;
        
        System.out.println("Aquet algorisme us demarà que " +
                "introduïu un col·lecció de dades per teclat. Després " +
                "demana que introuïu un valor a cercar i finalment mostra " +
                "per pantalla la posició dins la col·lecció on es troba el " +
                "valor cercat. \n");
        System.out.println("Introduïu la mida de la col·lecció de números: ");
        midaColleccio = scanner.nextInt();

        colleccio = new double[midaColleccio];

        for (int i = 0; i < midaColleccio; i++){
            System.out.print("\nIntrodueix el valor de la posició " + i + ": ");
            colleccio[i] = scanner.nextDouble();
        }

        System.out.println("Ara introdueix un valor a cercar: ");
        aCercar = scanner.nextDouble();

        posicio = cercarPosicioValor(colleccio, aCercar);

        if (posicio >= colleccio.length){
            System.out.println("El valor cercat no es troba a la col·lecció");
        } else {
            System.out.println("El valor: " + aCercar + " es troba a la posició: " + posicio);
        }
    }

    int cercarPosicioValor(double[] collecio, double aCercar){
        boolean trobat = false;
        int posicio = 0;
        while (posicio < collecio.length && !trobat){
            trobat = collecio[posicio] == aCercar;
            if (!trobat){
                posicio++;
            }
        }
        return posicio;
    }
}
