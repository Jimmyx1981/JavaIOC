package ExercicisPrimerTrimestre;

public class Histograma {
    public static void main(String[] args) {
        float[] arrayNotes = {2f, 5f, 9f, 6.5f, 10f, 4.5f, 8.5f, 7f, 6f, 7.5f, 9f, 7f};
        //Inicialització dels 10 comptadors, per a cada barra del gràfic.
        int[] barres = new int[4];
        //Càlcul dels comptadors. Es fa u n recorregut de les notes.
        for (int i = 0; i < arrayNotes.length; i++) {
            //A quin rang pertany?
            if ((arrayNotes[i] >= 0)&&(arrayNotes[i] < 5)) {
                barres[0]++;
            } else if (arrayNotes[i] < 6.5) {
                barres[1]++;
            } else if (arrayNotes[i] < 9) {
                barres[2]++;
            } else if (arrayNotes[i] <=10) {
                barres[3]++;
            }
            //Si no pertany a cap rang, nota incorrecta la ignorem.
        }
        System.out.println("Gràfic de barres de les notes");
        System.out.println("-----------------------------");
        //S'imprimeix el gràfic.
        //Anem recorrent els comptadors i imprimim el valor en estrelles.
        for (int i = 0; i < barres.length; i++) {
            //Aprofitem l'índex per saber quin títol cal escriure en la barra actual.
            switch (i) {
                case 0 -> System.out.print("Suspès:      ");
                case 1 -> System.out.print("Aprovat:     ");
                case 2 -> System.out.print("Notable:     ");
                case 3 -> System.out.print("Excel.lent:  ");
            }
            //Imprimim tantes estrelles com el valor del comptador.
            for (int j = 0; j < barres[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
