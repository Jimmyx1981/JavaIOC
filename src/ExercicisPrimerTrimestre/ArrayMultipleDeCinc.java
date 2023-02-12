package ExercicisPrimerTrimestre;

//Un programa que guarda en un arrray els primers 100 nombres multiples de 5.
public class ArrayMultipleDeCinc {
    public static void main(String[] args) {
        int[] array = new int[50];
        int index = 0;
        
        for (int i = 1; i < 50; i++) {
            if (i % 5 == 0){
                array[i] = i;
                System.out.print(array[i] + ", ");
            }
        }
    }
}
