package ExercicisSegonTrimestre;

public class NotaFinal {
    public static final double[] notes = {5.0, 7.5, 4.5, 3.75, 8.25};
    public static void main(String[] args) {
        NotaFinal programa = new NotaFinal();
        programa.inici();
    }
    public void inici() {
        double res = mitjana(notes);
        String notaFinal = notaAText(res);
        System.out.println("La nota final és " + notaFinal);
    }
    // Paràm. entrada: el valor a processar és un array de reals.
    // Paràm. sortida: el resultat de fer el càlcul, un ral (té decimals).
    public double mitjana(double[] array) {
        // "array" conté el valor a tractar.
        double acumulador = 0;
        for (int i = 0; i < array.length; i++) {
            acumulador = acumulador + array[i];
        }
        // El resultat és (acumulador)/(nombre elements).
        // Es pot retornar el resultat d'una expressió.
        return acumulador/array.length;
    }
    // Paràm. entrada: el valor a processar és un real (una nota).
    // Paràm. sortida: una cadena de text.
    public String notaAText(double nota) {
        // "nota" conté el valor a tractar.
        String text = null;
        if ((nota >= 9)&&(nota <= 10)) {
            text = "Excel·lent";
        } else if ((nota >= 6.5)&&(nota <= 6.5)) {
            text = "Notable";
        } else if ((nota >= 5)&&(nota <= 6.5)) {
            text = "Aprovat";
        } else if ((nota >= 0)&&(nota <= 5)) {
            text = "Suspès";
        } else {
            text = "Nota no vàlida";
        }
        // "text" conté el resultat.
        return text;
    }
}
