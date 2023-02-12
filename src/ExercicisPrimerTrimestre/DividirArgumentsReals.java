public class DividirArgumentsReals {
    public static void main(String[] args) {
        //Està bé comprovar si el nombre d'arguments és correcte.
        if (args.length != 2) {
            System.out.println("El nombre d'arguments és incorrecte.");
        } else {
            //Conversió de tipus.
            double dividend = Double.parseDouble(args[0]);
            double divisor = Double.parseDouble(args[1]);
            double resultat = dividend/divisor;
            System.out.println("El resultat és " + resultat);
        }
    }
}
