package unitat6.apartat2.exemples;
import java.io.File;
import java.util.Scanner;

public class LlegirEnters {
    public static final int NUM_VALORS = 10;
    public static void main(String[] args) {
        LlegirEnters programa = new LlegirEnters();
        programa.inici();
    }

    public void inici() {
        try {
            // S'intenta obrir el fitxer
            File f = new File("C:/Jaime/Programaci�n/FPoberta/JavaIOC/src/unitat6/apartat2/exemples/Enters.txt");
            Scanner lector = new Scanner(f);
            // Si s'executa aquesta instrucci�, s'ha obert el fitxer
            for (int i = 0; i < NUM_VALORS; i++) {
                int valor = lector.nextInt();
                System.out.println("El valor llegit �s: " + valor);
            }
            // Cal tancar el fitxer
            lector.close();
        } catch (Exception e) {
            // Excepci�!
            System.out.println("Error: " + e);
        }
    }
}
