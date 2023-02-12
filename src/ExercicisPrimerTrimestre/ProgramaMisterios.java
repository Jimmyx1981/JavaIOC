public class ProgramaMisterios {
    
    public static final int VALOR = 35;
    
    public static void main(String[] args) {
       int n = 0;
       for (int i = 1; i < VALOR; i++){
           if(i%10 == 0){
               n++;
           }
       }
        System.out.println("El resultat és " + n + ".");
    }
    
}
