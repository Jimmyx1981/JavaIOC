package unitat6.apartat2.reptes;
import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;

public class GenerarFitxerNotes {
    // La paraula fi serveix com a marca de final del fitxer
    public static final String MARCA_FI = "fi";
    public static final double MARCA_FI_NOTES = -1;
    public static void main (String[] args){
        GenerarFitxerNotes programa = new GenerarFitxerNotes();
        programa.inici();
    }

    public void inici(){
        try {
            File in = new File("NotesMarca.txt");
            Scanner lector = new Scanner(in);
            File out = new File("NotaMitja.txt"); // Es genera el fitxer de sortida
            PrintStream escriptor = new PrintStream(out);
            boolean llegir = true;
            // Només cal canviar les escriptures a pantalla per al fitxer de sortida
            // O sigui, on posa "System.out" posar "escriptor".
            while (llegir) {
                String nom = lector.next();
                if (MARCA_FI.equals(nom)){
                    llegir = false;
                } else {
                    String cognom = lector.next();
                    escriptor.print("Estudiant: " + nom + " " + cognom);
                    // Noteu com un Scanner es pot passar com a paràmetre
                    double mitjana = LlegirNotes(lector);
                    escriptor.println(" - Mitjana: " + mitjana);
                }
            }
            // Cal tancar els fitxers
            lector.close();
            escriptor.close();
            System.out.println("Fitxer escrit satisfactòriament.");
        }catch (Exception e){
            System.out.println("Error llegint als estudiants: " + e);
        }
    }

    /** Donat un Scanner en un fitxer quan l'apuntador és sobre l'inici
     * de les notes, s'extreuen i es calcula la mitjana.
     *
     * @param lector - Scanner a processar
     * @return Mitjana de notes
     */
    public double LlegirNotes(Scanner lector){
        double res = 0;
        try {
            // Ara es llegeix fins a una marca de fi (-1)
            boolean llegir = true;
            int numNotes = 0;
            while (llegir) {
                double valor = lector.nextDouble();
                if (valor == MARCA_FI_NOTES) {
                    // Final
                    llegir = false;
                } else {
                    // S'acumula el valor de les notes
                    res = res + valor;
                    numNotes++;
                }
            }
            // Es calcula la nota mitjana
        }catch (Exception e){
            // Excepció!
            System.out.println("Error llegint notes: " + e);
        }
        return res;
    }
}
