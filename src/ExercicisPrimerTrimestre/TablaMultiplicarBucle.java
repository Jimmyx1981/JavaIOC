import java.util.Scanner;
//Un programa que mostra la taula de multiplicar d'un nombre
public class TablaMultiplicarBucle {
    public static void main(String[] args) {
        //S'inicialitza la biblioteca
        Scanner lector = new Scanner(System.in);
        //Pregunta en nombre
        System.out.println("Quina taula de multiplicar vols? ");
        int taula = lector.nextInt();
        lector.nextLine();
        //El comptador servirà per fer càlculs.
        int i = 10;
        while (i >= 1){
            int resultat = taula * i;
            System.out.println(taula + " * " + i + " = " + resultat);
            i = i - 1;
        }
        System.out.println("Aquesta ha estat la taula del " + taula);
    }
    
}
