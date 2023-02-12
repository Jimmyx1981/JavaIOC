package unitat6.apartat2.reptes;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Random;

public class CalculsRealsBinari {
    public static void main(String[] args) {
        CalculsRealsBinari programa = new CalculsRealsBinari();
        programa.inici();
    }

    public void inici() {
        File f = new File("Reals.bin");
        crearReals(f);
        double[] valors = llegirReals(f);
        if (valors != null) {
            // Tot correcte
            Arrays.sort(valors);
            for (int i = valors.length -1; i >= 0; i--) {
                System.out.println(valors[i]);
            }
        } else {
            // Hi ha hagut un error en la lectura
            System.out.println("Error llegint dades.");
        }
    }

    /** Donat un fiter orientat a byte amb reals, els llegeix tots
     * i els posa a un array.
     * @param f Ruta del fitxer a llegir
     * @return Array de reals
     */
    public double[] llegirReals(File f) {
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "r");
            // Càlcul del nombre de reals
            long numReals = f.length() / 8;
            // Per inicialitzar un array cal un "int", no un "long"
            int n = (int)numReals;
            double[] array = new double[n];
            for (int i = 0; i < numReals; i++) {
                array[i] = raf.readDouble();
            }
            raf.close();
            return array;
        } catch (Exception e) {
            // Excepció!
            return null;
        }
    }

    /** Genera un fitxer orientat a byte amb 20 valors reals, entre 0 i 100
     * a l'atzar.
     *
     * @param f Ruta del fitxer a generar.
     */
    public void crearReals(File f) {
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            Random r = new Random();
            for (int i = 0; i < 20; i++) {
                raf.writeDouble(100*r.nextDouble());
            }
            raf.close();
        } catch (Exception e) {
            System.out.println("Error generant fitxer: " + e);
        }
    }
}
