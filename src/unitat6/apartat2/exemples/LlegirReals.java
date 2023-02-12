package unitat6.apartat2.exemples;
import java.io.File;
import java.util.Scanner;

public class LlegirReals {
    public static final int NUM_VALORS = 15;
    public static void main(String[] args) {
        LlegirReals programa = new LlegirReals();
        programa.inici();
    }

    public void inici() {
        try {
            // S'intenta obrir el fitxer
            File f = new File("Reals.txt");
            Scanner lector = new Scanner(f);
            float valorMesGran = 0;
            // Si s'executa aquesta instrucció, s'ha obert el fitxer
            for (int i = 0; i < NUM_VALORS; i++) {
                float valor = lector.nextFloat();
                System.out.println("El valor llegit és: " + valor);
                if (valor > valorMesGran) {
                    valorMesGran = valor;
                }
            }
            System.out.println("El valor més gran es: " + valorMesGran);
            // Cal tancar el fitxer
            lector.close();
        } catch (Exception e) {
            // Excepció!
            System.out.println("Error: " + e);
        }
    }
}
