package ExercicisPrimerTrimestre;

import java.util.Scanner;
//Un programa que llegeix un nombre conegut de valors enters.
public class LectorValorsConeguts {
    //Es llegiran 10 valors.
    public static final int NUM_VALORS = 10;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu " + NUM_VALORS + " enters. Es pot fer en "
                + "diferents línies.");
        //Es llegeixen exactament NUM_VALORS valors.
        int numValorsLlegits = 0;
        while (numValorsLlegits < NUM_VALORS){
            //Abans de llegir, comprovem si realment hi ha un enter.
            if (lector.hasNextInt()){
            int valor = lector.nextInt();
            System.out.println("Valor " + numValorsLlegits + " llegit: " + valor);
            numValorsLlegits++;
        } else {
                //Si el valor no és enter, es llegeix però s'ignora.
                //No s'avança tampoc el comptador.
                lector.next();
                }
        }
        //Els valors que sobrin a la darrera línia escrita es descarten
        lector.nextLine();
        System.out.println("Ja s'han llegit " + NUM_VALORS + " valors.");
    }
}
