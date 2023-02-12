//Un programa que mostra per pantalla el segon múltiple de 3 que trobi en una array.
public class CercaTresCercaTres {
    public static void main(String[] args) {
        int[] array = {1, 12, 4, 5, 7, 3, 2, 9, 6, 7};
        int i = 0;
        int multipleDeTres = 0;
        
        while ((multipleDeTres < 2)&&(i < array.length)) {
            if (array[i]%3 == 0) {
                multipleDeTres++;
                if (multipleDeTres == 2) {
                    System.out.println("El segon múltiple és: " + array[i] + ".");
                }
            }
            i++;
        }
        if (multipleDeTres < 2) {
            System.out.println("Hi ha menys de 2 múltiples de tres...");
        }
    }
    
}
