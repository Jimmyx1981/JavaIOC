package unitat6.apartat2.exemples;
import java.io.File;
import java.io.RandomAccessFile;

public class EscriureEntersDoublesBinari {
    public static void main(String[] args) {
        EscriureEntersDoublesBinari programa = new EscriureEntersDoublesBinari();
        programa.inici();
    }

    public void inici() {
        try {
            File f = new File("C:\\Jaime\\Programación\\FPoberta\\JavaIOC\\src\\unitat6\\apartat2\\exemples\\Enters.bin");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            // Ara no hi ha delimitadors. S'escriuen els valors consecutius.
            // Es van generant els valors i escrivint
            int valor = 1;
            for (int i = 0; i < 20; i++) {
                raf.writeInt(valor);
                valor = valor*2;
            }
            System.out.println("Fitxer escrit satisfactòriament.");
            // La mida d'un enter són 4 bytes.
            // La mida del fitxer hauria de ser 20*4 = 80 bytes
            // No oblidar-se de tancar el fitxer
            raf.close();
        } catch (Exception e) {
            // Excepció!!
            System.out.println("Error escrivint dades: " + e);
        }
    }
}
