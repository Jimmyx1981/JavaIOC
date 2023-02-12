package ExercicisSegonTrimestre;
// Modifiqueu el valor d'un paràmetre String. Afecta a la variable original?

public class ModificarParametreString {

    public static void main(String[] args) {
        ModificarParametreString programa = new ModificarParametreString();
        programa.inici();
    }

    public void inici() {
        String paraula = "Hola";
        System.out.println("Abans de cridar al mètode \"paraula\" val " + paraula);
        modificarParametreString(paraula);
        System.out.println("Després de cridar al mètode \"paraula\" val " + paraula);
    }

    public void modificarParametreString(String paraula) {
        paraula = "Adeu";
        System.out.println("Hem modificat el valor a " + paraula);
    }
}
