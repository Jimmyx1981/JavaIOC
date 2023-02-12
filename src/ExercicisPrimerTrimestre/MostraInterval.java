import java.util.Scanner;
public class MostraInterval {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introdueix el primer valor enter: ");
        int n1 = lector.nextInt();
        System.out.println("Introdueix el segon nombre enter: ");
        int n2 = lector.nextInt();
        
        if (n1 < n2){
            for (int i=n1; i<=n2; i++ ){
                System.out.println(i);
            }
        } else {
            System.out.println("El numero es incorrecte");
        }
    }
    
}
