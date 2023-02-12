package unitat5.apartat1.reptes;
// Importació de la classe, en estar en un altre package
import java.util.Random;

public class RealsAleatoris {
    public static void main(String[] args) {
        RealsAleatoris programa = new RealsAleatoris();
        programa.inici();
    }

    public void inici(){
        // Inicialització. Per exemple, s'usa el valor 100 com "arrel" (seed).
        Random rnd = new Random(100L);
        // Ús
        long valorA = rnd.nextLong() * 100;
        long valorB = rnd.nextLong() * 100;
        System.out.println("S'han generat els valors " + valorA + " i " + valorB);
    }
}
