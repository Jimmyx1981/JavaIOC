package ExercicisSegonTrimestre;

public class FuncioCalcularMaximArray {
    public static void main(String[] args) {
        double[] valors = {1.3, -2.1, 0, 12.0, 4.7};
        double res = maxim(valors);
        System.out.println(res);
    }
    /* Paràm entrada: el valor a processar és un array
    Paràm sortida: el màxim entre tots, un real
     */
    public static double maxim(double[] array) {
        // "array" conté el valor a tractar
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        // "max" conté el resultat
        return max;
    }
}
