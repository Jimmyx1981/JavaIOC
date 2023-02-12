package unitat5.apartat1.exemples;
import java.util.Arrays;

public class CopiaArray {

    public static void main(String[] args) {
        CopiaArray programa = new CopiaArray();
        programa.inici();
    }

    public void inici(){
        int[] origen = {2, 5, 8, 1, 4, 2, 5, 3, 10, 8};
        // Si es vol copiar de la posició 1 a la 5
        int[] copia = Arrays.copyOfRange(origen, 1, 6);
        System.out.println("Els elements de la còpia són: ");
        for (int i = 0; i < copia.length; i++){
            System.out.println(copia[i]);
        }
    }
}
