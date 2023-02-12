package unitat6.apartat1.exemples;
// Cal importar la classe File
import  java.io.File;

public class FileObtenirRuta {
    public static void main(String[] args) {
        FileObtenirRuta programa = new FileObtenirRuta();
        programa.inici();
    }

    public void inici(){
        // S'inicialitzen dues rutes absolutes diferents
        File carpertaAbs = new File("c:/Temp");
        File fitxerAbs = new File("c:/Temp/Document.txt");
        // I unes rutes relatives
        File carpetaRel = new File("Temp");
        File fitxerRel = new File("Temp/Document.txt");
        // Mostrem dades de cadascuna
        mostrarRutes(carpertaAbs);
        mostrarRutes(fitxerAbs);
        mostrarRutes(carpetaRel);
        mostrarRutes(fitxerRel);
    }

    public void mostrarRutes(File f){
        System.out.println("La ruta �s " + f.getAbsolutePath());
        System.out.println("El seu pare �s " + f.getParent());
        System.out.println("El seu nom �s " + f.getName() + "\n");
    }
}
