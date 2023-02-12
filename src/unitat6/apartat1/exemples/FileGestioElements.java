package unitat6.apartat1.exemples;
import java.io.File;
import java.io.IOException;

public class FileGestioElements {
    public static void main(String[] args) throws IOException {
        FileGestioElements programa = new FileGestioElements();
        programa.inici();
    }

    public void inici() throws IOException {
        File fotos = new File("C:/Temp/Fotos");
        File document = new File("C:/Temp/Document.txt");
        boolean resultat = fotos.mkdirs();
        boolean crearDocument = document.createNewFile();
        System.out.println("Creada carpeta " + fotos.getName() + "? " + resultat);
        System.out.println("Creat fitxer " + document.getName() + "? " + crearDocument);
        if (!resultat) {
            boolean delCarpeta = fotos.delete();
            System.out.println("Esborrada carpeta " + fotos.getName() + "? " +
                    delCarpeta);
            boolean delFitxer = document.delete();
            System.out.println("Esborrat fitxer " + document.getName() + "? " +
                    delFitxer);
        }
    }
}
