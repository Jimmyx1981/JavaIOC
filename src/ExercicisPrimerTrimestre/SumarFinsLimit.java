import java.util.Scanner;
public class SumarFinsLimit {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introdueix un nombre enter: ");
        int valor = lector.nextInt();
        
        int comptador = 0;
        int acumulat = 0;
        
        while (acumulat <= valor){
            acumulat = acumulat + comptador;
            if(acumulat <= valor){
                System.out.println(comptador);
                comptador++;
            }
        }
        System.out.println("La suma dels valors positius és " + 
                (acumulat - comptador) + ".");
    }
}
    

