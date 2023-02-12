import java.util.Scanner;
public class LecturaCaracterTresIntents {
    //El nombre de intents es declara com una constant.
    public static final int INTENTS = 3;
    public static final char RESPOSTA_CORRECTA = 'b';
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Endevina la pregunta.");
        System.out.println("Quin dels següents no és un tipus primitiu?");
        System.out.println("a) Enter");
        System.out.println("b) Scanner");
        System.out.println("c) Caràcter");
        System.out.println("d) Booleà");
        //Cal un comptador d'intents.
        int intents = 0;
        //Cal saber si s'ha encertat (semàfor).
        boolean encertat = false;
        //Es pregunta mentre no s'encerti no s'esgotin els intents.
        while ((intents < INTENTS)&&(!encertat)) {
            System.out.println("La teva resposta es la opció: ");
            //Es llegeix la cadena de text.
            String paraula = lector.next();
            //És una paraula d'un únic caràcter?
            if (paraula.length() == 1) {
                //S'extreu el caràcter de la cadena de text.
                char caracter = paraula.charAt(0);
                //És un caracter valid? (a, b, c, d).
                if ((caracter >= 'a')&&(caracter <= 'd')) {
                    //La resposta final és correcta?
                    if (caracter == RESPOSTA_CORRECTA) {
                        System.out.println("Efectivament, la resposta era '" + 
                                RESPOSTA_CORRECTA + "'");
                        encertat = true;
                    } else {
                        System.out.println("La resposta '" + caracter + "' és incorrecta.");
                        intents++;
                    }
                } else {
                    System.out.println("'" + caracter + "' és una opció incorrecta.");
                    //Si hi ha aquest error, no s'esgotarà cap intent...
                }
            } else {
                //No ho hera.
                System.out.println("\"" + paraula + "\" no es un caràcter individual.");
                //S'hi hi ha aquest error, no s'esgotara cap intent...
            }
            lector.nextLine();
        }
        if (intents >= INTENTS) {
            System.out.println("Has esgotat tots els intents.");
        }
    }
}
