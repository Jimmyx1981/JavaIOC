import java.util.Scanner;
//Un programa que demana nombres fins a introduïr FI. Desprès mostra per pantalla
//tots els nombres parells introduïts.
public class ComptaParells {
    public static int FI = 0;
    public static int MAX = 100;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        int array[] = new int[MAX];
        int index = 0;
        int contador = 0;
        
        do {
            System.out.println("Introdueix un nombre, si vols acabar 0.");
            numero = lector.nextInt();
            if (numero != FI) {
                array[index] = numero;
                index++;
            } else {
                System.out.println("El programa ha finalitzat");
            }
        } while (numero != FI);
        
        System.out.println("Els numeros de l'array son:");
        for (int i = 0; i < index; i++) {
            if (array[i] %2 == 0){
                contador++;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nEls numeros parells son " + contador);
    }
}
