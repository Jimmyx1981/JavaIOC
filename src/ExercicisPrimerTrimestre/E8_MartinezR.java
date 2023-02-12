import java.util.Scanner;
/**Programa que demani un nombre sencer, analitzi si es correcte
 * i mostri per pantalla els multiples fins a 100.
 * @author jmart
 */
public class E8_MartinezR {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            boolean correcte = false;//Definim una variable booleana
            while (!correcte){//Iniciem el bucle while
                //Demanem un nombre al usuari
                System.out.println("Introdueix un nombre enter del 1 al 20");
                int nombre = lector.nextInt();
                System.out.println("El nombre introduit es: " + nombre);
                int multiples = 0;
                //Analitzem si el nombre cumpleix els requisits
                if ((nombre%2 == 0)&&(nombre <= 20)&&(nombre >= 1)){
                    //Si es correcte entra en el bucle while
                    while((nombre <= 100)&&(multiples <= 100)){
                        multiples = nombre + nombre;
                        System.out.println(multiples - nombre);
                        nombre = multiples;
                    }
                    correcte = true;
                    //Si no es correcte el programa torna al principi
                } else {
                    System.out.println("El nombre ha de ser enter.");
                    
                }
            }
    }
}
    

