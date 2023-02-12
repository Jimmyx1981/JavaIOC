import java.util.Scanner;
//Un programa que et diu a la etapa de la vida que et trobes.
public class ClassificaEdat {
    public static final String NADO = "NADÓ";
    public static final String NEN = "NEN";
    public static final String PRE_ADOLESCENT = "PRE_ADOLESCENT";
    public static final String ADOLESCENT = "ADOLESCENT";
    public static final String JOVE = "JOVE";
    public static final String ADULT = "ADULT";
    public static final String ANCIA = "ANCIÀ";
    public static final int MAX = 150;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edat = 0;
        boolean sencer = false;
        int etapa = 0;
        
        System.out.println("Quina edat tens?");
        sencer = lector.hasNextInt();
        
        if (sencer){
            edat = lector.nextInt();
            if (edat < MAX) {
                
                if ( edat >= 0 && edat < 2) {
                    etapa = 1;
                }
                
                if ( edat >= 2 && edat < 10) {
                    etapa = 2;
                }
                
                if ( edat >= 10 && edat < 12) {
                    etapa = 3;
                }
                
                if ( edat >= 12 && edat < 18) {
                    etapa = 4;
                }
                
                if ( edat >= 18 && edat < 30) {
                    etapa = 5;
                }
                
                if ( edat >= 30 && edat < 70) {
                    etapa = 6;
                }
                
                if ( edat >= 70 && edat < 150) {
                    etapa = 7;
                }
                
                switch (etapa) {
                    case 1:
                        System.out.println("La teva etapa de edat es: " + NADO);
                        break;
                    case 2: 
                        System.out.println("La teva etapa de edat es: " + NEN);
                        break;
                    case 3:
                        System.out.println("La teva etapa de edat es: " + PRE_ADOLESCENT);
                        break;
                    case 4:
                        System.out.println("La teva etapa de edat es: " + ADOLESCENT);
                        break;
                    case 5:
                        System.out.println("La teva etapa de edat es: " + JOVE);
                        break;
                    case 6:
                        System.out.println("La teva etapa de edat es: " + ADULT);
                        break;
                    case 7:
                        System.out.println("La teva etapa de edat es: " + ANCIA);
                }
            } else {
                System.out.println("Ets una momia");
            }
        } else {
            System.out.println("La edad no es valida");
        }
    }
}
