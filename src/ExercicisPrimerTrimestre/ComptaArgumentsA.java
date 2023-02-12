public class ComptaArgumentsA {
    public static void main(String[] args) {
        //Un comptador de paraules amb 'a'.
        int numAs = 0;
        //Cal recórrer l'array d'arguments.
        for (int i = 0; i < args.length; i++) {
            //Es mira si hi ha alguna lletra 'a' a la cadena de text.
            if (-1 != args[i].indexOf('a')) {
                numAs++;
            }
        }
        System.out.println("El nombre de arguments amb el caràcter 'a' és " + numAs);
    }
}
