package unitat6.apartat2.reptes;
import java.io.File;
import java.util.Scanner;

public class LlegirEnters {

    public static final int NUM_VALORS = 15;
    public static void main(String[] args) {
        LlegirEnters programa = new LlegirEnters();
        programa.inici();
    }

    public void inici(){
        Scanner lector = null;
        try {
           // S'intenta obrir el fitxer
           File f = new File("Reals.txt");
           lector = new Scanner(f);
           // De moment, el m�xim �s el primer valor
            double maxim = lector.nextDouble();
            // Recorrem la resta de valors
            for (int i = 1; i < NUM_VALORS; i++){
                double valor = lector.nextDouble();
                // El nou valor �s m�s gran?
                if (maxim < valor){
                    maxim = valor;
                }
            }
            System.out.println("El valor m�s gran �s: " + maxim);
        } catch (Exception e) {
            // Excepci�!
            System.out.println("Error: " + e);
        }
        // Amb error o sense, cal tancar el fitxer
        assert lector != null;
        lector.close();
    }
}
