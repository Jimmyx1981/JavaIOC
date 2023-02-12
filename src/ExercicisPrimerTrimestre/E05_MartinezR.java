import java.util.Scanner;
public class E05_MartinezR {
    //Definim les constants
    public static final int NUMORDRE_MIN = 1;
    public static final int NUMORDRE_MAX = 499;
    public static final int TE_GERMA = 40;
    public static final int VIU_ZONA = 30;
    public static final int TREB_ZONA = 20;
    public static final int TE_DISC = 10;
    public static final int FAM_NOM = 15;
    public static final int FAM_EXALUMNE = 5;
    public static void main(String[] args) {
        //Definim les variables
        int numOrdre, numRegistre, punts = 0, teGerma, viuZona, trebZona, teDisc,
            famNom, famExalumne;
        boolean dadesCorrectes;
        //Creem Scanner per llegir les dates
        Scanner scan = new Scanner(System.in);
        //Demanem les dades de l'alumne
        System.out.println("Quin es el número de registre del nen?:");
        dadesCorrectes = scan.hasNextInt();//Analitzem el tipus de dades
        if (dadesCorrectes){//Si les dades son correctes
            numOrdre = scan.nextInt();
            if ((numOrdre<NUMORDRE_MIN)||(numOrdre>NUMORDRE_MAX)){
                dadesCorrectes = false;//Si el número no es valid
                System.out.println("Número erroni");
            } else {//Demanem les dades del alumne
                System.out.println("Té algun germà al centre?:(0:no/1:si)");
                teGerma = scan.nextInt();
                System.out.println("Viu a la zona de l'escola?:(0:no/1:si)");
                viuZona = scan.nextInt();
                System.out.println("Pare o Mare treballen a la zona de l'escola?:(0:no/1:si)");
                trebZona = scan.nextInt();
                System.out.println("Té discapacitat o malaltia crònica?:(0:no/1:si)");
                teDisc = scan.nextInt();
                System.out.println("Família nombrosa o monoparental?:(0:no/1:si)");
                famNom = scan.nextInt();
                System.out.println("Pare, Mare o germà són ex-alumnes?:(0:no/1:si)");
                famExalumne = scan.nextInt();
                //Calculem puntuació
                if (teGerma == 1){
                punts = punts + TE_GERMA;
                } if (viuZona == 1){
                punts = punts + VIU_ZONA;
                }if (trebZona == 1){
                punts = punts + TREB_ZONA;
                } if (teDisc == 1){
                punts = punts + TE_DISC;
                } if (famNom == 1){
                punts = punts + FAM_NOM;
                } if (famExalumne == 1){
                punts = punts + FAM_EXALUMNE;
                }
                //Mostrem resultat
                System.out.println("El número de registre es: " + numOrdre + " i la seva"
                + " puntuació es: " + punts);
            }
                    
        }
    }

}


