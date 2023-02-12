import java.util.Scanner;
public class DivuixaTriangle {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Quina altura vols? ");
        int alt = lector.nextInt();
        lector.nextLine();
        
        int comptador = 1;
        
        //Una interació per línea.
        for (int i=0; i<alt; i++){
            //Escribim un cert nombre de lletres 'a'.
            for (int j=0; j<comptador; j++){
                System.out.print("a");
            }
            comptador++;
            System.out.println();
        }
    }
}
