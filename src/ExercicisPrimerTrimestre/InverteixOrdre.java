//Mostra les xifres d'un nombre real en ordre invers.
public class InverteixOrdre {
    public static void main(String[] args) {
        float numero = 3.1415926535f;
        //El convertim en una cadena de text.
        String numeroText = String.valueOf(numero);
        //Recorrem els seus digits un per un, começant pel final.
        for (int i = numeroText.length() -1; i >= 0; i--) {
            //Imprimim cada dígit indivual (inclòs el punt decimal).
            System.out.print(numeroText.charAt(i));
        }
    }
}
