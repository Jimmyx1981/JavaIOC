import java.util.Scanner;
//Anem a sumar un seguit de múltiples de tres
public class SumarMultiplesTres {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //PAS 1 i 2
        System.out.println("Fins a quin valor vols sumar múltiples de 3? ");
        int limit = lector.nextInt();
        lector.nextLine();
        int resultat = 0;
        //PAS 3: Anar mirant els vlors un per un. Es comença pel 0
        int i = 0;
        while (i <= limit){
            System.out.println("Afegim " + i + "...");
            resultat = resultat + 1;
            //Incrementem de tres en tres
            i = i + 3;
        }
        System.out.println("El resultat final és " + resultat + ".");
    }
    
}
