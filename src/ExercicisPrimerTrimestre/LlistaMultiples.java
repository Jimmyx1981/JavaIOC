import java.util.Scanner;
public class LlistaMultiples {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introdueixi el primer nombre positiu: ");
        int n1 = lector.nextInt();
        lector.nextLine();
        
        System.out.println("Introdueixi el segon nombre positiu");
        int n2 = lector.nextInt();
        lector.nextLine();
        
        if (n1 < n2) {
            int valor = n1;
            for (int i=2; valor<=n2; i++){
                System.out.println(valor);
                valor = n1 * i;
            }
        } else {
            System.out.println("El primer nombre es més gran que el segon nombre.");
        }
    }
    
}
