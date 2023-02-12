//Un programa que fa un recorregut d'un array: càlcul de la mitjana aritmètica.
public class RecorregutTotalmentOcupat {
    public static void main(String[] args) {
        //Es parteix d'un array que conté tots els valors.
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f,
            9f, 7f};
        //Acumulador de la suma de valors.
        float acumulat = 0;
        //Cal recórrer tot l'array d'extrem a extrem.
        for (int i = 0; i < arrayNotes.length; i++) {
            acumulat = acumulat + arrayNotes[i];
        }
        float resultat = acumulat / arrayNotes.length;
        System.out.println("El resultat és " + resultat);
    }
    
}
