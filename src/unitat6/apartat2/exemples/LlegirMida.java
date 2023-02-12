package unitat6.apartat2.exemples;
import java.io.File;
import java.util.Scanner;

public class LlegirMida {
    public static void main(String[] args) {
        LlegirMida programa = new LlegirMida();
        programa.inici();
    }

    public void inici() {
        try {
            // S'intenta obrir el fitxer
            File f = new File("C:/Jaime/Programaci�n/FPoberta/JavaIOC/src/unitat6/out/production/unitat6/unitat6/EntersMida.txt");
            Scanner lector = new Scanner(f);
            // Es llegeix la mida
            int mida = lector.nextInt();
            System.out.println("Hi ha " + mida + " valors.");
            // Si s'executa aquesta instrucci�, s'ha obert el fitxer
            for (int i = 0; i < mida; i++) {
                int valor = lector.nextInt();
                System.out.println("El valor llegit �s: " + valor);
            }
            // Cal tancar el fitxer
            lector.close();
        } catch (Exception e) {
            // Excepci�!!
            System.out.println("Error: " + e);
        }
    }
}
