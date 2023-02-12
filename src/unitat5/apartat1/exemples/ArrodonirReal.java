package unitat5.apartat1.exemples;
import java.util.Random;

public class ArrodonirReal {

    public static void main(String[] args) {
        ArrodonirReal programa = new ArrodonirReal();
        programa.inici();
    }

    public void inici(){
        // Inicialitzaci� de Random
        Random rnd = new Random();
        // �s per general un real entre 0 i 1
        double valor = rnd.nextDouble();
        System.out.println("El valor real generat �s " + valor);
        // �s del m�tode est�tic. No cal inicialitzar res, es pot usar directament.
        // No cal importar-la, ja que pertany a java.lang
        long arrodonit = Math.round(valor);
        System.out.println("El valor arrodonit �s " + arrodonit);
    }
}


