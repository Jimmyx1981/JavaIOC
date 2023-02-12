//Un programa que crea una còpia idèntica, i independent, d'un altre array.
public class Copia {
    public static void main(String[] args) {
        float[] llistaNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f,
            7f};
        //La còpia ha de tenir la mateixa mida que l'original.
        float[] copiaLlistaNotes = new float[llistaNotes.length];
        //Anem copiant la posició per posició.
        for (int i = 0; i < llistaNotes.length; i++) {
            copiaLlistaNotes[i] = llistaNotes[i];
        }
        //Mostrem la còpia per pantalla.
        System.out.print("L'array copia és: [");
        for (int i = 0; i < llistaNotes.length; i++) {
            System.out.print(copiaLlistaNotes[i] + ", ");
        }
        System.out.print("]");
    }
    
}
