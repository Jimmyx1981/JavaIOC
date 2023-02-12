// Exercici número 2
public class E2_MartinezR {

  
    public static void main(String[] args) {
        // Estic creant les variables de les piscines
        int llarg1, ample1, profunditat1, llarg2, ample2, profunditat2;
        
        // Li dono els valors a cada variable
        llarg1 = 300;
        ample1 = 150;
        profunditat1 = 20;
        
        llarg2 = 300;
        ample2 = 80;
        profunditat2 = 35;
        
        // Faig les operacions per saber l'àrea i el volum
        int area1 = llarg1 * ample1;
        int area2 = llarg2 * ample2;
        
        int volum1 = area1 * profunditat1;
        int volum2 = area2 * profunditat2;
        
        // Imprimeixo per pantalla els valors resultants
        System.out.println("L'àrea de la piscina1 es: " + area1 + 
                " i l'àrea de la piscina2 es: " + area2 + 
                ". El volum de la piscina1 es: " + volum1 + 
                " i el volum de la piscina 2 es: " + volum2);
        
        // Creo unes noves variables amb les sumes de l'ample
        int ampleSumaPiscines = ample1 + ample2;
        int llargSumaPiscines = llarg1;
        
        // Calculo l'àrea i el volum amb les noves dades
        int areaSumaPiscines = ampleSumaPiscines * llargSumaPiscines;
        int volumSumaPiscines = areaSumaPiscines * (profunditat1 + profunditat2);
        
        // Imprimeixo per pantalla l'àrea i el volum de les piscines juntes
        System.out.println("L'àrea de les dues piscines juntes es: " + 
                areaSumaPiscines + " i el volum de les dues piscines juntes es: "
                + volumSumaPiscines);
        
        // Intercanvio els valors de les variables profunditat
        profunditat1 = profunditat1 + profunditat2;
        profunditat2 = profunditat1 - profunditat2;
        profunditat1 = profunditat1 - profunditat2;
        
        // Torno a fer l'àrea amb les noves dades de les piscines intercanviades
        int volumIntercanviat1 = area1 * profunditat1;
        int volumIntercanviat2 = area2 * profunditat2;
        
        // Finalment, imprimeixo per pantalla els valors resultants
        System.out.println("El volum de les piscina1 amb la profunditat "
                + "intercanviada es: " + volumIntercanviat1 + " i el volum de"
                + "la piscina2 amb la profunditat intercanviada es: " +
                volumIntercanviat2);
        
    }
    
}
