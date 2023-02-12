package joc.arena.regles;
import java.util.Random;

/**
 *
 * @author jmart
 */

public class Lluitador {
    // Format
    // Nom:Nivell:XP:PV:Max PV:Atac:max Defensa
    public final static int ID = 0;
    public final static int NIVELL = 1;
    public final static int PUNTS = 2;
    public final static int VIDA = 3;
    public final static int VIDA_MAX = 4;
    public final static int ATAC = 5;
    public final static int ATAC_MAX = 6;
    public final static int DEFENSA = 7;
    public final static int DEFENSA_MAX = 8;
    
    /** Infligeix dany a un lluitador, restant punts de vida, fins a un minín de
     * 0.
     * 
     * @param lluitador Lluitador que rep el dany.
     * @param punts Punts de vida que perd.
     */
    public void danyar(int[] lluitador, int punts) {
        if(lluitador[VIDA] > punts) {
            lluitador[VIDA] = lluitador[VIDA] - punts;
        } else {
            lluitador[VIDA] = 0;
        }
    }
    
    /** Guareix un lluitador, que recupera punts de vida. Mai pot superar
     * el màxim possible.
     * 
     * @param lluitador Lluitador a guarir.
     * @param punts Punts de vida recuperats.
     */
    public void guarir(int[] lluitador, int punts) {
        lluitador[VIDA] = lluitador[VIDA] + punts;
        if (lluitador[VIDA] > lluitador[VIDA_MAX]) {
            lluitador[VIDA] = lluitador[VIDA_MAX];
        }
    }
    
    /** Aplica una penalització al lluitador. Es fa a l'atzar entre el valor
     * d'atac i el de defensa. Se li resta un punt, fins a un valor mínim d'1.
     * 
     * @param lluitador Lluitador a penalitzar
     * @param grau Grau de penalització
     */
    public void penalitzar(int[] lluitador, int grau) {
        //Es tria quina habilitat penalitzar
        Random rnd = new Random();
        int penalitzar = ATAC;
        if (rnd.nextBoolean()) {
            penalitzar = DEFENSA;
        }
        // Es penalitza. Mínim baixa fins a 1
        lluitador[penalitzar] -= grau;
        if (lluitador[penalitzar] < 1) {
            lluitador[penalitzar] = 1;
        }
    }
    
    /** Renova un lluitador, anul·lant totes les penalitzacions i danys.
     * 
     * @param lluitador Lluitadro a renovar 
     */
    public void renovar(int[] lluitador) {
        restaurar(lluitador);
        lluitador[VIDA] = lluitador[VIDA_MAX];
    }
    
    /** Restaura els valors d'atac i defensa del lluitador als valors originals.
     * 
     * @param lluitador Lluitador a restaurar 
     */
    public void restaurar(int[] lluitador) {
        lluitador[ATAC] = lluitador[ATAC_MAX];
        lluitador[DEFENSA] = lluitador[DEFENSA_MAX];
    }
    
    /** Resol l'atorgament de punts a l'aventurer en derrotar un adeversari. La
     * quantitat de punts depèn de la diferencia de nivells entre els dos. Si es 
     * guanyen prou punts, s'avisa que cal pujar de nivell.
     * 
     * @param aventurer Aventurer
     * @param adversari Adversari derrotat
     * @return Si s'ha pujat de nivell (cada 100 punts)
     */
    public boolean atorgarPunts(int[] aventurer, int[] adversari) {
        // Es calcula el multiplicador
        float multiplicador = 0;
        int numMultiplicadors = adversari[NIVELL] - aventurer[NIVELL] + 2;
        for (int i = 0; i < numMultiplicadors; i++) {
            multiplicador += 0.5;
        }
        // Punts finals a atorgar
        int puntsAdversari = llegirPunts(adversari);
        int puntsAtorgats = Math.round(puntsAdversari + multiplicador);
        // Puja de nivell?
        aventurer[PUNTS] += puntsAtorgats;
        int nouNivell = 1 + aventurer[PUNTS]/100;
        if (nouNivell > aventurer[NIVELL]) {
            return true;
        }
        return false;
    }
    
