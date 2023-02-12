package ExercicisSegonTrimestre;
import java.util.Scanner;

public class OrdenarDescendent {
    int[] llistaEnters = new int[10];

    public static void main(String[] args) {
        OrdenarDescendent programa = new OrdenarDescendent();
        programa.inici();
    }

    public void inici() {
        llegirLlista();
        ordenarLlista();
        mostrarLlista();
        valorsInferiors();
    }
    // Mètode amb les instruccions per llegir la llista.
    public void llegirLlista() {
        System.out.println("Escriu 10 valors enters i prem retorn: ");
        Scanner lector = new Scanner(System.in);
        int index = 0;
        while (index < llistaEnters.length) {
            if (lector.hasNextInt()) {
                llistaEnters[index] = lector.nextInt();
                index++;
            } else {
                lector.next();
            }
        }
        lector.nextLine();
    }
    // Mètode amb les instruccions per ordenar la llista.
    public void ordenarLlista() {
        for (int i = 0; i < llistaEnters.length -1; i++) {
            for (int j = i + 1; j < llistaEnters.length; j++) {
                // La posició tractada té un valor més alt que el de la cerca...
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
    // Mètode amb les instruccions per mostrar la llista per pantalla.
    public void mostrarLlista() {
        System.out.println("L'array ordenat és: [ ");
        for (int i = 0; i < llistaEnters.length; i++) {
            System.out.print(llistaEnters[i] + " ");
        }
        System.out.println("]");
    }
    // Mètode per mostrar els valors inferiors a la meitat del valor mes gran.
    public void valorsInferiors() {
        System.out.println("Els números inferiors a la meitat del valor mes gran son: ");
        for (int i = 0; i < llistaEnters.length; i++) {
            if (llistaEnters[i] <= llistaEnters[5]) {
                System.out.println(llistaEnters[i]);
            }

        }
    }
}
