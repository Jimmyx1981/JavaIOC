package unitat5.apartat1.exemples;
import java.util.Arrays;

public class MostraArray {

    public static void main(String[] args) {
        MostraArray programa = new MostraArray();
        programa.inici();
    }

    public void inici(){
        int[] array = {2, 5, 8, 1, 4, 2, 5, 3, 10, 8};
        String text = Arrays.toString(array);
        System.out.println("L'array conté els valors: " + text);
    }
}
