
public class RecorregutTotalmentOcupat2 {

    public static void main(String[] args) {
        float notaMitjana = 0f;
        float acumulador = 0f;
        float notaBaixa = 10f;
        float notaAlta = 0f;
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f,};
        //Primer exercici.
        int suspesos = 0;
        for(int i = 0; i < arrayNotes.length; i++) {
            if (arrayNotes[i] < 5) {
                suspesos++;
            }
            
            System.out.println(i+". és: " + arrayNotes[i]);
        }
        
        System.out.println("\nEn l'array hi ha " + suspesos + " suspesos\n");
        //Segon exercici.
        for (int i = 0; i < arrayNotes.length; i++) {
            acumulador = acumulador + arrayNotes[i];
            notaMitjana = acumulador / arrayNotes.length;
            if (notaAlta < arrayNotes[i]) {
                notaAlta = arrayNotes[i];
            }
            if (notaBaixa > arrayNotes[i]) {
                notaBaixa = arrayNotes[i];
            }
            //Exercici 3.
            if (arrayNotes[i] >= 9 || arrayNotes[i] > 10) {
                System.out.println("Hi ha un " + arrayNotes[i] + " a la posició " + i);
            }
        }
        
        System.out.println("\nLa nota mitjana es: " + notaMitjana);
        System.out.println("La nota mes alta es: " + notaAlta);
        System.out.println("La nota mes baixa es: " + notaBaixa);
        
    }
}
