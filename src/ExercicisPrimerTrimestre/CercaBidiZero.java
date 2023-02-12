package ExercicisPrimerTrimestre;

public class CercaBidiZero {
    public static void main(String[] args) {
        //Dades de les notes.
        float[][] arrayBidiNotes = {
            { 4.5f, 6f, 5f, 8f },
            { 10f, 8f, 7.5f, 9.5f },
            { 3f, 2.5f, 0f, 6f },
            { 6f, 8.5f, 6f, 4f },
            { 9f, 7.5f, 7f, 8f }
        };
        //Calen dues estructures de repetició si els dos índexs han d'anar
        //variant per recórrer totes les posicions. En aquest cas, un valor és
        //sempre el mateix (posició 1 de cada fila): només varia el número de fila.
        //Per tant amb una única estructura n'hi ha prou.
        //Mirarem quin estudiant ha tret el 0.
        int estudiant = -1;
        for (int numFila = 0; numFila < arrayBidiNotes.length; numFila++) {
            if (arrayBidiNotes[numFila][1] == 0) {
                //Aquest estudiant té un 0.
                estudiant = numFila;
                //Ja podem sortir del bucle.
                //Ho podem fer, ja que només hi ha una única estructura de repetició.
                break;
            }
        }
        if (estudiant == -1) {
            System.out.println("Cap estudiant no té un 0.");
        } else {
            System.out.println("L'estudiant " + estudiant + " té un 0 en el segon"
                    + " exercici. ");
        }
    }
    
}
