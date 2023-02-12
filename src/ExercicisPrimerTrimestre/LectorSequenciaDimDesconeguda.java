package ExercicisPrimerTrimestre;

import java.util.Scanner;
//Llegeix un conjunt de dades sense saber quantes són.
public class LectorSequenciaDimDesconeguda {
    public static final int MAX_VALORS = 80;
    public static final int MARCA_FI = -1;
    public static void main(String[] args) {
        //No se sap quantes n'entraran. Cal fitar un valor màxim. En posem 80.
        float[] arrayNotes = new float[MAX_VALORS];
        //Cal un comptador de posicions actuals en què hi ha valors.
        int elements = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriure fins a " + MAX_VALORS + " valors.");
        System.out.println("En pots escriure diversos en una sola línia, o separats"
                + " per espais.");
        //Caldrà alguna manera de saber que s'ha acabat d'escriure.
        System.out.println("(Per acabar, escriu un" + MARCA_FI + ")");
        //Anar llegint fins a trobar la marca de fi. Però el màxim és la mida de 
        //l'array.
        //Si s'entren més valors, els ignorem, ja que no queda lloc on emmagatzemar-los
        //Estructura de repetició amb semàfor.
        while (elements < arrayNotes.length) {
            //Hi ha un real?
            if (lector.hasNextFloat()) {
                //Cal veure si és un valor vàlid o final de seqüència.
                float nota = lector.nextFloat();
                if ((nota >=0)&&(nota<=10)) {
                    //Tot correcte. Ara hi ha un element més a l'array.
                    arrayNotes[elements] = nota;
                    elements++;
            } else if (nota == MARCA_FI) {
                //Marca de final, sortim del bucle.
                break;
            }
                //Si no era un real, l'ignorem.
                lector.next();
            }
        }
        //Ignorem els valors sobrants de la darrera línia.
        lector.nextLine();
        System.out.println("La seqüencia llegida és:");
        for (int i = 0; i < elements; i++) {
            System.out.println(arrayNotes[i]);
        }
    }
    
}
