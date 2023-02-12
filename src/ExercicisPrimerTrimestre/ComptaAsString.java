public class ComptaAsString {
    public static final String cadena = "Hi havia una vegada...";
    public static void main(String[] args) {
        int comptador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a') {
                comptador++;
            }
        }
        System.out.println("Hi ha " + comptador + " as.");
    }
}
