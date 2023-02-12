package unitat5.apartat1.repte2;

import utilitats.arrays.CalculsArraysReals;

public class RegistreNotes {

    public static void main(String[] args) {
        RegistreNotes programa = new RegistreNotes();
        programa.inici();
    }

    public void inici() {
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        // Per cridar els m�todes cal inicialitzar la classe que els cont�
        CalculsArraysReals calculador = new CalculsArraysReals();
        // Un cop fet, cal cridar-los usant com a prefix l'identificador
        double max = calculador.calcularMaxim(notes);
        double min = calculador.calcularMinim(notes);
        double mitjana = calculador.calcularMitjana(notes);
        System.out.println("La nota m�xima �s: " + max + ".");
        System.out.println("La nota m�nima �s: " + min + ".");
        System.out.println("La nota mitjana de les notes �s: " + mitjana + ".");
    }
}
