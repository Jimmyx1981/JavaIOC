package ExercicisPrimerTrimestre;

//Un programa que cerca un 0 entre els valors d'un array bidimensional.
public class CercaBidi {
    public static void main(String[] args) {
        //Dades de les notes.
        float [][] arrayBidiNotes = {
                                    { 4.5f, 6f, 5f, 8f },
                                    { 10f, 8f, 7.5f, 9.5f },
                                    { 3f, 2.5f, 0f, 6f },
                                    { 6f, 8.5f, 6f, 4f },
                                    { 9f, 7.5f, 7f, 8f }
                                    };
        //Mirarem quin estudiant ha tret el 0.
        //Inicialitzem a un valor invàlid (de moment, cap estudiant té un 0)
        //Aquest valor fa de semàfor. Si pren un valor diferent, cal acabar la cerca.
        int estudiant = -1;
        //"i" indica la fila.
        int i = 0;
        //Se'n va fila per fila.
        //S'acaba si s'ha trobat un 0 o si ja s'ha cercat a totes les files.
        while ((estudiant == -1)&&(i < arrayBidiNotes.length)) {
            //"j" indica la columna
            int j = 0;
            //Se cerca en una fila.
            //S'acaba si s'ha trobat un 0 o si ja s'ha cercat a totes les posicions.
            while ((estudiant == -1)&&(j < arrayBidiNotes[i].length)) {
                //Aquesta nota és un 0?
                if (arrayBidiNotes[i][j] == 0f) {
                    //L'índex que diu l'estudiant és el de la fila. 
                    estudiant = i;
                }
                //S'avança a la posició següent dins la fila.
                j++;
            }
            //Fi del tractament d'una fila.
            //S'avança a la fila següent.
            i++;
        }
        //Fi del tractament de totes les files.
        if (estudiant == -1) {
          
        } else {
            System.out.println("L'estudiant " + estudiant + " té un 0.");
        }
    }
    
}
