import java.util.Scanner;
public class e10_MartinezR {
    //Declarem les constants.
    public static final int COMPTADOR = 3;
    public static final int VALOR_MIN = 20;
    public static final int VALOR_MAX = 100;
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int valor = 0, acumulador = 0, comptador = COMPTADOR, suma = 0;
        boolean numValid;
        boolean error = false;
        do{
            System.out.println("Introdueix un valor entre 20 i 100.");
            numValid = lector.hasNextInt();
            if (numValid){
                valor = lector.nextInt();
                if ((valor >= VALOR_MIN)&&(valor <= VALOR_MAX)){
                    System.out.println("El valor introduit es: " + valor);
                    System.out.println("La llista dels valors senars fins a " + valor);
                    //Iniciem el bucle for
                    for (int i=1; i<=valor; i = i+2){
                        acumulador = acumulador + i;
                        System.out.print(i + ",");
                        }
                        comptador--;
                        suma = acumulador;
                        System.out.println("\nLa suma de tots el números es: " + suma);
                        acumulador = 0;
                    } else if (valor < 0){
                        System.out.println("Error! El programa ha finalitzat");
                        error = true;
                    } else if (valor < 20 || valor > 100){
                        System.out.println("El nombre esta fora de rang");
                        lector.nextLine();
                    } 
            }  
            if(!numValid){
                System.out.println("El nombre no es sencer");
                lector.nextLine();
                }
            }while ((comptador != 0)&&(!error)); 
    }
}

        
     
    
    

