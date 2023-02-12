import java.util.Scanner;
public class ParaulesSenars {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Escriu una frase de diverses paraules: ");
        String frase = lector.nextLine();
        
        String[] arrayParaules = frase.split(" ");
        for (int i = 0; i < arrayParaules.length; i = i + 2) {
            System.out.print(arrayParaules[i] + " ");
        }
    }
}
