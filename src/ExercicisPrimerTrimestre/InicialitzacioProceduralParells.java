//Un programa que inicialitza proceduralment un array amb els primers 100 nombres
//parells
public class InicialitzacioProceduralParells {
    public static void main(String[] args) {
    //Caldrà emmagatzemar 100 nombres.
    int[] arrayValorsParells = new int[100];
    
    
    
    for (int i = 0; i < arrayValorsParells.length; i++) {
        arrayValorsParells[i] = 2*i;
        System.out.println(arrayValorsParells[i]);
    }
        /*System.out.print("S'ha generat l'array: [ ");
        for (int i = 0; i < arrayValorsParells.length; i++){
            System.out.print(arrayValorsParells[i] + " ");
        }*/
        
    }
    
}
