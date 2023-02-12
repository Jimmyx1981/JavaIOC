import java.util.Scanner;
//Un programa que mostra la taula de multiplicar d'un nombre, usant 'for'.
public class TaulaMultiplicarFor {
    public static void main(String[] args) {
        //S'inicialitza la biblioteca.
        Scanner lector = new Scanner(System.in);
        //Pregunta el nombre.
        System.out.println("Quina taula de multiplicar vols? ");
        int taula = lector.nextInt();
        lector.nextLine();
        //El comptador servirà per fer càlculs.
        //En lloc de 'i++' també es podria escriure 'i = i + 1'.
        for (int i=0; i<=10; i=i+3){
            int resultat = taula*i;
            System.out.println(taula + "*" + i + " = " + resultat);
        }
        System.out.println("Aquesta ha estat la taula del " + taula);
    }
    
}
