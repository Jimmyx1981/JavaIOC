package unitat6.apartat2.exemples;
import java.io.File;
import java.util.Scanner;

public class MitjanaVocals {
    // La paraula "fi" serveix com a marca de final de fitxer
    public static final String MARCA_FI = "fi";
    public static void main(String[] args) {
        MitjanaVocals programa = new MitjanaVocals();
        programa.inici();
    }

    public void inici() {
        try {
            // S'intenta obrir el fitxer
            File f = new File("Document.txt");
            Scanner lector = new Scanner(f);
            // Dades a recopilar
            int numParaules = 0;
            int numVocals = 0;
            // Marca de finalitzaci� de lectura
            boolean llegir = true;
            while (llegir) {
                String paraula = lector.next();
                if (MARCA_FI.equals(paraula)) {
                    // Marca de final
                    llegir = false;
                } else {
                    // Tractar dada
                    numParaules++;
                    numVocals = numVocals + comptarVocals(paraula);
                }
            }
            System.out.println("Hi ha " + numParaules + " paraules.");
            System.out.println("Hi ha " + numVocals + " vocals.");
            double mitjana = numVocals/numParaules;
            System.out.println("La mitjana �s " + mitjana);
            // Cal tancar el fitxer
            lector.close();
        } catch (Exception e) {
            // Excepci�!!
            System.out.println("Error: " + e);
        }
    }

    /** Compta les vocals en una paraula
     *
     * @param paraula Cadena de text on cal comptar les vocals
     * @return Nombre de vocals
     */
    public int comptarVocals(String paraula) {
        int res = 0;
        // Es passa a min�scula tot per fer-ho m�s f�cil
        paraula = paraula.toLowerCase();
        for (int i = 0; i < paraula.length(); i++) {
            if (esVocal(paraula.charAt(i))) {
                res++;
            }
        }
        return res;
    }

    /** Diu si, donat un car�cter en min�scula, aquest �s o no una vocal
     *
     * @param c Car�cter a comprovar
     * @return Si �s (true) o no (false) una vocal
     */
    public boolean esVocal(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}
