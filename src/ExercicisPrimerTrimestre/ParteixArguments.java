//Un programa que per a cada argument passat al mètode principal, se'n mostri
//a la pantalla la primera meitat, arrodonint cap amunt.
public class ParteixArguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int meitat = args[i].length() / 2;
            if (args[i].length() % 2 != 0) {
                meitat++;
            }
            String mitjaCadena = args[i].substring(0, meitat);
            System.out.println(mitjaCadena);
        }
    }
}
