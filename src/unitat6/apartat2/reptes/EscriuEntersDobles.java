package unitat6.apartat2.reptes;
import java.io.File;
import java.io.PrintStream;

public class EscriuEntersDobles {

    public static final int NUM_VALORS = 20;
    public static void main(String[] args) {
        EscriuEntersDobles programa = new EscriuEntersDobles();
        programa.inici();
    }

    public void inici() {
        PrintStream escriptor = null;
        try {
            // S'intenta obrir el fitxer
            File f = new File("Enters.txt");
            escriptor = new PrintStream(f);
            // S'escriu el primer valor, que no necessita un espai abans
            int valor = 1;
            escriptor.print(valor);
            // Es van generant la resta de valors i escrivint
            for (int i = 1; i < 20; i++) {
                if (i % 5 == 0) {
                    // Cada 5 elements, s'escriu com a delimitador un salt de línia
                    escriptor.print("\n");
                } else {
                    // Si no, s'escriu com a delimitador un espai en blanc
                    escriptor.print(" ");
                }
                // Es calcula i escriu el nou valor
                valor = valor * 2;
                escriptor.print(valor);
            }
            System.out.println("Fitxer escrit satisfactòriament.");
        } catch (Exception e) {
            //Amb error o sense, cal tancar el fitxer
            assert escriptor != null;
            escriptor.close();
        }
    }
}
