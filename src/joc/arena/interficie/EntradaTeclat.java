package joc.arena.interficie;
import java.util.Scanner;
import joc.arena.fitxers.Bestiari;
import joc.arena.regles.Combat;

/**
 *
 * @author jmart
 */
public class EntradaTeclat {
    
    /** Tria l'adversari del jugador segons la seva resposta.
     * 
     * @param nivell Nivell del jugador
     * @return Cadena de text amb la resposta
     */
    public int[] triarAdversari(int nivell) {
        System.out.println("Contra quin adversari vols lluitar en aquest convat? ");
        Scanner lector = new Scanner(System.in);
        String resposta = lector.nextLine();
        Bestiari bestiari = new Bestiari();
        int[] adversari = bestiari.cercarAdversari(resposta);
        if (adversari == null) {
            System.out.println("Aquest enemic no existeix. Es tria a l'atzar.");
            adversari = bestiari.triarAdversariAtzar(nivell);
        }
        return adversari;
    }
    
    /** Pregunta a l'usuari quina estratègia vol usar, d'entre
     * les quatre possibles.
     * 
     * @return Acció a dur a terme, d'acord amb les constants de la classe Combat
     */
    public int preguntarEstrategia() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Quina estrategia vols seguir aquesta ronda?");
        System.out.println("[A]tacar\t[D]efensar\t[E]ngany\t[M]aniobra");
        System.out.println("---------");
        boolean preguntar = true;
        int accio = -1;
        while (preguntar) {
            System.out.println("Acció: ");
            String resposta = lector.nextLine();
            if ("A".equalsIgnoreCase(resposta)) {
                accio = Combat.ATAC;
                preguntar = false;
            } else if ("D".equalsIgnoreCase(resposta)) {
                accio = Combat.DEFENSA;
                preguntar = false;
            } else if ("E".equalsIgnoreCase(resposta)) {
                accio = Combat.ENGANY;
                preguntar = false;
            } else if ("M".equalsIgnoreCase(resposta)) {
                accio = Combat.MANIOBRA;
                preguntar = false;
            } else {
                System.out.println("Acció incorrecta...");
            }
        }
        return accio;
    }

    /** Pregunta les inicials del jugador si assoleix una màxima puntuació
     *
     * @return Inicials (dadena de text amb 3 caràcters)
     */
    public String preguntarInicials() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Has assolit una màxima puntuació!!");
        String inicials = "";
        boolean llegir = true;
        while (llegir) {
            System.out.print("Escriu les teves inicials: ");
            inicials = lector.nextLine();
            // Aquest mètode elimina espais laterals
            inicials = inicials.trim();
            if (inicials.length() == 3) {
                llegir = false;
            } else {
                System.out.print("Entrada incorrecta. ");
            }
        }
        // Sempre es posaran en majúscula.
        return inicials.toUpperCase();
    }
}
