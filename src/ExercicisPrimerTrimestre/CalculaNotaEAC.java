package ExercicisPrimerTrimestre;
import java.util.Scanner;

public class CalculaNotaEAC {
    public static final String NO_PRESENTAT = "N";
    public static final String SUSPES = "D";
    public static final String APROVAT = "C";
    public static final String NOTABLE = "B";
    public static final String EXCEL_LENT = "A";
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nota = 0;
        boolean sencer = false;
        String entregat = "si";
        String resposta = "";
        
        System.out.println("Has entregat el trevall?");
        resposta = lector.next();
        
        if (entregat.equals(resposta)) {
            System.out.println("Introdueix la teva nota:");
            sencer = lector.hasNextInt();
        
            if (sencer) {
                nota = lector.nextInt();
                
                if (nota < 5) {
                    System.out.println("La teva nota es: " + SUSPES);
                }
                
                if (nota >= 5 && nota < 7) {
                    System.out.println("La teva nota es: " + APROVAT);
                }
                
                if (nota >= 7 && nota <= 8) {
                    System.out.println("La teva nota es: " + NOTABLE);
                }
                
                if (nota >= 9 && nota <= 10) {
                    System.out.println("La teva nota es: " + EXCEL_LENT);
                }
            } else {
                System.out.println("La nota no es correcta");
            }
        } else {
            System.out.println("No has entregat el trevall, la teva nota es: " + NO_PRESENTAT);
        }
    }
}
