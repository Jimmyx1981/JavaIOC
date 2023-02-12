package ExercicisPrimerTrimestre;

import java.util.Scanner;
//Programa que llegeix una seqüència de valors reals, de longitud coneguda.
public class LectorSequencia {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //Llegeix la longitud de la seqüencia. Comprova tots els errors.
        int nombreValors = 0;
        while (nombreValors <= 0) {
            System.out.println("Quantes notes vols introduir? ");
            if (lector.hasNextInt()) {
                nombreValors = lector.nextInt();
            } else {
                //Si no és enter, es llegeix i s'ignora.
                lector.next();
            }
        }
        //Si s'han entrat més valors, s'ignoren. Només se'n necessita un.
        lector.nextLine();
        System.out.println("Es llegiran " + nombreValors + " valors reals.");
        System.out.println("Els pots escriure diversos en una sola línia, separats"
                + " per espais.");
        //Els desarem en un array. Ja en coneixem la mida.
        float[] arrayNotes = new float[nombreValors];
        //Cal llegir tants reals com la mida de l'array.
        //Estructura de repetició amb comptador.
        int index = 0;
        while (index < arrayNotes.length) {
            if (lector.hasNextFloat()) {
                //S'ha llegit una nota, però és vàlida (entre 0 i 10)?
                float nota = lector.nextFloat();
                if ((nota >= 0)&&(nota <= 10)){
                    arrayNotes[index] = nota;
                    index++;
                }
                //Si no és vàlida, la ignorem. No s'assigna enlloc.
            } else{
                //Si no era un real, simplement llegim el valor com una cadena de text,
                //però no en fem res. Es perd.
                lector.next();
            }
        }
        //Ignorem els valors sobrants de la darrera línia.
        lector.nextLine();
        System.out.println("La seqüencia llegida és:");
        for (int i = 0; i < arrayNotes.length; i++) {
            System.out.println(arrayNotes[i]);
        }
    }
    
}
