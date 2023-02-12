import java.util.Scanner;
public class SumaInterval {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       
        System.out.println("Introdueix el primer nombre: ");
        int n1 = lector.nextInt();
        lector.nextLine();
        
        System.out.println("Introdueix el segon nombre: ");
        int n2 = lector.nextInt();
        lector.nextLine();
        
        int acumulador = 0;
        
        if (n1 < n2){
            for (int i=n1; i<n2; i++){
                acumulador = acumulador + i;
            }
            System.out.println("La suma total és " + acumulador + ".");
        } else {
            System.out.println("n2 no és més gran que n1!");
        }
    }
    
}
