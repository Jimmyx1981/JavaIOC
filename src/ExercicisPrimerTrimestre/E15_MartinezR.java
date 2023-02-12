import java.util.Scanner; //Importem la classe Scanner.
import java.util.Random; //Importem la classe Random.

public class E15_MartinezR {
    //Declarem les constants.
    public static final int PRIMERS_DIGITS = 4;
    public static final int VALOR_MAX = 10;
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        String passwd = "";//Declarem la variable de tipus String amb valor null.
        String[] dadesUsuari;
        Random aleatori = new Random();//Declarem la variable de tipus Random.
        
        System.out.println("Escriu els teus nom i cognoms:");
        String nom = lector.nextLine();
        dadesUsuari = nom.split(" ");//Tallem el String nom per els espais, el guardem a l'array dadesUsuari.
        
        for (int i = 0; i < PRIMERS_DIGITS/2; i++) { //Fem un bucle que recorri 2 vegades dadesUsuari.
            passwd+= (dadesUsuari[0].charAt(i));//Guardem els resultats a passwd.
            passwd+= (dadesUsuari[1].charAt(i));
        }
        
        for (int i = 0; i < PRIMERS_DIGITS; i++) { //Recorrem un bucle 4 vegades.
            passwd+= aleatori.nextInt(VALOR_MAX); //A cada volta del bucle, es va guardant un numero aleatori entre 0 i 10.
        }
        System.out.println("La contrasenya és: " + passwd); //Finalment imprimim per pantalla el resultat de passwd.
    }
    
}
