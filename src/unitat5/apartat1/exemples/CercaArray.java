package unitat5.apartat1.exemples;
import java.util.Arrays;

public class CercaArray {
    public static void main(String[] args) {
        CercaArray programa = new CercaArray();
        programa.inici();
    }

    public void inici(){
        int[] array = {2, 5, 8, 1, 4, 2, 5, 3, 10};
        // Primer pas ordenar
        Arrays.sort(array);
        int pos = Arrays.binarySearch(array, 5);
        System.out.println("Hi ha un 5 a la posició " + pos);
        pos = Arrays.binarySearch(array, 6);
        System.out.println("Hi ha un 6 a la posició " + pos);
    }
}
