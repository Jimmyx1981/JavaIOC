import java.util.Scanner;
//Anem a calucular potències de dos.
public class Potencies {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Fins a quin valor vols anar cercant potències de dos? ");
        int valor = lector.nextInt();
        lector.nextLine();
        //La variable 'i' s'incrementa multiplicant en lloc de sumant.
        //'i' és el mateix resultat.
        for (int i=1; i<=valor; i=i*2){
            System.out.println(i);
        }
    }
    
}
