package unitat6.apartat2.exemples;
import java.io.File;
import java.io.RandomAccessFile;

public class LlegirEntersRelatiu {
    public static void main(String[] args) {
        LlegirEntersRelatiu programa = new LlegirEntersRelatiu();
        programa.inici();
    }

    public void inici() {
        try {
            File f = new File("C:\\Jaime\\Programaci�n\\FPoberta\\JavaIOC\\src\\unitat6\\apartat2\\exemples\\Enters.bin");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            long numEnters = f.length()/4;
            long meitat = numEnters/2;
            // Apuntador a l'inici de l'enter a la meitat del fitxer
            raf.seek(meitat*4);
            long pos = raf.getFilePointer();
            // Es llegeix fins a arribar al final del fitxer
            do {
                System.out.print("(apuntador a la posici� " + pos + ") ->");
                // Es llegeix un enter
                int valor = raf.readInt();
                System.out.println("S'ha llegit el valor " + valor);
                // Se salta l'enter seg�ent (4 bytes)
                raf.skipBytes(4);
                pos = raf.getFilePointer();
            } while (pos < f.length());
            raf.close();
        } catch (Exception e) {
            // Excepci�!!
            System.out.println("Error llegint dades: " + e);
        }
    }
}
