package unitat6.apartat2.reptes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class QueHacemos {

    public static void main(String[] args) {
        QueHacemos programa = new QueHacemos();
        programa.inici();
    }

    public void inici(){
        int[] array1 ={2, 3, 5, 6, 7};
        int[] array2 ={4, 5, 6, 7, 7};
        queFaig(array1, array2);
    }


    private void queFaig(int[] dades1, int [] dades2){

        File directoriDades = new File("C:/Jaime/Programación/FPoberta/JavaIOC/src/unitat6/apartat2/reptes");
        String rutaFitxer =  directoriDades+ File.separator + "data.dat";

        try {
            PrintStream filePrintStream = new PrintStream(rutaFitxer);

            for (int i = 0 ; i < dades1.length; i++){
                String dadaLinia = "";

                if ( dades1[i] > dades2[i]){
                    dadaLinia += "dada1" + ",";
                    dadaLinia += dades1[i] + ",";
                    dadaLinia += dades1[i] * 10 + ",";
                }
                else{
                    dadaLinia += "dada2" + ",";
                    dadaLinia += dades2[i] + ",";
                    dadaLinia += dades2[i] + dades1[i] + ",";
                }

                dadaLinia += System.getProperty("line.separator");
                filePrintStream.append(dadaLinia);
            }

            filePrintStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fitxer no trobat");
        }
    }


}
