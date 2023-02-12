//Un programa que suma una seqüencia de nombres introduïda per l'usuari. Si 
//s'introdueix 0 el programa finalitza.
import java.util.Scanner;
public class sumaTots {
    public static int FI = 0;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int acumulador = 0;
        int numero = 0;
        boolean finalitza = false;
        
        do {
            System.out.println("Introdueix nombres enters.");
            System.out.println("Si vols finalitzar introdueix 0.");
        
            numero = lector.nextInt();
        
            if (numero != FI) {
                acumulador = acumulador + numero;
            } else {
                System.out.println("El programa ha finalitzat");
                finalitza = true;
            }
            } while (!finalitza);
        
        System.out.println("La suma de tots els nombres introduïts es: " + acumulador);
    }
}
