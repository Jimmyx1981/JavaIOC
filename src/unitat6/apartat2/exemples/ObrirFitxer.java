package unitat6.apartat2.exemples;
import java.io.File;
import java.util.Scanner;

public class ObrirFitxer {
    public static void main(String[] args) {
        ObrirFitxer programa = new ObrirFitxer();
        programa.inici();
    }

    public void inici() {
        try {
          // Bloc "try": operacions d'entrada / sortida.
          // S'intenta obrir un fitxer per a la lectura
            File f = new File("Document.txt");
            Scanner lector = new Scanner(f);
            // El fitxer existeix tot correcte
            System.out.println("Fitxer obert correctament.");
            System.out.println("Enhorabona!");
        } catch (Exception e) {
            // Bloc "catch": Tractament d'errors.
            // S'ha produït una excepció en algun lloc del bloc "try"!
            System.out.println("Error: " + e);
        }
        // Les instruccions fora de la sentència "try/catch" sempre s'executen.
        // Igual que les que hi ha després d'una sentència "if/else"
        System.out.println("Finalització del programa...");
    }
}
