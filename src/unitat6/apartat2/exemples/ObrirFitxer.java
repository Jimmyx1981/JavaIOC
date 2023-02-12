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
            // S'ha produ�t una excepci� en algun lloc del bloc "try"!
            System.out.println("Error: " + e);
        }
        // Les instruccions fora de la sent�ncia "try/catch" sempre s'executen.
        // Igual que les que hi ha despr�s d'una sent�ncia "if/else"
        System.out.println("Finalitzaci� del programa...");
    }
}
