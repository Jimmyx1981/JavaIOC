package joc.arena.regles;
/**
 *
 * @author jmart
 */
public class Combat {
    // Constants que ens indiquen possibles accions de combat
    public static final int ATAC = 0;
    public static final int DEFENSA = 1;
    public static final int ENGANY = 2;
    public static final int MANIOBRA = 3;
    
    /** Donat el codi d'una estratègia, el converteix a text.
     * 
     * @param accio acció Codi de l'estratègia
     * @return Text associat
     */
    public String estrategiaAText(int accio) {
        switch (accio) {
            case ATAC: return "ATAC";
            case DEFENSA: return "DEFENSA";
            case ENGANY: return "ENGANY";
            case MANIOBRA: return "MANIOBRA";
        }
        return "DESCONEGUDA";
    }
    
    /** Obté en grau d'exit corresponent segons l'acció triada pel lluitador.
     * 
     * @param ll Lluitador que fa l'acció
     * @param accio Acció triada
     * @return Grau d'èxit de l'acció
     */
    public int calcularGrauExit(int[] ll, int accio) {
        Lluitador lluitador = new Lluitador();
        switch (accio) {
            case ATAC,ENGANY: return lluitador.tirarAtac(ll);
            default: return lluitador.tiraDefensa(ll);
        }
    }
    
    public void resoldreEstrategies(int[] jug, int accioJug, int[] adv, int
                                    accioAdv) {
        int exitJug = calcularGrauExit(jug, accioJug);
        int exitAdv = calcularGrauExit(adv, accioAdv);
        Lluitador lluitador = new Lluitador();
        if ((accioJug == ATAC)&&(accioAdv == ATAC)) {
            // Jug i Adv: Danyat
            lluitador.danyar(jug, exitAdv);
            lluitador.danyar(adv, exitJug);
        } else if ((accioJug == ATAC)&&(accioAdv == DEFENSA)) {
            // Adv: Guarit
            lluitador.guarir(adv, exitAdv);
        } else if ((accioJug == ATAC)&&(accioAdv == ENGANY)) {
            // Adv: Danyat
            lluitador.danyar(adv, exitJug);
        } else if ((accioJug == ATAC)&&(accioAdv == MANIOBRA)) {
            // Adv: Danyat
            lluitador.danyar(adv, exitJug);
        } else if ((accioJug == DEFENSA)&&(accioAdv == ATAC)) {
            // Jug: Guarit
            lluitador.guarir(jug, exitJug);
        } else if ((accioJug == DEFENSA)&&(accioAdv == DEFENSA)) {
            // Jug i Adv: Guarit
            lluitador.guarir(adv, exitAdv);
            lluitador.guarir(jug, exitJug);
        } else if ((accioJug == DEFENSA)&&(accioAdv == ENGANY)) {
            // Jug: Danyat x2
            lluitador.danyar(jug, exitAdv*2);
        } else if ((accioJug == DEFENSA)&&(accioAdv == MANIOBRA)) {
            // Jug: Penalitzat
            lluitador.penalitzar(jug, exitAdv);
        } else if ((accioJug == ENGANY)&&(accioAdv == ATAC)) {
            // Jug: Danyat
            lluitador.danyar(jug, exitAdv);
        } else if ((accioJug == ENGANY)&&(accioAdv == DEFENSA)) {
            // Adv: Danyat x2
            lluitador.danyar(adv, exitJug*2);
        } else if ((accioJug == ENGANY)&&(accioAdv == ENGANY)) {
            // Jug i Adv: Danyat
            lluitador.danyar(adv, exitAdv);
            lluitador.danyar(adv, exitJug);
        } else if ((accioJug == ENGANY)&&(accioAdv == MANIOBRA)) {
            // Jug: Penalitzat
            lluitador.penalitzar(jug, exitAdv);
        } else if ((accioJug == MANIOBRA)&&(accioAdv == ATAC)) {
            // Jug: Danyat
            lluitador.danyar(jug, exitAdv);
        } else if ((accioJug == MANIOBRA)&&(accioAdv == DEFENSA)) {
            // Adv: Penalitzat
            lluitador.penalitzar(adv, exitJug);
        } else if ((accioJug == MANIOBRA)&&(accioAdv == ENGANY)) {
            // Adv: Penalitzat
            lluitador.penalitzar(adv, exitJug);
        } else if ((accioJug == MANIOBRA)&&(accioAdv == MANIOBRA)) {
            // Jug i Adv: Penalitzat
            lluitador.penalitzar(adv, exitJug);
            lluitador.penalitzar(jug, exitAdv);
        } else {
            // No s'hauria de donar aquest cas...
        }
    }
}
