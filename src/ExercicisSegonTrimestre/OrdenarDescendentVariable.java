package ExercicisSegonTrimestre;
import java.util.Scanner;

public class OrdenarDescendentVariable {
    // Variable local. Array no inicialitzat
    private int[] llistaEnters = null;
    // En aplicar disseny descendent, ara cal declarar "lector" com a global.
    Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        OrdenarDescendentVariable programa = new OrdenarDescendentVariable();
        programa.inici();
    }

    public void inici() {
        llegirLlista();
        ordenarLlista();
        mostrarLlista();
    }

    // Mètode amb les instruccions per llegir la llista.
    // El primer valor sera la llargària.
    public void llegirLlista() {
        System.out.println("Escriu una llista de valors enters i prem retorn.");
        System.out.println("El primer valor indica la mida de la seqüencia.");
        llegirMida();
        llegirValors();
    }

    // Mètode que llegeix el primer valor.
    public void llegirMida() {
        // Lectura
        int mida = 0;
        if (lector.hasNextInt()) {
            mida = lector.nextInt();
        } else {
            lector.next();
        }
        // Inicialització diferida de l'array.
        llistaEnters = new int[mida];
    }

    public void llegirValors() {
        int index = 0;
        while (index < llistaEnters.length) {
            if (lector.hasNextInt()) {
                llistaEnters[index] = lector.nextInt();
                index++;
            } else {
                lector.next();
            }
        }
        // La resta de mètodes no canvien...
        lector.nextLine();
    }

    public void ordenarLlista() {
        for (int i = 0; i < llistaEnters.length -1; i++) {
            for (int j = i + 1; j < llistaEnters.length; j++) {
                // La posició tractada té un valor més alt que el de la cerca..
                // Els intercanviem.
                if (llistaEnters[i] > llistaEnters[j]) {
                    // Per intercanviar valors cal una variable auxiliar.
                    int canvi = llistaEnters[i];
                    llistaEnters[i] = llistaEnters[j];
                    llistaEnters[j] = canvi;
                }
            }
        }
    }

    public void mostrarLlista() {
        System.out.println("L'array ordenat és: [ ");
        for (int i = 0; i < llistaEnters.length; i++) {
            System.out.print(llistaEnters[i] + " ");
        }
        System.out.println("]");
    }
}


