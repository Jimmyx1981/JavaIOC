package joc.arena.inici;
import joc.arena.fitxers.Bestiari;
import joc.arena.fitxers.Ranquing;
import joc.arena.regles.Combat;
import joc.arena.regles.Lluitador;
import joc.arena.interficie.EntradaTeclat;
import joc.arena.interficie.SortidaPantalla;
/**
 *
 * @author jmart
 */
public class JocArena {
    public static final int MAX_COMBAT = 10;
    private EntradaTeclat entrada = new EntradaTeclat();
    private SortidaPantalla sortida = new SortidaPantalla();
    private Lluitador lluitador = new Lluitador();
    private Combat combat = new Combat();
    private Bestiari bestiari = new Bestiari();
    public static void main(String[] args) {
        JocArena programa = new JocArena();
        programa.inici();
    }
    
    public void inici() {
        // Mirar si hi ha fitxer d'adversaris
        if (bestiari.existeixFitxer() == false) {
            System.out.println("No hi ha el fitxer d'adversaris!");
        } else {
            sortida.mostraBenvinguda();
            int[] jugador = bestiari.generarJugador();
            int numCombat = 0;
            boolean jugar = true;
            while (jugar) {
                numCombat++;
                // Abans de cada combat es restaura al jugador
                lluitador.restaurar(jugador);
                // Inici d'un combat
                System.out.println("*** COMBAT " + numCombat);
                System.out.print("Estat actual del jugador: ");
                sortida.mostrarLluitador(jugador);
                System.out.println("************************");
                // S'obté l'adversari
                int[] adversari = entrada.triarAdversari(lluitador.llegirNivell(jugador));
                // Combat
                combatre(jugador, adversari);
                // Fi
                jugar = fiCombat(jugador, adversari);
                // Fi
                if (numCombat == MAX_COMBAT) {
                    System.out.println("Has sobreviscut a tots els combats. Enhorabona!!");
                }
            }
            System.out.print("Estat final del jugador: ");
            sortida.mostrarLluitador(jugador);
            // Nou: comprovar si entra al rànquing (10 posicions)
            Ranquing rnk = new Ranquing();
            int punts = lluitador.llegirPunts(jugador);
            int pos = rnk.cercarRanking(punts);
            if (pos != -1) {
                if (pos < 10) {
                    String inicials = entrada.preguntarInicials();
                    int err = rnk.entrarPuntuacio(inicials, punts, pos);
                    if (err == -1) {
                        System.out.println("Error accedint al fitxer de puntuacions.");
                    }
                }
                sortida.mostrarRanking();
            } else {
                System.out.println("Error accedint al fitxer de puntuacions.");
            }
        }
    }
    
    /** Resol totes les rondes d'un combat.
     * 
     * @param jugador Estat del jugador
     * @param adversari Estat de l'adversari
     */
    public void combatre(int[] jugador, int[] adversari) {
        boolean combatre = true;
        int numRonda = 0;
        while (combatre) {
            numRonda++;
            if (numRonda%5 == 0) {
                // A les rondes múltiples de 5 es restauren l'atac i la defensa
                lluitador.restaurar(jugador);
                lluitador.restaurar(adversari);
            }
            System.out.println("--- RONDA " + numRonda);
            sortida.mostrarVersus(jugador, adversari);
            System.out.println("--------------------------");
            int accioJug = entrada.preguntarEstrategia();
            int accioAdv = lluitador.triarEstrategiaAtzar(adversari);
            System.out.print("Has triat " + combat.estrategiaAText(accioJug));
            System.out.println(" i el teu enemic " + combat.estrategiaAText(accioAdv));
            combat.resoldreEstrategies(jugador, accioJug, adversari, accioAdv);
            if (lluitador.esMort(jugador)||lluitador.esMort(adversari)) {
                combatre = false;
            }
        }
    }
    
    public boolean fiCombat(int[] jugador, int[] adversari) {
        if (lluitador.esMort(jugador)) {
            // Has perdut (Nota: tambè inclou el cas que tots dos moren alhora)
            System.out.println("Has estat derrotat... :-(");
            return false;
        }
        System.out.println("Has guanyat el combat :-)");
        boolean pujarNivell = lluitador.atorgarPunts(jugador, adversari);
        if (pujarNivell) {
            System.out.println("Has pujat de nivell!!");
            lluitador.pujarNivell(jugador);
        }
        return true;
    }
}