    /** Resol un increment d'un nivell, augmentant a l'atzar l'atac o defensa i
     * dos punts de vida màxims. A més a més, el lluitador es guareix totalment.
     * 
     * @param lluitador Lluitador que puja de nivell. 
     */
    public void pujarNivell(int[] lluitador) {
        lluitador[NIVELL]++;
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            // S'incrementa atac
            lluitador[ATAC_MAX]++;
        } else {
            // S'incrementa defensa
            lluitador[DEFENSA_MAX]++;
        }
        lluitador[VIDA_MAX] += 2;
        // Es deixa nou de trinca
        renovar(lluitador);
    }
    
    // Mètodes d'accions vinculades a l'estat del lluitador
    /** Resol una tirada d'atac d'un lluitador. Es llencen tantes monedes com
     * el seu valor d'atac.
     * 
     * @param lluitador Lluitador que fa la tirada
     * @return El nombre de cares obtingudes
     */
    public int tirarAtac(int[] lluitador) {
        Monedes monedes = new Monedes();
        return monedes.ferTirada(lluitador[ATAC]);
    }
    
    /** Resol una tidada de defensa d'un lluitador. Es llencen tantes monedes com
     * el seu valor de defensa.
     * 
     * @param lluitador Lluitador que fa la tirada
     * @return El nombre de cares obtingudes
     */
    public int tiraDefensa(int[] lluitador) {
        Monedes monedes = new Monedes();
        return monedes.ferTirada(lluitador[DEFENSA]);
    }
    
    /** Donat un lluitador, tria a l'atzar quina estratègia usar en una 
     * ronda de combat.
     * 
     * @param lluitador Lluitador que tria l'acció
     * @return Acció triada
     */
    public int triarEstrategiaAtzar(int[] lluitador) {
        Random rnd = new Random();
        int limitDefensa = 3;
        // Si li queda poca vida, defensa el 50% dels cops
        if (lluitador[VIDA] < 2) {
            limitDefensa = 1;
        }
        int accio = rnd.nextInt(10);
        if ((accio >= 0)&&(accio < limitDefensa)) {
            return Combat.ATAC;
        } else if ((limitDefensa >= 3)&&(accio < 6)) {
            return Combat.DEFENSA;
        } else if ((accio >= 6)&&(accio < 8)) {
            return Combat.ENGANY;
        } else {
            return Combat.MANIOBRA;
        }
    }
    
    // Mètodes per facilitar la lectura de dades
    /** Diu l'identificador d'un lluitador. Usar un mètode facilita la lectura
     * del codi, més que accedir a posicions d'un array.
     * 
     * @param lluitador Lluitador de qui es vol llegir l'identificador
     * @return Identificador del lluitador
     */
    public int llegirId(int[] lluitador) {
        return lluitador[ID];
    }
    
    /** Diu quin es el nivell del lluitador. Usar un mètode facilita la lectura
     * del codi, més que accedir a posicions d'un array.
     * 
     * @param lluitador Lluitador de qui es vol llegir el nivell
     * @return Nivell del lluitador
     */
    public int llegirNivell(int[] lluitador) {
        return lluitador[NIVELL];
    }
    
    /** Diu quins punts val el lluitador. Usar un mètode facilita la lectura
     * del codi, més que accedir a posicions d'un array.
     * 
     * @param lluitador LLuitador a qui es volen llegir els punts
     * @return Punts del lluitador
     */
    public int llegirPunts(int[] lluitador) {
        return lluitador[PUNTS];
    }
    
    /** Diu quina vida té el lluitador. Usar un mètode facilita la lectura
     * del codi, més que accedir a posicions d'un array.
     * 
     * @param lluitador Lluitador a qui es vol llegir la vida
     * @return Vida del lluitador
     */
    public int llegirVida(int[] lluitador) {
        return lluitador[VIDA];
    }
    
    /** Diu quina vida màxima té el lluitador. Usar un mètode facilita la lectura
     * del codi, més que accedir a posicions d'un array.
     * 
     * @param lluitador Lluitador a qui es vol llegir la vida màxima
     * @return Vida màxima del lluitador
     */
    public int llegirVidaMaxima(int[] lluitador) {
        return lluitador[VIDA_MAX];
    }
    
    /** Diu quina atac té el lluitador. Usar un mètode facilita la lectura
     * del codi, més que accedir a posicions d'un array.
     * 
     * @param lluitador Lluitador a qui es vol llegir l'atac
     * @return L'atac del lluitador
     */
    public int llegirAtac(int [] lluitador) {
        return lluitador[ATAC];
    }
    
    /** Diu quina es la defensa del lluitador. Usar un mètode facilita la lectura
     * del codi, més que accedir a posicions d'un array.
     * 
     * @param lluitador Lluitador a qui es vol llegir la defensa
     * @return La defensa del lluitador
     */
    public int llegirDefensa(int [] lluitador) {
        return lluitador[DEFENSA];
    }
    
    /** Diu si un lluitador és mort o no. O sigui, si els seus punts de vida
     * son 0 ara mateix. Usar un mètode facilita la lectura del codi, més que
     * accedir a posicions d'un array.
     * 
     * @param lluitador Lluitador a qui es vol llegir la defensa
     * @return La defensa del lluitador
     */
    public boolean esMort(int [] lluitador) {
        return(lluitador[VIDA] == 0);
    }
}
