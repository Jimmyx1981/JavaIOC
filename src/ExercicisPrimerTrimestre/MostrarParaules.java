import java.util.Scanner;
public class MostrarParaules {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix una frase: ");
        String text = lector.nextLine();
        String[] parts = text.split(" ");
        
        System.out.println("Les paraules de la frase separades son:");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
    
}
