package joc.arena.fitxers;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Ranquing {
    // Nom fitxer com a constant
    public static final String RANQUING = "Ranquing";

    /** Crea el fitxer de puntuacions inicial
     *
     * @return 0 si tot correcte, -1 si error
     */
    public int generarFitxerInicial() {
        try {
            File ranquing = new File(RANQUING);
            if (ranquing.isFile() == false) {
                PrintStream ps = new PrintStream(ranquing);
                for (int i = 0; i < 10; i++) {
                    ps.println("IOC " + (10 -i) * 10);
                }
                ps.close();
            }
            return 0;
        } catch (Exception e) {
            // Propagació d'error
            return -1;
        }
    }

    /** Donada una puntuació, estableix la seva posició al fitxer
     *
     * @param punts Punts que cal comprovar
     * @return Posició per a la puntuació. -1 si error.
     */
    public int cercarRanking(int punts) {
        try {
            int err = generarFitxerInicial();
            if (err == -1) {
                return -1;
            }
            File ranquing = new File(RANQUING);
            Scanner lector = new Scanner(ranquing);
            int pos = 0;
            while (pos < 10) {
                lector.next();
                if (lector.hasNextInt()) {
                    int ranqPts = lector.nextInt();
                    if (punts > ranqPts) {
                        return pos;
                    }
                } else {
                    // Error en el format del fitxer
                    return -1;
                }
                pos++;
            }
            lector.close();
            return pos;
        } catch (Exception e) {
            return -1;
        }
    }

    /** Insereix una puntuació al ranquing
     *
     * @param inicials Inicials del jugador
     * @param punts Puntuació assolida
     * @param pos Posició dins del ranquing
     * @return 0 si tot correcte, -1 si error.
     */
    public int entrarPuntuacio(String inicials, int punts, int pos) {
        try {
            int err = generarFitxerInicial();
            if (err == -1) {
                return -1;
            }
            File ranquing = new File(RANQUING);
            Scanner lector = new Scanner(ranquing);
            File tmp = new File(RANQUING + ".temp");
            PrintStream ps = new PrintStream(tmp);
            // Reescriure anteriors a posició
            for (int i = 0; i < pos; i++) {
                String txt = lector.nextLine();
                ps.println(txt);
            }
            // Escriure una nova puntuació
            ps.println(inicials + " " + punts);
            // Reescriure posteriors a posició
            for (int i = pos + 1; i < 10; i++) {
                String txt = lector.nextLine();
                ps.println(txt);
            }
            ps.close();
            lector.close();
            // S'esborra el fitxer antic i es posa el nou
            ranquing.delete();
            tmp.renameTo(ranquing);
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    /** Llegeix les puntuacions i les formata com una cadena de text
     *
     * @return Cadena de text resultant. null si hi ha error.
     */
    public String llegirRanquing() {
        try {
            int err = generarFitxerInicial();
            if (err == -1) {
                return null;
            }
            String txtRanquing = "Ranquing de puntuacions\n------------------------\n";
            File ranquing = new File(RANQUING);
            Scanner lector = new Scanner(ranquing);
            for (int i = 0; i < 10; i++) {
                // Llegir inicials
                txtRanquing = txtRanquing + lector.next();
                // Llegir punts
                if (lector.hasNextInt()) {
                    txtRanquing = txtRanquing + "\t" + lector.nextInt() + "\n";
                } else {
                    // Error en el format del fitxer
                    return null;
                }
            }
            lector.close();
            return txtRanquing;
        } catch (Exception e) {
            return null;
        }
    }
}
