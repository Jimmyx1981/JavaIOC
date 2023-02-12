public class MitjanaSuspesosOrdenats {
    public static void main(String[] args) {
                float[] llistaNotes = { 5.5f, 9f, 2f, 10f, 4.9f};
        //Bucle extern.
        //S'anirà posant a cada posició tractada, començant per la 0,
        //el valor més baix que es trobi.
        for (int i = 0; i < llistaNotes.length; i++) {
            //Bucle intern.
            //Se cerca entre la resta d eposicions quin és el valor més baix.
            for (int j = i + 1; j < llistaNotes.length; j++) {
                //La posició tractada té un valor més alt que el de la cerca. Els
                //intercanviem.
                if (llistaNotes[i] > llistaNotes[j]) {
                    //Per intercanviar valors cal una vaiable auxiliar.
                    float canvi = llistaNotes[i];
                    llistaNotes[i] = llistaNotes[j];
                    llistaNotes[j] = canvi;
                }
            }
        }
        //El mostrem per pantalla.
        System.out.print("L'array ordenat és: [");
        for (int i = 0; i < llistaNotes.length; i++) {
            System.out.print(llistaNotes[i] + " ");
        }
        System.out.print("]");
        //Inici de les modificacions.
        //Valor acumulat per fer la mitjana.
        float acumulat = 0;
        //Nombre de suspesos.
        int numSuspes = 0;
        //Inici de la nova part.
        //Com l'array està ordenat, només cal fer un recorregut fins trobar un
        //aprovat.
        //no cal arribar al final. Un cop es troba el primer aprovat, la resta de
        //posicions segur que també són aprovats, ja que l'array està ordenat.
        for (int i = 0; i < llistaNotes.length; i++) {
            //És la nota un aprovat?
            if (llistaNotes[i] >= 5) {
                //S'ha trobat el primer aprovat, sortim del bucle!
                break;
            } else {
                //És un suspès, anem calculant.
                acumulat = acumulat + llistaNotes[i];
                //S'incrementa el nombre de suspesos.
                numSuspes++;
            }
        }
        float resultat = acumulat/numSuspes;
        System.out.println("La nota mitjana de suspesos és " + resultat);
    }
    
    
}
