package ExercicisPrimerTrimestre;

//Un programa que inicialitza proceduralment un array amb valors relacionats
//entre si.
public class InicialitzacioProcedural {
    public static void main(String[] args) {
        //Caldrà emmagatzemar 20 enters.
        int[] arrayValorsDobles = new int[20];
        //La primera posició la posem directament.
        arrayValorsDobles[0] = 1;
        //La resta es va omplint seqüencialment, a força de càlculs.
        for (int i = 1; i < arrayValorsDobles.length; i++) {
            arrayValorsDobles[i] = 2 * arrayValorsDobles[i-1];
        }
        System.out.println("S'ha generat l'array: [ ");
        for (int i = 0; i < arrayValorsDobles.length; i++) {
            System.out.println(arrayValorsDobles[i] + " ");
        }
        System.out.print("]");
    }
    
}
