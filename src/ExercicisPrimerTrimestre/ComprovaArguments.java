//Comprova si els arguments es corresponen amb un conjunt preestablert.
public class ComprovaArguments {
    public static void main(String[] args) {
        String[] llista = {"-help", "-server", "-version"};
        //No oblideu mai comprovar si l'array conté arguments!
        if (llista.length > 0) {
            //Es va recorrent l'array i es mira quin valor hi ha.
            for (int i = 0; i < llista.length; i++) {
                if (llista[i].equals("-version")) {
                    System.out.println("S'ha usat l'argument \"-version\"");
                } else if (llista[i].equals("-help")) {
                    System.out.println("S'ha usat l'argument \"-help\"");
                } else if (llista[i].equals("-server")) {
                    System.out.println("S'ha usat l'argument \"-server\"");
                } else {
                    System.out.println("L'argument \"" + llista[i] + "\" no es valid!");
                }
            }
        } else {
            System.out.println("No hi havia cap argument.");
        }
    }
}
