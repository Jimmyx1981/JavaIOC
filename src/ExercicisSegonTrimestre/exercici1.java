package ExercicisSegonTrimestre;

public class exercici1 {

    public static void main(String[] args) {
        long valor = 900000000;
        int i = 0;
        int div = 11;

        while (i < 5){
            i++;
            div -= i;
            valor = valor / div;
        }
        System.out.println("Valor: " + valor);
    }
}
