package unitat6.apartat1.reptes;
import java.io.File;
import java.util.Scanner;

public class NetejarCarpeta {

    Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        NetejarCarpeta programa = new NetejarCarpeta();
        programa.inici();
    }

    public void inici() {
        File rutaCarpeta = llegirRutaCarpeta();
        netejarCarpeta(rutaCarpeta);
    }

    /** Pregunta a l'usuari el nom de la carpeta, i d'aquest obt? una ruta.
     *
     * @return ruta carpeta
     */
    public File llegirRutaCarpeta() {
        // Un tipus compost es pot deixar sense inicialitzar posant "null"
        File f = null;
        boolean preguntar = true;
        while (preguntar) {
            System.out.println("Escriu el nom d'una ruta en una carpeta: ");
            String nomCarpeta = lector.nextLine();
            f = new File(nomCarpeta);
            if (f.isDirectory()) {
                preguntar = false;
            } else {
                System.out.println("Aquesta carpeta no existeix...");
            }
        }
        return f;
    }

    /** Donada una ruta associada a una carpeta, esborra tot el seu contingut.
     *
     * @param ruta Ruta de la carpeta que cal netejar
     */
    public void netejarCarpeta(File ruta) {
        File[] elements = ruta.listFiles();
        // Cal mirar tots els elements:
        assert elements != null;
        for (File element : elements) {
            if (element.isFile()) {
                // Si ?s un fitxer, s'esborra.
                element.delete();
            } else if (element.isDirectory()) {
                // Si ?s una carpeta, cal buidar-la primer, o sigui: invocar
                // netejarCarpeta!
                netejarCarpeta(element);
                // Un cop buida es pot esborrar correctament
                element.delete();
            }
        }
    }
}
