package joc.arena.fitxers;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.spec.ECField;
import java.util.Scanner;

public class EditorBestiari {
    public static final int MAX_CHAR_NOM = 15;
    public static final int MIDA_BYTES_ADV = 50;

    public static void main(String[] args) {
        EditorBestiari programa = new EditorBestiari();
        programa.inici();
    }

    public void inici() {
        File fitxer = preguntarFitxer();
        boolean executar = true;
        while (executar) {
            executar = tractarMenu(fitxer);
        }
    }

    /** Pregunta a l'usuari el nom del fitxer a editar.
     *
     * @return Ruta al fitxer a editar
     */
    public File preguntarFitxer() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Nom del fitxer a editar: ");
        String nom = lector.nextLine();
        File fitxer = new File(nom);
        return fitxer;
    }

    public boolean tractarMenu(File fitxer) {
        mostrarFitxer(fitxer);
        System.out.println("--------------------------");
        System.out.println("[A]fegir\t[E]liminar darrer\t[S]ortir");
        boolean preguntar = true;
        Scanner lector = new Scanner(System.in);
        while (preguntar) {
            System.out.print("Accio: ");
            String resposta = lector.nextLine();
            if ("A".equalsIgnoreCase(resposta)) {
                afegirAdversari(fitxer);
                preguntar = false;
            } else if ("E".equalsIgnoreCase(resposta)) {
                eliminarAdversari(fitxer);
                preguntar = false;
            } else if ("S".equalsIgnoreCase(resposta)) {
                return false;
            } else {
                System.out.print("Accio incorrecta...");
            }
        }
        return true;
    }

    /** Mostra el contingut del fitxer per pantalla
     *
     * @param fitxer Ruta al fitxer a mostrar
     */
    public void mostrarFitxer(File fitxer) {
        try {
            if (fitxer.isFile() == false) {
                System.out.println("Encara no s'ha creat el fitxer.");
            } else {
                RandomAccessFile raf = new RandomAccessFile(fitxer, "r");
                long numAdversaris = fitxer.length()/MIDA_BYTES_ADV;
                if (numAdversaris == 0) {
                    System.out.println("El fitxer és buit.");
                } else {
                    for (int i = 0; i < numAdversaris; i++) {
                        String nom = llegirNom(raf);
                        System.out.print(nom);
                        for (int z = 0; z < (MAX_CHAR_NOM - nom.length()); z++) {
                            System.out.print(" ");
                        }
                        // Cada adversari ocupa 50 bytes. El tros del nom n'ocupa 15*2
                        raf.seek(i*MIDA_BYTES_ADV + MAX_CHAR_NOM*2);
                        System.out.print(": \tNivell: " + raf.readInt());
                        System.out.print(" (punts: " + raf.readInt() + ")");
                        System.out.print("\tVIDA: " + raf.readInt());
                        System.out.print("\tATAC: " + raf.readInt());
                        System.out.print("\tDEFENSA: " + raf.readInt());
                    }
                }
                raf.close();
            }
        } catch (Exception e) {
            System.out.println("Error accedint al fitxer!");
        }
    }

    /** Donat un fitxer relatiu orientat a byte, correctament posicionat,
     * llegeix el nom de l'adversari.
     *
     * @param raf Fitxer a tractar.
     * @return Nom llegit, o null si hi ha error.
     */
    public String llegirNom(RandomAccessFile raf) {
        try {
            String nom = "";
            char c = raf.readChar();
            while (c != 0x0000) {
                nom = nom + c;
                c = raf.readChar();
            }
            return nom;
        } catch (Exception e) {
            return null;
        }
    }

    /** Escriu un nou adversari al final del fitxer, preguntant tot el que clagui
     * a l'usuari.
     * @param fitxer Ruta al fitxer o cal afegir l'adversari.
     */
    public void afegirAdversari(File fitxer) {
        try {
            RandomAccessFile raf = new RandomAccessFile(fitxer,"rw");
            // Es posa al final de tot
            raf.seek(fitxer.length());
            System.out.println("Escriu el nom de l'adversari (màx. 12 lletres): ");
            Scanner lector = new Scanner(System.in);
            String nom = lector.nextLine();
            // Escriure el nom (màx. 15 caràcters)
            int err = escriureNom(nom, raf);
            if (err == -1) {
                System.out.println("Error escrivint dades al fitxer " + fitxer);
            } else {
                // Escriure valors - Nivell:XP:PV:Max PV:Atac:Max Atac:Max Defensa
                System.out.print("Escriu els seus atributs, separats per espais. ");
                System.out.println("(5 enters = Nivell Punts PV Atac Defensa):");
                int[] valors = llegirValors(lector);
                for (int i = 0; i < valors.length; i++) {
                    raf.writeInt(valors[i]);
                }
            }
            raf.close();
        } catch (Exception e) {
            System.out.println("Error escrivint dades al fitxer " + fitxer);
        }
    }

    /** Llegeix cinc valors de tipus enter des del teclat.
     *
     * @param lector Scanner que llegeix del teclat
     * @return Els cinc valors llegits, ordenadament
     */
    public int[] llegirValors(Scanner lector) {
        int[] valors = new int[5];
        boolean preguntar = true;
        while (preguntar) {
            int numLlegits = 0;
            for (int i = 0; i < valors.length; i++) {
                if (lector.hasNextInt()) {
                    valors[i] = lector.nextInt();
                    numLlegits++;
                } else {
                    lector.next();
                }
            }
            if (numLlegits == 5) {
                preguntar = false;
            } else {
                System.out.println("Els 5 valors han estat correctes.");
            }
        }
        lector.nextLine();
        return valors;
    }

    /** Donat un nom en forma de cadena de text, l'escriu a un fitxer orientat a
     * byte. Com a màxim el nom pot tenir 15 caràcters. La resta, s'omple a 0.
     * @param nom Nom a escriure.
     * @param raf Fitxer relatiu correctament posicionat per a l'escriptura
     * @return Si ha funcionat (0) o no (-1)
     */
    public int escriureNom(String nom, RandomAccessFile raf) {
        try {
            int numChars = nom.length();
            if (numChars > MAX_CHAR_NOM) {
                numChars = MAX_CHAR_NOM;
            }
            for (int i = 0; i < numChars; i++) {
                raf.writeChar(nom.charAt(i));
            }
            char blank = 0x0000;
            for (int i = 0; i < (MAX_CHAR_NOM - numChars); i++) {
                raf.writeChar(blank);
            }
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public void eliminarAdversari(File fitxer) {
        try {
            RandomAccessFile raf = new RandomAccessFile(fitxer, "rw");
            long novaMida = fitxer.length() - MIDA_BYTES_ADV;
            // Eliminar el darrer adversari és esborrar els darrers 50 bytes...
            if (novaMida >= 0) {
                raf.setLength(fitxer.length() - MIDA_BYTES_ADV);
            }
            raf.close();
        } catch (Exception e) {
            System.out.println("Error esborrant dades al fitxer " + fitxer);
        }
    }
}
