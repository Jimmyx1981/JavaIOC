package ExercicisPrimerTrimestre;

//Un programa per veure si algú ha tret un 10.
public class Cerca {
    public static void main(String[] args) {
        //Es parteix d'un array que conté tots els seus valors.
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f,
            7f};
        //Semàfor. S'ha trobat?
        boolean trobat = false;
        //Comptador de posicions.
        int i = 0;
        //Es va mirant cada posició, mentre no s'arriba al final i no es trobi un
        //10.
        while ((i < arrayNotes.length)&&(!trobat)) {
            if (arrayNotes[i] == 10) {
                trobat = true;
            }
            i = i + 1;
        }
        //S'ha trobat?
        if (trobat) {
            System.out.println("Algú ha tret un 10");
        } else {
            System.out.println("Ningú no ha tret un 10");
        }
    }
    
}
