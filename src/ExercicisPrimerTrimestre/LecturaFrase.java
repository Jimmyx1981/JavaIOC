import java.util.Scanner;
//Llegeix frases escrites pel teclat.
public class LecturaFrase {
    public static final int NUM_FRASES = 4;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu " + NUM_FRASES + " frases.");
        System.out.println("Per acabar una frase pitja la tecla de retorn.");
        for (int i = 0; i < NUM_FRASES; i++) {
            //Es van llegint frases una per una.
            String frase = lector.nextLine();
            System.out.println("Frase " + i + ": Has escrit \"" + frase + "\".");
        }
        //Ara no cal llegir la resta de cap línia, ja que sempre es llegeixen
        //línies seceres...
    }
}
