package ExercicisPrimerTrimestre;

import java.util.Scanner;
//Un programa que indica la nota en text a partir de la númerica
public class AvaluacioSimplificat {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //PAS 1 i 2
        System.out.println("Quina nota has tret?: ");
        float nota = lector.nextFloat();
        lector.nextLine();
        //PAS 3
        //Estructura de selecció múltiple.
        //S'entra al bloc on la condició lògica avaluï a true.
        //Les condicions s'avaluen per ordre d'aparició.
        //Si cap no ho fa, s'entra al bloc else
        System.out.println("La teva nota final es: ");
        if ((nota > 0)&&(nota <= 10)){
            if ((nota >= 9)&&(nota <=10)){
                System.out.println("Excel·lent");
            } else if (nota >= 6.5){
                System.out.println("Notable");
            } else if (nota >= 5){
                System.out.println("Aprobat");
            } else if (nota < 5){
                System.out.println("Suspès");
            } else {
                System.out.println("Espero que hagi anat bé");
            }
        }
        System.out.println("El número no es correcte");
    }
    
}
