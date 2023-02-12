import java.util.Scanner;
//Un programa que mostra els multiples de manera decreixent d'un nombre introduït
//per l'usuari fins a un nombre també introduït per l'usuari.

public class MostraMultiples {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int multiple = 0;
        int min = 0;
        int max = 0;
        
        System.out.println("Introdueix de quin nombre vols els múltiples: ");
        multiple = lector.nextInt();
        
        System.out.println("Introdueix fins a quin nombre mostrar els múltiples"
                + " de 0 a 100.");
        max = lector.nextInt();
        
        System.out.println("Els nombres múltiples de " + multiple + " fins a " 
        + max + " en ordre decreixent son: ");
        for (int i = max; i >= 1; i--) {
            if (i % multiple == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
