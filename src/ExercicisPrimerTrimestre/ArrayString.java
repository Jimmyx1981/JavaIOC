package ExercicisPrimerTrimestre;

public class ArrayString {
    public static void main(String[] args) {
        String[] text = {"Hi", "havia", "una", "vegada"};
        System.out.println("El text de l'array és: ");
        for (int i = 0; i < text.length; i++) {
            System.out.println("Posició " + i + ": " + text[i]);
        }
        System.out.println("Les seves mides son: ");
        for (int i = 0; i < text.length; i++) {
            System.out.println("Posició " + i + ": " + text[i].length());
        }
    }
    
}
