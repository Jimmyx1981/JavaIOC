/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author jmart
 */
public class E3_MartinezR {

    /**
     * @param args the command line arguments
     */
    public static final float llarg = 300.3f;
    public static void main(String[] args) {
        //Declarem les variables
        float ample1, ample2, prof1, prof2, ampleNou, aux;
        int area1, area2, volum1, volum2, areaNou, volumNou;
        
        //S'inicialitza la clase Scanner
        Scanner lector = new Scanner(System.in);
        
        //Demanem al usuari el llargs i les profunditats, recollim els valors
        System.out.println("Introdueix l'ample de la piscina 1: ");
        ample1 = lector.nextFloat();
        System.out.println("Introdueix la profunditat de la piscina 1: ");
        prof1 = lector.nextFloat();
        //System.out.println("-----------TR. Profunditat1 valor entrat: "+prof1);
        
        System.out.println("Introdueix l'ample de la piscina 2: ");
        ample2 = lector.nextFloat();
        System.out.println("Introdueix la profunditat de la piscina 2: ");
        prof2 = lector.nextFloat();
        //System.out.println("-----------TR. Profunditat2 valor entrat: "+prof2);
        
        //Calculem les arees
        area1 = (int)(llarg * ample1);
        area2 = (int)(llarg * ample2);
        
        //Calculem els volums
        volum1 = (int)(area1 * prof1);
        volum2 = (int)(area2 * prof2);
        
        //Mostrem arees i volums
        System.out.println("El llarg de la piscina 1 es: " + llarg + ", l'ample es: "
        + ample1 + " i l'àrea es: " + area1);
        System.out.println("El llarg de la piscina 2 es: " + llarg + ", l'ample es: "
        + ample2 + " i l'àrea es: " + area2);
        
        //Calculem el llarg de les piscines una al costat de l'altre
        ampleNou = ample1+ample2;
        
        //Calculem l'àrea que ocupen les dues plegades
        areaNou = (int)(llarg * ampleNou);
        volumNou = volum1 + volum2;
        System.out.println("El llarg de les dues piscines juntes es: " + llarg +
                ", l'ample de les dues piscines juntes es: " + ampleNou + ",\n l'àrea"
                + " de les dues piscines juntes es: " + areaNou + " i el volum"
                + " de les dues piscines juntes es: " + volumNou);
        
        //Intercanciem els valors de les piscines
        aux = prof1;
        prof1 = prof2;
        prof2 = aux;
        
        //Calculem amb els nous valors
        volum1 = (int)(area1 * prof1);
        System.out.println("El volum de la piscina 1 desprès de l'intercanvi es: "
                + volum1 + " , el llarg es: " + llarg + " l'ample es: " + ample1 + 
                " i la profunditat es: " + prof1);
        
        volum2 = (int)(area2 * prof2);
        System.out.println("El volum de la piscina 2 desprès de l'intercanvi es: "
                + volum2 + " , el llarg es: " + llarg + " l'ample es: " + ample2 + 
                " i la profunditat es: " + prof2);
        
    }
    
}
