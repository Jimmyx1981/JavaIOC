package ExercicisSegonTrimestre;
// Modifiqueu el valor d'un paràmetre. Afecta a la variable original?

public class ModificaParametre {

    public static void main(String[] args) {
        ModificaParametre programa = new ModificaParametre();
        programa.inici();
    }

    public void inici() {
        int i = 10;
        System.out.println("Abans de cridar el mètode \"i\" val " + i);
        modificarParametre(i);
        System.out.println("Després de cridar el mètode \"i\" val " + i);
    }
    // Té un únic paràmetre d'entrada de tipus enter
    public void modificarParametre(int a) {
        // Ara hi ha una variable "a" declarada.
        // El seu valor depèn de comp s'ha invocat el mètode.
        a = 0;
        System.out.println("Heu modificat el valor a " + a);
    }
}
