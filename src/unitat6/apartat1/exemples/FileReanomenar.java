package unitat6.apartat1.exemples;
import java.io.File;
import java.io.IOException;

public class FileReanomenar {
    public static void main(String[] args) throws IOException {
        FileReanomenar programa = new FileReanomenar();
        programa.inici();
    }

    public void inici() throws IOException {
        File document = new File("C:/Temp/Document.txt");
        boolean documentCreat = false;
        if (!document.exists()) {
            documentCreat = document.createNewFile();
        }
        if (documentCreat) {
            File rutaOrigen = new File("C:/Temp/Document.txt");
            // Reanomenar: mateixa ruta pare però diferent nom final
            String nouNom = rutaOrigen.getParent() + File.separator + "Reanomenat.txt";
            File rutaDesti = new File(nouNom);
            rutaOrigen.renameTo(rutaDesti);
        } else {
            System.out.println("Error en la creació del fitxer.");
        }

    }
}
