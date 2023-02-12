package ExercicisPrimerTrimestre;

import java.util.Scanner;
//Un programa que inicialitza un array bidimensional.
public class InicialitzacioBidi {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //Llegeix les files.
        int nombreFiles = 0;
        while (nombreFiles <= 0) {
            System.out.println("Quantes files tindrà la taula? ");
            if (lector.hasNextInt()) {
                nombreFiles = lector.nextInt();
            } else {
                lector.next();
                System.out.println("Aquest valor no és correcte. ");
            }
        }
        lector.nextLine();
        //Llegeix les columnes
        int nombreColumnes = 0;
        while (nombreColumnes <= 0) {
            System.out.println("Quantes columnes tindrà la taula? ");
            if (lector.hasNextInt()) {
                nombreColumnes = lector.nextInt();
            } else {
                lector.next();
                System.out.println("Aquest valor no és correcte.");
            }
        }
        lector.nextLine();
        //Inicialització amb valors per defecte.
        int [][] arrayBidi = new int[nombreFiles][nombreColumnes];
        //Observeu l'ús de l'atribut "length".
        System.out.println("Hi ha " + arrayBidi.length + " files.");
        System.out.println("Hi ha " + arrayBidi[0].length + " columnes.");
        //Bucle per recórrer cada fila.
        //"i" indica el número de fila.
        for (int i = 0; i < nombreFiles; i++) {
            //Bucle per recórrer cada posició dins de la fila (columnes de la fila).
            //"j" indica el número de fila.
            for ( int j = 0; j < nombreColumnes; j++) {
                //Valor assignat a la posició: suma dels índexs de fila i columna.
                arrayBidi[i][j] = i + j;
            }
        }
        //Es visualitza el resultat, també calen dos bucles.
        for ( int i = 0; i < nombreFiles; i++) {
            //Inici de fila, obrim claudàtors.
            System.out.print("Fila " + i + " { ");
            for ( int j = 0; j < nombreColumnes; j++) {
                System.out.print(arrayBidi[i][j] + " ");
            }
            //Al final de cada fila es tanquen claudàtors i es fa un salt de línia.
            System.out.println("}");
        }
    }
    
}
