import java.util.Scanner;
//A veure quants dies té un mes...
public class DiesDelMesIf {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Quin número de mes vols analitzar [1-12]? ");
        int mes = lector.nextInt();
        lector.nextLine();
        
        System.out.println("Els dies d'aquest mes deuen ser...");
        if (mes == 2){
            System.out.println("28 o 29!");
        } else if ((mes == 4)||(mes == 6)||(mes == 9)||(mes == 11)){
            System.out.println("30!");
        } else if ((mes == 1)||(mes == 3)||(mes == 7)||(mes == 8)||(mes ==
                10)||(mes == 12)){
            System.out.println("31!");
        } else {
            System.out.println("Aquest mes no existeix!");
        }
        
    }
    
}
