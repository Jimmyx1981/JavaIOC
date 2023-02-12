package unitat5.apartat1.exemples;
import java.util.Arrays;

public class ComparaArrays {
    public static void main(String[] args) {
        ComparaArrays programa = new ComparaArrays();
        programa.inici();
    }

    public void inici(){
        double[] origen = {4.5, 1.2, 3.0, 1.4, 3.5};
        // Es fa unc còpia exacta
        double[] copia = Arrays.copyOfRange(origen, 0, origen.length);
        boolean iguals = Arrays.equals(origen, copia);
        System.out.println("Són iguals? " + iguals);
        // Es modifica la còpia
        copia[3] = 4.6;
        iguals = Arrays.equals(origen, copia);
        System.out.println("I ara, són iguals? " + iguals);
    }
}
