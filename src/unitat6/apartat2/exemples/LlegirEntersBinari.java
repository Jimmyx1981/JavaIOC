package unitat6.apartat2.exemples;
import java.io.File;
import java.io.RandomAccessFile;

public class LlegirEntersBinari {
    public static void main(String[] args) {
        LlegirEntersBinari programa = new LlegirEntersBinari();
        programa.inici();
    }

    public void inici() {
        try {
            File f = new File("Enters.bin");
            RandomAccessFile raf = new RandomAccessFile(f, "r");
            // Càlcul del nombre d'enters
            long numEnters = f.length() / 4;
            System.out.println("Hi ha " + numEnters + " enters.");
            for (int i = 0; i < numEnters; i++) {
                int valor = raf.readInt();
                System.out.println("S'ha llegit el valor " + valor);
            }
            raf.close();
        } catch (Exception e) {
            // Excepció!!
            System.out.println("Error en lectura: " + e);
        }
    }
}
