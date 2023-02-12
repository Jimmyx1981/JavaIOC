import java.util.Scanner;
//Un programa que guarda nombres en un array i el recorreix fins trobar un -1.
public class ValorMinim {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int marcaFi = -1;
        
        int[] array = new int [20];
        
        System.out.println("Introdueix els números, si vols finalitzar -1");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = lector.nextInt();
            if (array[i] != marcaFi) {
                System.out.println(array[i]);
            } else {
                System.out.println("programa finalitzat");
                break;
            }
            
        }  
    }
}        
      
    
    

