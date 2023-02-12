package ExercicisPrimerTrimestre;

//Cerca si hi ha la lletra 'w' entre un seguit de caràcters.
public class CercaCaracter {
    public static void main(String[] args) {
        //Es parteix d'un array que conté un seguit de caràcters
        char[] arrayNotes = {'a', 'z', 'g', 'd', 'w', 'o', 'h', 'e', 'x', 's'};
        //Semàfor. S'ha trobat?
        boolean trobat = false;
        //Comptador de posicions.
        int i = 0;
        //Es va mirant cada posició, mentre no s'arriba al final i no es trobi una
        //'w'.
        while ((i < arrayNotes.length)&&(!trobat)) {
            if (arrayNotes[i] == 'w') {
                trobat = true;
            }
            i = i + 1;
        }
        //S'ha trobat?
        if (trobat) {
            System.out.println("La lletra 'w' es a la llista.");
        } else {
            System.out.println("La lletra 'w' no es a la llista.");
        }
    }
}
