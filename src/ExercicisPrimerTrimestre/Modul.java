import java.util.Scanner;
//Un programa que llegeix un enter i el mostra per pantalla.
public class Modul {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //PAS 1 i 2
        System.out.println("Quin és el dividend?");
        int dividend = lector.nextInt();
        //PAS 2 i 3
        System.out.println("Quin és el divisor?");
        int divisor = lector.nextInt();
        lector.nextLine();
        //PAS 5
        while (dividend >= divisor){
            //PAS 6
            int divisio = dividend / divisor;
            dividend = dividend - divisor;
            System.out.println("El resultat de la divisio es " + divisio);
            System.out.println("Bucle: per ara el dividend val " + dividend + ".");
            //PAS 7: Simplement equival a dir que fem la volta al bucle paer avaluar
            //la condició
        }
        System.out.println("El resultat final és " + dividend + ".");
    }
    
}
