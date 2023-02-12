import java.util.Scanner;
//Anem a llegir un enter entre 0 i 10.
public class ValorFinat {
   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int valorUsuari = 0;
        do{
        //PAS 1 i 2: Com a mínim, segur que es pregunta un cop.
            System.out.println("Introdueix un valor enter entre 0 i 10: ");
            valorUsuari = lector.nextInt();
            lector.nextLine();
            //PAS 3: Només té sentit avaluar si 'valor' és valid un cop s'ha llegit.
        } while ((valorUsuari < 0)||(valorUsuari > 10));
        //PAS 4 Tot correcte.
        System.out.println("Dada correcta. Has escrit " + valorUsuari);
    }
    
}
