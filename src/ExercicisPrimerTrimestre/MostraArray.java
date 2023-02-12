//Un programa que mostra per pantalla el contingut d'un array.
public class MostraArray {
    public static void main(String[] args) {
        int[] array = {1, 12, 4, 5, 7, 9, 0, 9, 6, 7};
        //Començem el bucle per mostrar l'array per pantalla.
        System.out.println("El resultat del contigut de l'array es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
    
}
