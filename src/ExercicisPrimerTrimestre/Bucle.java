package ExercicisPrimerTrimestre;

public class Bucle {
    public static final int MAX_VALOR = 10;

    public static void main(String[] args) {

        int valorIni1 = 3, valorIni2 = 8;
        int producte1, producte2;
        int numColumnes = 3;

        for(int i=0;i<MAX_VALOR;i++){
            producte1 = valorIni1*i;
            System.out.println(producte1);
        }
        
         for (int j = valorIni1; j < valorIni1+numColumnes; j++) {
            valorIni1 = j;
            producte1 = valorIni1*j;
            
            System.out.println(producte1);
         }

        //producte2= valorIni2*i;

        //System.out.println(valorIni2+" x "+ i+" = "+ producte2+"\t" );

        
    
    }   
    
}
