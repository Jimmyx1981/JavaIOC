package ExercicisSegonTrimestre;

import java.util.Scanner;

public class ExempleDepuracio {

    public static void main(String[] args) {
        ExempleDepuracio prg = new ExempleDepuracio();
        prg.inici();
    }

    void inici(){
        double valorDoble = 12345.6789;
        int valorEnter = 1000;
        int resultat;

        resultat = calcul(valorDoble, valorEnter);

        System.out.println("vd: " + valorDoble);
        System.out.println("ve: " + valorEnter);
        System.out.println("re: " + resultat);
    }

    int calcul(double valorDoble, int valorEnter){
        int aux;
        int comptador = 0;
        while(comptador < 10){
            valorDoble = Math.log(valorDoble);
            aux = (int) valorDoble;
            if(aux == 0){
                valorEnter = -1;
                comptador = 10;
            } else {
                valorEnter = valorEnter/aux;
            }
            comptador++;
        }
        return valorEnter;
    }
}
