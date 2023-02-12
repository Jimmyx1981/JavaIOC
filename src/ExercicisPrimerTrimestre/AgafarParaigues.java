package ExercicisPrimerTrimestre;

import java.util.Scanner;
//Un programa que pregunta al usuari si plou o no i li diu si agafa o no el 
//paraigües.
public class AgafarParaigues {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nuvol = 0;
        int dia = 0;
        
        System.out.println("El dia està núvol. 1/si, 2/no");
        nuvol = lector.nextInt();

        switch (nuvol) {
            case 1 -> System.out.println("Agafa el paraigües.");
            case 2 -> {
                System.out.println("Quantas dies estaràs fora? 1/un dia, 2/mes de 1 dia.");
                nuvol = lector.nextInt();
                switch (nuvol) {
                    case 1 -> System.out.println("No agafis el paraigües");
                    case 2 -> System.out.println("Agafa el paraigües");
                }
            }
        }
    }  
}
