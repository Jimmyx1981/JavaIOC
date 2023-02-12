import java.util.Scanner;
//Un programa per endevinar un nombre en un máxim de 3 intents.
public class EndevinaSemaforDoWhile {
    public static int VALOR_SECRET = 4;
    public static int MAX_INTENTS = 3;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean enter = false;
        boolean encertat = false;
        int numero = 0;
        int intents = 0;

        do {
            System.out.println("Endevina el numero del 1 al 10. Tens " + (MAX_INTENTS - intents) + " intents.");
            enter = lector.hasNextInt();
            if (enter) {
                numero = lector.nextInt();
                if (numero != VALOR_SECRET) {
                    System.out.println("No has encertat el número!");
                    intents++;
                } else {
                    System.out.println("Has encertat el número!!!");
                    encertat = true;
                }
            } else {
                System.out.println("El número no es enter.");
                intents++;
            }
        } while (intents < MAX_INTENTS && !encertat);
    }
}
