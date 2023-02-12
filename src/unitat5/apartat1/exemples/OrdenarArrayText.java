package unitat5.apartat1.exemples;
import java.util.Arrays;

public class OrdenarArrayText {
    public static void main(String[] args) {
        OrdenarArrayText programa = new OrdenarArrayText();
        programa.inici();
    }

    public void inici(){
        String[] array = {"Un", "Dos", "Tres", "Quatre", "Cinc"};
        Arrays.sort(array);
        System.out.println("Els elements ordenats són: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
