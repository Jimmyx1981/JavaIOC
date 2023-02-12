package unitat6.apartat2.exemples;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ModificaValorsParells {
    public static final String NOM_FITXER = "Enters.txt";
    public static void main(String[] args) {
        ModificaValorsParells programa = new ModificaValorsParells();
        programa.inici();
    }

    public void inici() {
        // Es llegeixen els valors
        int[] valors = llegirDades(NOM_FITXER);
        if (valors != null) {
            // S'han pogut llegir les dades correctament.
            // Es modifiquen
            for (int i = 0; i < valors.length; i = i + 2) {
                valors[i] = valors[i] + 5;
            }
            // Es tornen a escriure tots al fitxer original
            escriureArray(NOM_FITXER, valors);
        } else {
            // Ha succe�t un error llegint les dades
            System.out.println("Hi ha hagut un error llegint les dades.");
        }
    }

    /** Donat el nom d'un fitxer, llegeix els seus valors i el carrega en un
     * array d'enters.
     * @param nom Nom del fitxer
     * @return Array amb les dades carregades des del fitxer
     */
    public int[] llegirDades(String nom) {
        try {
            File f = new File(nom);
            Scanner lector = new Scanner(f);
            int mida = lector.nextInt();
            int[] dades = new int[mida];
            for (int i = 0; i < mida; i++) {
                dades[i] = lector.nextInt();
            }
            return dades;
        } catch (Exception e) {
            // No s'han pogut llegir les dades...
            return null;
        }
    }

    /** Donat un nom de fitxer i un array d'enters, l'escriu a aquest fitxer.
     *
     * @param nom Nom de la ruta del fitxer destinaci�.
     * @param dades dades Array amb les dades que cal escriure
     */
    public void escriureArray(String nom, int[] dades) {
        try {
            // S'intenta crear el fitxer
            File f = new File(nom);
            PrintStream escriptor = new PrintStream(f);
            // Primer s'escriu el nombre de valors
            escriptor.print(dades.length);
            // S'escriuen els valors de l'array, separats per espais
            for (int dade : dades) {
                escriptor.print(" " + dade);
            }
            System.out.println("Fitxer generat satisfact�riament.");
            // Cal tancar el fitxer
            escriptor.close();
        } catch (Exception e) {
            // Excepci�!!
            System.out.println("Error escrivint dades: " + e);
        }
    }
}
