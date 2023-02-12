import java.util.Scanner;
//Llegeix un enter, comprovant que sigui correcte.
public class LecturaEnter {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int valor = 0;
        System.out.println("Esciu un valor enter: ");
        if (lector.hasNextInt()) {
            System.out.println("El valor era " + valor + ".");
        } else {
            lector.next();
            System.out.println("El valor no era enter.");
        }
        lector.nextLine();
    }
}
