package unitat5.apartat1.exemples;
import java.util.Random;

public class ArrodonirReal {

    public static void main(String[] args) {
        ArrodonirReal programa = new ArrodonirReal();
        programa.inici();
    }

    public void inici(){
        // Inicialització de Random
        Random rnd = new Random();
        // Ús per general un real entre 0 i 1
        double valor = rnd.nextDouble();
        System.out.println("El valor real generat és " + valor);
        // Ús del mètode estàtic. No cal inicialitzar res, es pot usar directament.
        // No cal importar-la, ja que pertany a java.lang
        long arrodonit = Math.round(valor);
        System.out.println("El valor arrodonit és " + arrodonit);
    }
}


