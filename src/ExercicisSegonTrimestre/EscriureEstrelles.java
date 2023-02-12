package ExercicisSegonTrimestre;
import java.util.Scanner;

public class EscriureEstrelles {


    public static void main(String[] args) {
        EscriureEstrelles programa = new EscriureEstrelles();
        programa.inici();
    }

    public void inici() {
        System.out.println("Escriu un número: ");
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        imprimirEstrelles(numero);
    }

    public void imprimirEstrelles(int num) {

        for (int i = 0; i < num; i++) {
            System.out.print("*" + " ");
        }
    }
}
