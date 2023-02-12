import java.util.Scanner;
//Un programa que emula una màquina dispensadora de chiclets. Desconta el nombre
//de caixes introduïdes per l'usuari, t'avisa de quant la màquina es queda sense
//caixes, et diu el nombre de caixes que queden i si introdueïx més caixes de les
//que hi ha, li dona les caixes que queden en stoc.
public class ControlEstoc {
    public static int ESTOC_INICIAL = 10;
    public static int ESTOC_MINIM = 5;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int caixes = 0;
        int acumula = 0;
        String missatge = "";
        boolean fi = false;
        
        do {
            System.out.println("Cuantes caixes de chiclets vols: 1, 2 o 5?");
            caixes = lector.nextInt();
            
            if (acumula < 10){
                if (caixes > ESTOC_INICIAL) {
                    System.out.println("No hi ha prou chiclets. Et serveixo " + ESTOC_INICIAL);
                    fi = true;
                    lector.nextLine();
                } else {
                    switch (caixes) {
                        case 1: missatge = "aquì tens 1 caixa";
                            ESTOC_INICIAL = ESTOC_INICIAL - caixes;
                            acumula = acumula + caixes;
                            break;
                        case 2: missatge = "aquí tens 2 caixes";
                            ESTOC_INICIAL = ESTOC_INICIAL - caixes;
                            acumula = acumula + caixes;
                            break;
                        case 5: missatge = "aquí tens 5 caixes";
                            ESTOC_INICIAL = ESTOC_INICIAL - caixes;
                            acumula = acumula + caixes;
                            break;
                        default:
                            System.out.print("El nombre de caixes no es correcte: ");
                    }
                    
                    System.out.println(missatge);
                    System.out.println("Queden " + ESTOC_INICIAL + " caixes");
           
                    if (acumula >= ESTOC_MINIM && ESTOC_INICIAL != 0) {
                    System.out.println("Estoc baix, avisar al reposador.");
                    }
                }
            } else {
                lector.next();
            }
        } while (ESTOC_INICIAL != 0 && !fi);
        
        System.out.println("NO HI HA MÉS CHICLETS!!");
    }
}
