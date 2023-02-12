package unitat5.apartat1.repte2;

import utilitats.arrays.CalculsArraysReals;

public class CalculValorMesAlt {

    public static void main(String[] args) {
        CalculValorMesAlt programa = new CalculValorMesAlt();
        programa.inici();
    }

    public void inici(){
        double[] array1 = {20.0, 21.5, 19.0, 18.5, 17.5, 19.0, 22.25, 21.75};
        double[] array2 = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        CalculsArraysReals calculador = new CalculsArraysReals();
        double mitjana1 = calculador.calcularMitjana(array1);
        double mitjana2 = calculador.calcularMitjana(array2);
        if (mitjana1 > mitjana2){
            System.out.println("La mitjana més alta és: " + mitjana1);
        } else {
            System.out.println("La mitjana més alta és: " + mitjana2);
        }
    }
}
