import java.util.Scanner;
public class GeneradorAcronims {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una línia de text qualsevol i pitja retorn:");
        String text = lector.nextLine();
        //Dividim la frase en paraules, separades per espais.
        String[] paraules = text.split(" ");
        //Recorrem les paraules i escrivim cada inicial.
        for (int i = 0; i < paraules.length; i++) {
            System.out.println(paraules[i].charAt(0));
        }
        System.out.println();
    }
}
