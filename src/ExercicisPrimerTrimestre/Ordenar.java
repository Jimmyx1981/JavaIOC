//Un programa per ordenar valors usant l'algorisme de la bombolla.
public class Ordenar {
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
    }
    
}
