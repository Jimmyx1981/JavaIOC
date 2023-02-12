public class Precedencia {
    public static void main(String[] args) {
        //El text té una mida de 22 caràcters.
        String text = "Hi havia una vegada...";
        //ordre: 1) mètode, 2) multiplicació, 3) resta.
        int dobleMidaMenysUn = 2 * text.length() -1;
        System.out.println(dobleMidaMenysUn);
        
        String holaMon = "Hola, món!";
        char c = holaMon.charAt(3);
        //A la variable "c" hi ha el caràcter 'a'
        System.out.println("A la poscició 3 hi ha el caràcter " + c);
    }
    
}
