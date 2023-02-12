import java.util.Scanner;
//A veure quants dies té un mes...
public class DiesDelMes {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        //PAS 1 i 2
        System.out.println("Introdueix el número de mes del 1 al 12: ");
        int mes = lector.nextInt();
        lector.nextLine();
        
        //PAS 3
        System.out.println("Els dies d'aquest mes son: ");
        switch(mes){
            //PAS I
            case 2:
                System.out.println("28 o 29!");
                break;
            //PAS II
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30!");
                break;
            //PAS III
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31!");
                break;
            default:
            System.out.println("Aquest mes no existeix!");
        }
        
    }
    
}
