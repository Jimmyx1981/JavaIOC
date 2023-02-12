import java.util.Scanner;
//Un programa que evalua si un nombre es multiple de set.
public class MultipleDeSet {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int valor = 0;
        boolean multiple = false;
        System.out.println("Introdueix un nombre enter: ");
        multiple = lector.hasNextInt();
        if (multiple) {
            valor = lector.nextInt();
            if (valor %7 == 0) {
                System.out.println("El nombre es multiple de set.");
            } else {
                System.out.println("El nombre no es multiple de set.");
            }
        }
    }
}
