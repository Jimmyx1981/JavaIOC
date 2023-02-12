import java.util.Scanner;
//Un programa que evalua la temperatura introduïda per l'usuari i le diu si te
//febre o no.
public class TeFebre {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int temperatura = 0;
        boolean sencer = false;
        
        System.out.println("Quina temperatura tens?");
        sencer = lector.hasNextInt();
        
        if (sencer) {
            temperatura = lector.nextInt();
            if (temperatura < 35) {
                System.out.println("Tens hipotermia.");
            }
            if (temperatura >= 35 && temperatura <= 37) {
                System.out.println("Temperatura normal.");
            }
            if (temperatura >= 37 && temperatura <= 38) {
                System.out.println("Tens febricula.");
            }
            if (temperatura > 38) {
                System.out.println("Tens febre.");
            }
        } else {
            System.out.println("La temperatura no es correcta.");
        }
    }    
}
