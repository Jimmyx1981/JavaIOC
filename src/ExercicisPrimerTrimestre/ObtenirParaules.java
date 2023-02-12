import java.util.Scanner;
public class ObtenirParaules {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase de text i pitja retorn:");
        String text = lector.nextLine();
        boolean fi = false;
        //Mitjantçant un bucle, s'anirà escurçant el text paraula per paraula.
        do {
            //La primera paraula va de l'inici al primer espai.
            int primerEspai = text.indexOf(" ");
            //No hi ha espais. No hi ha cap paraule mes per escriure.
            if (primerEspai == -1) {
                System.out.println(text);
                fi = true;
            } else {
                //Hi ha un espai. Extreure paraula i mostrar-la.
                String paraula = text.substring(0, primerEspai);
                System.out.println(paraula);
                //S'elimina la paraula del text, de manera que s'escurça.
                text = text.substring(primerEspai + 1, text.length());
            }
        } while (!fi);
    }
}
