package unitat6.apartat2.exemples;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SobreescriureEntersBinari {
    public static void main(String[] args) {
        SobreescriureEntersBinari programa = new SobreescriureEntersBinari();
        programa.inici();
    }

    public void inici() {
        try {
            File f = new File("C:\\Jaime\\Programación\\FPoberta\\JavaIOC\\src\\unitat6\\apartat2\\exemples\\Enters.bin");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            // L'apuntador està al primer byte
            long apuntador = raf.getFilePointer();
            System.out.println("Inici: Apuntador a posició " + apuntador);
            // Sobreescrivim els primers cinc valors
            for (int i = 0; i < 5; i++) {
                raf.writeInt(-1);
            }
            // Si el fitxer ja tenia més de cinc enters, al final hi ha brossa
            apuntador = raf.getFilePointer();
            System.out.println("Fi: Apuntador a posició " + apuntador);
        } catch (IOException e) {
            // Excepció
            System.out.println("Error escrivint dades: " + e);
        }
    }
}
