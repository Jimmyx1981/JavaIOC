import java.util.Scanner;
public class E12_1_MartinezR {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //Declarem les variables i els booleans.
        int codi = 0, persones = 0, comptador = 0, canvi = 0;
        boolean valid;
        //Preguntem el número de persones.
        System.out.println("Quants usuaris vols introduir?: ");
        persones = lector.nextInt();
        //Declarem l'array.
        int[] array = new int[persones];
        //Iniciem el bucle while.
        while (comptador < array.length){
            //Demanem un número de codi.
            System.out.println("Introdueix un codi d'usuari, entre 0 i 1000: ");
            valid = lector.hasNextInt();
            //Si el codi es un enter la condició es true.
            if (valid) {
            codi = lector.nextInt();
                if (codi >= 0 && codi <= 1000) {
                    System.out.println("El codi es valid");
                    System.out.println("El seu número de codi es: " + codi);
                    array[comptador] = codi;
                    comptador = comptador +1;
                //Si el número no està dins del rang.
                } else {
                    System.out.println("El número està fora de rang."
                            + "Introdueixi un codi entre 0 i 1000. ");
                    lector.nextLine();
                }
                //Si el codi no es un enter la condició es false.
            } else {
                System.out.println("El número no es enter."
                        + "Introdueixi un nombre enter: ");
                lector.next();
            }
        }
        //Iniciem el bucle for per recorrer l'array i mostrar el llistat de codis.
        System.out.println("El llistat de tots els codis introduïts es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //Bucle extern.
        //S'anirà posant a cada posició tractada, començant per la 0,
        //el valor més baix que es trobi.
        for (int i = 0; i < array.length; i++) {
            //Bucle intern.
            //Se cerca entre la resta de posicions quin és el valor més baix.
            for (int j = i + 1; j < array.length; j++) {
                //La posició tractada té un valor més alt que el de la cerca. Els
                //intercanviem.
                if (array[i] > array[j]) {
                    //Per intercanviar valors cal una variable auxiliar.
                    canvi = array[i];
                    array[i] = array[j];
                    array[j] = canvi;
                }
            }
        }
        //El mostrem per pantalla.
        System.out.println("L'array ordenat de menor a mayor es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
