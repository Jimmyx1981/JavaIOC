import java.util.Scanner;
//Un programa que mostra N taules de multiplicar.
public class TaulaMultiplicarN {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Fins a quina taula de multiplicar vols conèixer? ");
        int taules = lector.nextInt();
        lector.nextLine();
        //Bucle de primer nivell: inici del bucle que gener N taules de multiplicar.
        for (int i=1; i<=taules; i++){
            System.out.println("La taula del " + i);
            //Bucle de segon nivell: inici del bucle que gener auna taula concreta.
            for(int j=1; j<=10; j++){
                int resultat = i*j;
                System.out.println(i + " * " + j + " = " + resultat);
            }
            //Fi del bucle que genera una taula concreta.
            System.out.println("____________");
        }
        //Fi del bucle que genera N taules de multiplicar.
    }
    
}
