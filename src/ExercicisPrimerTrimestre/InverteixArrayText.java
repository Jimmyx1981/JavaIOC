import java.util.Scanner;
public class InverteixArrayText {
    public static final int NUM_PARAULES = 5;   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String[] array = new String[5];
        
        System.out.println("Escriu " + NUM_PARAULES + " paraules separades per espai.");
        System.out.println("N'hi hi d'haver una per línia.");
        for (int i = 0; i < NUM_PARAULES; i++) {
            array[i] = lector.next();
            lector.nextLine();
        }
        for (int i = array.length -1; i >= 0; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
