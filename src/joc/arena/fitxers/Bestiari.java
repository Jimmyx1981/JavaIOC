package joc.arena.fitxers;
import joc.arena.regles.Lluitador;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Random;
/**
 *
 * @author jmart
 */
public class Bestiari {
    // Constant amb el nom del fitxer d'adversaris
    private static final File ADVERSARIS = new File("C:\\Jaime\\Programación\\FPoberta\\JavaIOC\\src\\joc\\arena\\fitxers\\Adversaris");
    // Jugador: ID = 0
    private int[] jugador = {0, 1, 0, 10, 10, 3, 3, 3, 3};
    private Lluitador lluitador = new Lluitador();
    // Tots els mètodes mantenen la seva declaració (nom i paràmetres)
    /** Genera un nou jugador
     * 
     * @return Un array amb les dades d'un jugador inicial
     */
    public int[] generarJugador() {
        lluitador.renovar(jugador);
        return jugador;
    }
    
    /** Donat un nom, genera l'adversari a obtenir.
     * 
     * @param nomAdv Nom de l'adversari a obtenir
     * @return El lluitador amb aquest nom, o null si no existeix
     */
    public int[] cercarAdversari(String nomAdv) {
        try {
            int[] adversari = null;
            RandomAccessFile raf = new RandomAccessFile(ADVERSARIS, "r");
            long numAdv = ADVERSARIS.length()/50;
            for (int i = 0; i < numAdv; i++) {
                raf.seek(50*i);
                String nom = llegirNom(raf);
                if (nom.equalsIgnoreCase(nomAdv)) {
                    adversari = crearAdversari(raf, i);
                }
            }
            raf.close();
            return adversari;
        } catch (Exception e) {
            return null;
        }
    }

    /** Obté l'adversari que hi ha en un ordre concret del fitxer,
     * en format array.
     *
     * @param raf Fitxer relatiu d'on llegir-lo
     * @param pos Posició de l'adversari dins del fitxer
     * @return Lluitador llegit
     */
    public int[] crearAdversari(RandomAccessFile raf, int pos) {
        try {
            int[] adversari = new int[9];
            raf.seek(pos * 50 + 30);
            adversari[0] = pos + 1;
            adversari[1] = raf.readInt();
            adversari[2] = raf.readInt();
            adversari[3] = raf.readInt();
            adversari[4] = adversari[3];
            adversari[5] = raf.readInt();
            adversari[6] = adversari[5];
            adversari[7] = raf.readInt();
            adversari[8] = adversari[7];
            return adversari;
        } catch (Exception e) {
            return null;
        }
    }

    /** Donat un fitxer relatiu orientat a byte, correctament posicionat,
     * llegeix el nom de l'adversari.
     *
     * @param raf Fitxer a tractar
     * @return Nom llegit, o null si hi ha error
     */
    public String llegirNom(RandomAccessFile raf) {
        try {
            String nom = "";
            char c = raf.readChar();
            while (c != 0x0000) {
                nom = nom + c;
                c = raf.readChar();
            }
            return nom;
        } catch (Exception e) {
            return null;
        }
    }
    
    /** Donat un nivell, genera l'adversari corresponent a l'atzar. Es tracta
     * d'un adversari que sigui d'aquest nivell almenys.
     * 
     * @param nivell Nivell proper al de l'adversari a obtenir
     * @return Un adversari
     */
    public int[] triarAdversariAtzar(int nivell) {
        try {
            RandomAccessFile raf = new RandomAccessFile(ADVERSARIS, "r");
            Random rnd = new Random();
            int numAdv = (int)raf.length()/50;
            int[] adversari = null;
            boolean cercar = true;
            while (cercar) {
                int i = rnd.nextInt(numAdv);
                adversari = crearAdversari(raf, i);
                int nivellAdv = lluitador.llegirNivell(adversari);
                int dif = nivell - nivellAdv;
                if ((dif >= -1)&&(dif <= 1)) {
                    cercar = false;
                }
            }
            raf.close();
            return adversari;
        } catch (Exception e) {
            return null;
        }
    }
    
    /** Transforma un identificador de lluitador al seu nom.
     * 
     * @param id Identificador
     * @return La cadena de text amb el nom
     */
    public String traduirIdANom(int id) {
        if (id == 0) {
            return "Aventurer";
        }
        id--;
        try {
            RandomAccessFile raf = new RandomAccessFile(ADVERSARIS, "r");
            int pos = 50 * id;
            String nom = "DESCONEGUT";
            if (pos < raf.length()) {
                raf.seek(pos);
                nom = llegirNom(raf);
            }
            raf.close();
            return nom;
        } catch (Exception e) {
            return "DESCONEGUT";
        }
    }

    /** Diu si hi ha el fitxer d'adversaris
     *
     * @return Si existeix (true) o no (false)
     */
    public boolean existeixFitxer() {
        return ADVERSARIS.isFile();
    }
}
