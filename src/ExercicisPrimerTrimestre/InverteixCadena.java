public class InverteixCadena {
    public static void main(String[] args) {
        String holaMon = "Hola, món!";
        //Es recorrem les posicions de la cadena de text una per una
        for (int i = holaMon.length() -1; i >= 0; i--) {
            System.out.println(holaMon.charAt(i));
        }
        System.out.println();
    }
}
