import java.util.Scanner;
//Un programa que demana a l'usuari nombres enters fins que l'usuari introudueixi
//FI.
public class llegeixIntFinsFi {
    public static int FI = 0;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean sencer = false;
        int numero = 0;
        
        do {
            System.out.println("Introdueix un numero sencer, si vols acabar introdueix 0.");
            sencer = lector.hasNextInt();
            if (sencer) {
                numero = lector.nextInt();
                if (numero != FI) {
                    System.out.println("Has introduït el número: " + numero);
                } else {
                    System.out.println("El programa ha finalitzat.");
                }
            } else {
                System.out.println("El nombre no es sencer.");
            }
        } while (numero != FI);
    }
}
