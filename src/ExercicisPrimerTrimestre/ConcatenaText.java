import java.util.Scanner;
public class ConcatenaText {
    public static final int NUM_FRASES = 2;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String novaFrase = "";
        System.out.println("Escriu " + NUM_FRASES + " frases.");
        System.out.println("Per acabar una frase, pitja la tecla de retorn.");
        for (int i = 0; i < NUM_FRASES; i++) {
            novaFrase = novaFrase + lector.nextLine();
        }
        System.out.println(novaFrase);
    }
}
