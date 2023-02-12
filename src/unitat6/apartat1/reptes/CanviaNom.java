package unitat6.apartat1.reptes;
import java.io.File;
import java.util.Scanner;

public class CanviaNom {

    Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        CanviaNom programa = new CanviaNom();
        programa.inici();
    }

    public void inici() {
        File rutaFitxer = llegirNomFitxer();
        // Cal comprovar si realment existeix i si �s un fitxer
        if (rutaFitxer.isFile()) {
            File novaRuta = treureExtensio(rutaFitxer);
            // Es canvia el nom
            rutaFitxer.renameTo(novaRuta);
            System.out.println("Nom canviat de " + rutaFitxer + " a " + novaRuta);
        } else {
            System.out.println("Aquest fitxer no existeix!");
        }
    }

    /** Pregunta a l'usuari el nom del fitxer, i d'aquest obt� una ruta.
     *
     * @return La ruta associada al text que ha escrit l'usuari.
     */
    public File llegirNomFitxer() {
        System.out.println("Escriu el nom d'una ruta en un fitxer existent: ");
        String nomFitxer = lector.nextLine();
        // Fixeu-vos com �s possible fer return d'una variable de tipus File,
        // igual que es faria per un enter o una cadena de text.
        File f = new File(nomFitxer);
        return f;
    }

    /** Donada una ruta, en crea una de nova igual, per� sense extensi� (.xxx)
     *
     * @param original Ruta original que cal transformar
     * @return La ruta sense extensi�
     */
    public File treureExtensio(File original) {
        String nom = original.getName();
        String pare = original.getParent();
        // Cerquem el darrer punt, per trobar l'extensi�
        int posicioPunt = nom.lastIndexOf(".");
        if (posicioPunt >= 0) {
            // eliminem el que hi ha darrere del punt
            String nouNom = nom.substring(0, posicioPunt);
            // Es fa el text per a la nova ruta, sense extensi�
            String nouText = pare + File.separator + nouNom;
            File novaRuta = new File(nouText);
            return novaRuta;
        } else {
            // Si no t� extensi�, es deixa tot igual...
            return original;
        }
    }
}
