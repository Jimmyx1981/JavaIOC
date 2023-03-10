package unitat6.apartat2.exemples;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Random;

public class SeekCreixFitxerBinari {
    public static final String NOM_FITXER = "Seek.bin";
    public static void main(String[] args) {
        SeekCreixFitxerBinari programa = new SeekCreixFitxerBinari();
        programa.inici();
    }

    public void inici() {
        File f = new File(NOM_FITXER);
        crearFitxer(f);
        System.out.println("La mida inicial ?s " + f.length());
        executaSeek(f);
        System.out.println("La mida a l'hora de fer seek i escriure ?s " + f.length());
    }

    /** Crea un fitxer qualsevol de 80 bytes.
     *
     * @param f Ruta del fitxer a crear
     */
    public void crearFitxer(File f) {
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for (int i = 0; i < 20; i++) {
                raf.writeInt(i);
            }
            raf.setLength(20*4);
            raf.close();
        } catch (Exception e) {
            // Excepci?!
            System.out.println("Error escrivint dades: " + e);
        }
    }

    /** Crea un fitxer qualsevol de 80 bytes
     *
     * @param f Ruta del fitxer a crear.
     */
    public void executaSeek(File f) {
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            // Se'n va 20 bytes m?s enll? de la mida del fitxer.
            raf.seek(f.length() + 20);
            // S'escriu un valor qualsevol
            raf.writeInt(100);
            raf.close();
        } catch (Exception e) {
            // Excepci?!!
            System.out.println("Error escrivint dades: " + e);
        }
    }
}
