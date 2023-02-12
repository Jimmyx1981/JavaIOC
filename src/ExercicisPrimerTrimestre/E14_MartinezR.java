public class E14_MartinezR {
    //Declarem les constants.
    public static final int NUM_CAMPS = 4;
    public static final int HOME = 0;
    public static final int DONA = 1;
    
    public static void main(String[] args) {
        //Declarem les variables.
        int minTempsHome = 0;
        int minTempsDona = 0;
        int posGuanyador = 0, posGuanyadora = 0;
        //Iniciem l'array.
        int [][] corredors = {
            { 3457, 1, 51, 52 },
            { 3467, 1, 32, 41 },
            { 3568, 0, 14, 57 },
            { 3570, 0, 12, 63 },
            { 3571, 1, 45, 63 },
            { 3572, 0, 17, 46 },
            { 3573, 0, 12, 44 },
            { 3574, 0, 30, 42 },
            { 3575, 1, 24, 77 },
            { 3576, 0, 57, 48 }
        };
        //Amb aquest bucle es recorre l'array i es mostra el contingut.
        for (int i = 0; i < corredors.length; i++) {
            System.out.println("DORSAL     SEXE     EDAT     MINUTS");
            for (int j = 0; j < 4; j++) {
                System.out.print(corredors[i][j] + "        ");
            }
            System.out.println("....");
            
            }
        //Amb aquest bucle es recorreix l'array i es mira si compleix la condició
        //de l'home.
        for (int i = 0; i < corredors.length; i++) {
            if(corredors[i][1] == HOME) {
                if(minTempsHome == 0) {
                    minTempsHome = corredors[i][3];
                    posGuanyador = i;
                } else {
                    if(corredors[i][3] < minTempsHome) {
                        minTempsHome = corredors[i][3];
                        posGuanyador = i;
                    }
                } 
            }
        }
        //Amb aquest bucle es recorreix l'array i es mira si compleix la condició
        //de la dona.
        for (int i = 0; i < corredors.length; i++) {
            if(corredors[i][1] == DONA) { //Si el valor de [i][1] es 1 es compleix la condició.
                if(minTempsDona == 0) { //El primer cop que s'evalua compleix la condició.
                    minTempsDona = corredors[i][3];//Es guarda el valor en la variable.
                    posGuanyadora = i; //'i' es la posició guanyadora.
                } else {
                    if(corredors[i][3] < minTempsDona) {//Amb cada recorregut del bucle es mira si es compleix la condició.
                        minTempsDona = corredors[i][3];//Es guarda el valor en la variable.
                        posGuanyadora = i;//'i' es la posicició guanyadora.
                    }
                }
            }
        }
        //Finalment es mostra per pantalla els resultats. 
        System.out.println("\nGuanyador : " + corredors[posGuanyador][0] + " " + corredors[posGuanyador][1] +
                " " + corredors[posGuanyador][2] + " " + corredors[posGuanyador][3]);            
        
        System.out.println("Guanyadora: " + corredors[posGuanyadora][0] + " " + corredors[posGuanyadora][1] +
                " " + corredors[posGuanyadora][2] + " " + corredors[posGuanyadora][3]); 
    }    
}
