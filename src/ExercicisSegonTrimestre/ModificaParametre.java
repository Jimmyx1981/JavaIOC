package ExercicisSegonTrimestre;
// Modifiqueu el valor d'un par�metre. Afecta a la variable original?

public class ModificaParametre {

    public static void main(String[] args) {
        ModificaParametre programa = new ModificaParametre();
        programa.inici();
    }

    public void inici() {
        int i = 10;
        System.out.println("Abans de cridar el m�tode \"i\" val " + i);
        modificarParametre(i);
        System.out.println("Despr�s de cridar el m�tode \"i\" val " + i);
    }
    // T� un �nic par�metre d'entrada de tipus enter
    public void modificarParametre(int a) {
        // Ara hi ha una variable "a" declarada.
        // El seu valor dep�n de comp s'ha invocat el m�tode.
        a = 0;
        System.out.println("Heu modificat el valor a " + a);
    }
}
