package ExercicisSegonTrimestre;

public class exercici3 {

    public static void main(String[] args) {
        long valor = 11;
        int i = 0;
        int pot = 4;
        int calc = 1;

        while (i < pot){
            i++;
            calc *= valor;
        }
        System.out.println("Resultat: " + calc);
    }
}
