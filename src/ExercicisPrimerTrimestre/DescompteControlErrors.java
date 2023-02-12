import java.util.Scanner;
//Un programa que calcula descomptes.
public class DescompteControlErrors {
    //PAS 1
    //Es fa un descompte del 8%
    public static final float DESCOMPTE = 8;
    //Es fa descompte per compres de 100 euros o més.
    public static final float COMPRA_MIN = 100;
    //Valor del descompte màxim: 10euros.
    public static final float DESC_MAX = 10;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //PASSOS 2 i 3
        System.out.println("Quin és el preu del producte, en euros? ");
        float preu = lector.nextFloat();
        if (preu > 0){
        //PAS I
        float descompteFet = 0;
        if (preu >= COMPRA_MIN){
            //PAS a
            descompteFet = preu * DESCOMPTE / 100;
            //PAS b. Si el descompte supera el màxim, cal reduir-lo.
            if (descompteFet > DESC_MAX){
                //PAS alfa. Reduir descompte
                descompteFet = DESC_MAX;
            }
            //PAS c
            preu = preu - descompteFet;
        }
        //PAS II. Es mostra el preu final.
            System.out.println("El preu final per pagar és de " + preu + " euros.");
            System.out.println("S'ha fet un descompte de " + descompteFet + " euros.");
        } else {
            //PAS III. El preu era negatiu. Cal avisar l'usuari.
            System.out.println("Preu incorrecte. És negatiu.");
        }
    }
}
