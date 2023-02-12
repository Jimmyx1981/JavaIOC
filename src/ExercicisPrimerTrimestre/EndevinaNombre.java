import java.util.Scanner;
//Un programa en què cal endevinar un nombre.
public class EndevinaNombre {
    //PAS 1
    public static final int VALOR_SECRET = 4;
    public static final int MAX_INTENTS = 3;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Comencem el joc.");
        System.out.println("Endevina el valor enter, entre 0 i 10, en 3 intents");
        boolean haEncertat = false;
        int intents = MAX_INTENTS;
        //Per garantir l'àmbit correcte de la variable, ara cal declarar-la.
        int valorUsuari = 0;
        while ((!haEncertat)&&(intents > 0)) {
            System.out.println("Quin valor creus que és? ");
            valorUsuari = lector.nextInt();
            lector.nextLine();
            if (VALOR_SECRET != valorUsuari){
                System.out.println("Has fallat! Torna a intentar-ho...");
            } else {
                haEncertat = true;
            }
        }
        if (valorUsuari == VALOR_SECRET) {
            //PAS 7: S'ha sortit del bucle perquè el valor era incorrecte.
            System.out.println("Enhorabona. Has encertat!");
        } else {
            //PAS 8: S'ha sortit del bucle perquè s'han esgotat els intents.
            System.out.println("Intents esgotats. Has perdut!");
        }
    }
    
}
