import java.util.Scanner;
//Un programa que demani 'i' valor, i ompli un array amb 'i' primers nombres 
//parells positius partint des del 0.
public class OmpleArrayParells {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix un valor sencer positiu: ");
        int valor = lector.nextInt();
        int[] array = new int[valor*2];
        
        for (int i = 0; i < valor*2; i = i + 2) {
            array[i] = i;
            System.out.print(array[i] + ",");
        }
        
    }
    
}
