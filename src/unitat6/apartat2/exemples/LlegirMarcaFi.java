package unitat6.apartat2.exemples;
import java.io.File;
import java.util.Scanner;

public class LlegirMarcaFi {
    public static final int MARCA_FI = -100;
    public static void main(String[] args) {
        LlegirMarcaFi programa = new LlegirMarcaFi();
        programa.inici();
    }

    public void inici() {
        try {
            // S'intenta obrir el fitxer
            File f = new File("C:/Jaime/Programaci�n/FPoberta/JavaIOC/src/unitat6/out/production/unitat6/unitat6/EntersMarca.txt");
            Scanner lector = new Scanner(f);
            // Aquesta estrat�gia es basa en un sem�for
            boolean llegir = true;
            // Si s'executa aquesta instrucci�, s'ha obert el fitxer
            while (llegir) {
                int valor = lector.nextInt();
                if (valor == MARCA_FI) {
                    // Marca de finalitzaci�. Ja s'ha acabat la lectura
                    llegir = false;
                } else {
                    // Encara no s'ha acabat. Tractar dada
                    System.out.println("El valor llegit �s: " + valor);
                }
            }
            // Cal tancar el fitxer
            lector.close();
        } catch (Exception e) {
            // Excepci�!!
            System.out.println("Error: " + e);
        }
    }
}
