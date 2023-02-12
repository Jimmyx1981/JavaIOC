//Un programa que calcula notes mitjanes en un array bidimensional.
public class RecorregutBidi {
    public static void main(String[] args) {
        //Dades de les notes.
        float[][] arrayBidiNotes = {
                                    { 4.5f, 6f, 5f, 8f, 0f },
                                    { 10f, 8f, 7.5f, 9.5f, 0f },
                                    { 3f, 2.5f, 0f, 6f, 0f },
                                    { 6f, 8.5f, 6f, 4f, 0f },
                                    { 9f, 7.5f, 7f, 8f, 0f }
                                    };
        //Mitjana aritmètica del curs per a tots el estudiants.
        float sumaFinals = 0f;
        //Es fa tractant fila per fila, indicada per "i". Cada fila és un estudiant.
        
        //"arrayBidiNotes.length" avalua al nombre de files.
        for (int i = 0; i < arrayBidiNotes.length; i++) {
            //Aquí s'acumulen les notes de l'estudiant tractat.
            float sumaNotes = 0f;
            //Tractem cada fila (cada estudiant). Cada nota la indexa "j".
            //"arrayBidiNotes[i].length" avalua al nombre de posicions de la fila.
            for (int j = 0; j < arrayBidiNotes[i].length; j++) {
                //Estem a la darrera posició de la fila?
                if (j != (arrayBidiNotes[i].length - 1)) {
                    //Si no és la darrera posició, anem acumulant valors.
                    sumaNotes = sumaNotes + arrayBidiNotes[i][j];
                } else {
                    //Si ho és, cal escriure la mitjana.
                    //Hi ha tantes notes com la mida d'una fila - 1.
                    float notaFinal = sumaNotes/arrayBidiNotes[i].length -1;
                    arrayBidiNotes[i][j] = notaFinal;
                    System.out.println("L'estudiant " + i + " ha tret " + notaFinal + ".");
                    //S'actualitza la suma de mitjanes de tots els estudiants.
                    sumaFinals = sumaFinals + notaFinal;
                }
            }
            //Fi del tractament d'una fila.
        }
        //Fi del tractament de totes les files.
        //Es calcula la mitjana: suma de notes finals dividit entre nombre d'estudiants.
        float mitjanaFinal = sumaFinals / arrayBidiNotes.length;
        System.out.println("La nota mitjana del curs és " + mitjanaFinal);
    }
    
}
