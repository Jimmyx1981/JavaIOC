public class MostraCaractersDelReves {
    public static void main(String[] args) {
        String holaMon = "Hola, món!";
        for (int i = holaMon.length() -1 ; i >= 0; i--) {
            System.out.print(holaMon.charAt(i));
        }
    }
}
