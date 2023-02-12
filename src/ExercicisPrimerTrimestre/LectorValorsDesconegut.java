package ExercicisPrimerTrimestre;

import java.util.Scanner;
public class LectorValorsDesconegut {
    public static final int MARCA_FI = -1;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu els diferents valors enters.");
        System.out.println("Després del darrer valor escriu un " + MARCA_FI);
        //Es llegeixen exactament NUM_VALORS valors.
        boolean marcaTrobada = false;
        while (!marcaTrobada){
            //Abans de llegir, comprovem si realment hi ha un enter.
            if (lector.hasNextInt()){
                int valor = lector.nextInt();
                //És la marca de fi?
                if (valor == MARCA_FI) {
                    //Sí que ho és.
                    marcaTrobada = true;
                } else {
                    //No. És un valor que ha de ser tractat.
                    System.out.println("Valor llegit: " + valor);
                }
            } else {
                //Si el valor no és enter, es llegeix però s'ignora.
                lector.next();
            }
        }
        //Els valors que sobrin a la darrera línia escrita es descarten.
        lector.nextLine();
        System.out.println("Ja s'han llegit tots els valors.");
    }
}
