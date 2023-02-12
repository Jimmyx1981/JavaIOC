import java.util.Scanner;
//Un programa que diu si un nombre es parell o senar.
public class ParellOSenar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean enter = false;
        int valor = 0;
        System.out.println("Introdueix un nombre enter: ");
        //Si el nombre es enter es compleix la condició.
        enter = lector.hasNextInt();
        if(enter) {
            valor = lector.nextInt();
            //Si la resta de dividir el nombre entre 2 es 0 es parell.
            if (valor%2 == 0){
                System.out.println("El nombre es parell");
            } else {
                System.out.println("El nombre es senar");
            }
        }
    }
    
}
