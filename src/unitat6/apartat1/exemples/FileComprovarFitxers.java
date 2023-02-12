package unitat6.apartat1.exemples;
import java.io.File;

public class FileComprovarFitxers {

    public static void main(String[] args) {
        FileComprovarFitxers programa = new FileComprovarFitxers();
        programa.inici();
    }

    public void inici(){
        File temp = new File("C:/Temp");
        File fotos = new File ("C:/Temp/Fotos");
        File document = new File ("C:/Temp/Document.txt");
        System.out.println(temp.getAbsolutePath() + " existeix? " + temp.exists());
        mostrarEstat(fotos);
        mostrarEstat(document);
    }

    public void mostrarEstat(File f) {
        System.out.println(f.getAbsolutePath() + " �s un fitxer? " + f.isFile());
        System.out.println(f.getAbsolutePath() + " �s una carpeta? " + f.isDirectory());
    }
}


