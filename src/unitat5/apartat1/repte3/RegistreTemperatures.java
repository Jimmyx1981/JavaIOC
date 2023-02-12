package unitat5.apartat1.repte3;

import utilitats.arrays.CalculsArraysReals;

public class RegistreTemperatures {

    public static void main(String[] args) {
        RegistreTemperatures programa = new RegistreTemperatures();
        programa.inici();
    }

    public void inici(){
        double[] temps = {20.0, 21.5, 19.0, 18.5, 17.5, 19.0, 22.25, 21.75};
        // Per cridar els mètodes cal inicialitzar la classe que els conté
        CalculsArraysReals calculador = new CalculsArraysReals();
        // Un cop fet, cal cridar-los usant com a prefix l'identificador
        double max = calculador.calcularMaxim(temps);
        double min = calculador.calcularMinim(temps);
        double dif = max - min;
        System.out.println("La diferència de temperatura màxima " + dif + ".");
    }
}
