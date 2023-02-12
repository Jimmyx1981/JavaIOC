//Un programa que mostra el valor maxim d'un array.
public class RecorregutMaxima {
    public static void main(String[] args) {
        //Es parteix d'un array que conté tots els seus valors.
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f,
        9f, 7f};
        //Valor màxim fins al moment.
        float notaMaxima = 0;
        //Cal recòrrer tot l'array d'extrem a extrem i desar el valor més gran.
        for (int i = 0; i < arrayNotes.length; i++) {
            if (notaMaxima < arrayNotes[i]) {
                notaMaxima = arrayNotes[i];
            }
        }
        System.out.println("La nota màxima és: " + notaMaxima);
    }
    
}
