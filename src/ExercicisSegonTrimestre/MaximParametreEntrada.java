package ExercicisSegonTrimestre;

public class MaximParametreEntrada {

    public static void main(String[] args) {
        MaximParametreEntrada programa = new MaximParametreEntrada();
        programa.inici();
    }

    public void inici() {
        mostrarMaxim(4, 10);
        mostrarMaxim(0, -3);
        mostrarMaxim(5, 5);
    }

    // Té dos paràmetres d'entrada, de tipus enter
    // El seu valor inicial depèn dels valors assignats a cada invocació
    public void mostrarMaxim(int a, int b) {
        System.out.print("El màxim entre " + a + " i " + b + " és...");
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("són iguals!");
        }
    }
}

