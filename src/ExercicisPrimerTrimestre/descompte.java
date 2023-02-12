import java.util.Scanner;
//Un programa que calcula descomptes.
public class descompte {
    //PAS 1
    //Es fa un descompte del 8%
    public static final float PENALITZACIO = 2;
    //Es fa descompte per compres d'un valor mínim de 100 euros
    public static final float COMPRA_MIN = 30;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        // PAS 2 i 3
        System.out.println("Quin és el preu del producte, en euros? ");
        float preu = lector.nextFloat();
        lector.nextLine();
        //PAS 4
        //Estructura de selecció simple.
        //Si l'expressió avalua true, executa el bloc dins l'if.
        //En cas contrari, ignora'l.
        if(COMPRA_MIN >= preu){
            //PAS I
            float agregaPreu = preu + PENALITZACIO;
            preu = agregaPreu;
        }
        //PAS 5
        System.out.println("El preu final per pagar és de " + preu + " euros.");
    }
    
}
