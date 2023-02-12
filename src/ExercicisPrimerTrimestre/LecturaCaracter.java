package ExercicisPrimerTrimestre;

import java.util.Scanner;
//Mostra una pregunta tipus text i mira si s'endevina.
public class LecturaCaracter {
    public static final char RESPOSTA_CORRECTA = 'b';
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador = 0;
        boolean correcte = false;
        do {
            System.out.println("Endevina la pregunta. ");
            System.out.println("Quin dels següents no és un tipus primitiu?");
            System.out.println("a) Enter");
            System.out.println("b) Scanner");
            System.out.println("c) Caràcter");
            System.out.println("d) Booleà");
            System.out.println("La teva resposta és l'opció: ");
            //Es llegeix la cadena de text.
            String paraula = lector.next();
            //Es una paraula d'un únic caràcter?
            if (paraula.length() == 1) {
            //S'extreu el caràcter de la cadena de text.
            char caracter = paraula.charAt(0);
            //Es un caràcter valid? (a, b, c, d,)
                if ((caracter >= 'a')&&(caracter <= 'd')) {
                    //La resposta final és correcta?
                    if (caracter == RESPOSTA_CORRECTA) {
                        System.out.println("Efectivament la resposta era '" + 
                                RESPOSTA_CORRECTA + "'.");
                        correcte = true;
                    } else {
                        contador++;
                        System.out.println("La resposta '" + caracter + "' es incorrecta.");
                        
                    }
                } else {
                    System.out.println("'" + caracter + "' és una opció incorrecta.");
                    contador++;
                }
            } else {
                //No ho era.
                System.out.println("\"" + paraula + "\" no es un caracter individual.");
                contador++;
            }
        } while ((contador > 3)&&(!correcte));
    }
}
