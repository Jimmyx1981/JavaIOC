package joc.arena.interficie;
import joc.arena.fitxers.Bestiari;
import joc.arena.fitxers.Ranquing;
import joc.arena.regles.Lluitador;
/**
 *
 * @author jmart
 */
public class SortidaPantalla {
    /** Mostra per pantalla el missatge d'inici del Joc
     * 
     */
    public void mostraBenvinguda() {
        System.out.println("Benvingut al Joc de l'Arena");
        System.out.println("===========================");
        System.out.println("Escull amb astúcia la teva estratègia per sobreviure...");
    }
    
    /** Mostra l'estat d'un lluitador per pantalla.
     * 
     * @param ll Lluitador a visualitzar 
     */
    public void mostrarLluitador(int[] ll) {
        Lluitador lluitador = new Lluitador();
        Bestiari bestiari = new Bestiari();
        int id = lluitador.llegirId(ll);
        String nom = bestiari.traduirIdANom(id);
        System.out.print(nom);
        System.out.print("\tNivell: " + lluitador.llegirNivell(ll));
        System.out.print(" (punts: " + lluitador.llegirPunts(ll));
        System.out.print("\tVIDA: " + lluitador.llegirVida(ll));
        System.out.print(" (" + lluitador.llegirVidaMaxima(ll) + ")");
        System.out.print("\tATAC: " + lluitador.llegirAtac(ll));
        System.out.print("\tDEFENSA: " + lluitador.llegirDefensa(ll));
    }
    
    /** Mostra l'estat actual del jugador contra el seu adversari.
     * 
     * @param jugador Jugador
     * @param adversari Adversari
     */
    public void mostrarVersus(int[] jugador, int[] adversari) {
        System.out.print("JUGADOR: ");
        mostrarLluitador(jugador);
        System.out.print("VS");
        System.out.print("ADVERSARI: ");
        mostrarLluitador(adversari);
    }

    /** Mostra per pantalla la llista de puntuacions.
     *
     */
    public void mostrarRanking() {
        Ranquing rnk = new Ranquing();
        String s = rnk.llegirRanquing();
        if (s == null) {
            System.out.println("Hi ha un error en el fitxers de puntuacions!");
        } else {
            System.out.println(s);
        }
    }
}
