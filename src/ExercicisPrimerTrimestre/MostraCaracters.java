//Mostra els caràcters individuals en una cadena de text.
public class MostraCaracters {
    public static void main(String[] args) {
        String holaMon = "Hola, món!";
        //Es recorren les posicions de la cadena de text una per una.
        for (int i = 0; i < holaMon.length(); i++) {
            System.out.println(holaMon.charAt(i));
        }
    }
    
}
