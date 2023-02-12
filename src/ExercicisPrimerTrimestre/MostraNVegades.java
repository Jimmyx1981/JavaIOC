//Mostra una cadena de text N vegades, partint d'arguments d'entrada.
public class MostraNVegades {
    public static void main(String[] args) {
        //Es mira si hi ha els 2 arguments que corresponen.
        if (args.length != 2) {
            System.out.println("El nombre d'arguments no es correcte");
        } else {
            //Hi ha 2 arguments, el segon és el nombre de vegades.
            int numVegades = Integer.parseInt(args[1]);
            //Fem una estructura de repetició. Cal demostrar el primer argument
            //N vegades.
            for (int i = 0; i < numVegades; i++) {
                System.out.println(args[0]);
            }
        }
    }
}
