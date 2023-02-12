import java.util.Scanner;
public class CercarDivisor {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Quin nombre vols analitzar? ");
        int valor = lector.nextInt();
        lector.nextLine();
        
        boolean trobat = false;
        int divisor = valor - 1;
        
        while ((!trobat)&&(divisor > 1)){
            if ((valor % divisor) == 0){
                trobat = true;
            } else {
                divisor--;
            }
        }
        if (divisor == 1){
            System.out.println("No s'ha trobat cap divisor.");
        } else {
            System.out.println("El divisor és " + divisor + ".");
        }
    }
    
}
