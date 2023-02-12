package unitat6.apartat1.exemples;
import java.io.File;

public class FileLListarElements {
    public static void main(String[] args) {
        FileLListarElements programa = new FileLListarElements();
        programa.inici();
    }

    public void inici() {
        File carpeta = new File("C:/Temp/Nova Carpeta");
        File[] arrayElements = carpeta.listFiles();
        System.out.println("El contingut de " + carpeta.getAbsolutePath() + " és:");
        // Per recórrer un array, s'usa un bucle
        for (int i = 0; i < arrayElements.length; i++) {
            File f = arrayElements[i];
            if (f.isDirectory()) {
                System.out.print("[DIR] ");
            } else {
                System.out.print("[FIT] ");
            }
            System.out.println(f.getName());
        }
    }
}
