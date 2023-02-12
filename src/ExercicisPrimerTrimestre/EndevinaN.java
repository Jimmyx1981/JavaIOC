import java.util.Scanner;
//Un programa en què cal endevinar un nombre.
public class EndevinaN {
    //PAS 1
    public static final int VALOR_SECRET = 4;
    public static final int MAX_INTENTS = 3;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Comencem el joc.");
        System.out.println("Endevina el valor enter entre 0 i 10 en tres intents.");
        boolean haEncertat = false;
        int intents = MAX_INTENTS;
        int valorUsuari = 0;
        //Inici bucle per endevinar el valor
        while ((!haEncertat)&&(intents >= 0)){
            //Inici bucle per endevinar el valor.
            do {
                //PAS 2 i 3: Com a mínim, segur que es pregunta un cop.
                System.out.println("Introdueix un valor enter entre 0 i 10: ");
                valorUsuari = lector.nextInt();
                lector.nextLine();
                //PAS 4
            } while ((valorUsuari < 0)||(valorUsuari > 10));
            //Fi bucle per obtenir una dada des del teclat.
            //PAS 6
            intents = intents -1;
            //PAS 7 i 8
            if (VALOR_SECRET != valorUsuari){
                System.out.println("Has fallat! Torna a intentar-ho.");
            } else {
                haEncertat = true;
            }
        }
        //Fi bucle per endevinar el valor.
        if (valorUsuari == VALOR_SECRET){
            //PAS 9: S'ha sortit del bucle perquè el valor era correcte.
            System.out.println("Enhorabona. Ho has encertat!");
        } else {
            //PAS 10: S'ha sortit del bucle perquè shan esgotat els intents.
            System.out.println("Intents esgotats. Has perdut!");
        }
    }
    
}
