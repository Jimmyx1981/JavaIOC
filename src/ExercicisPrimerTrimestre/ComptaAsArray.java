//Un programa que compta quantes lletres 'a' conté un array.
public class ComptaAsArray {
    public static void main(String[] args) {
        char[] arrayLletres = {'a', 'b', 'c', 'a', 'd', 'a', 'x', 'u', 'a', 'e', 'u', 'i'};
        
        int comptador = 0;
        for (int i = 0; i < arrayLletres.length; i++) {
            if ((arrayLletres[i] == 'a')||(arrayLletres[i] == 'e')||(arrayLletres[i] == 'i')
                    ||(arrayLletres[i] == 'o')||(arrayLletres[i] == 'u')) {
                comptador++;
            }
        }
        System.out.println("El número de vocals es: " + comptador);
    }
}
