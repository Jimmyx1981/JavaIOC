package unitat5.apartat1.reptes;
import java.util.Arrays;
import java.util.Random;

public class BuscaPosicioArray {

    public static void main(String[] args) {
        BuscaPosicioArray programa = new BuscaPosicioArray();
        programa.inici();
    }

    public void inici(){
        int pos = 0;
        int[] array = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
            System.out.print(array[i]);
        }

        System.out.println();

        int[] arrayCopia = Arrays.copyOfRange(array,0, 5);
        int[] arrayCopia2 = Arrays.copyOfRange(array, 5, 10);

        System.out.println(Arrays.toString(arrayCopia));
        System.out.println(Arrays.toString(arrayCopia2));

        for (int i = 0; i < arrayCopia.length; i++) {
            if (arrayCopia[i] == arrayCopia2[i]){
                pos = i;
                System.out.println("El valor es repeteix en la posició " + pos);
            }
        }
    }
}
