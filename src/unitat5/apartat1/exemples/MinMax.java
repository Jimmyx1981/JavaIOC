package unitat5.apartat1.exemples;

public class MinMax {

    public static void main(String[] args) {
        MinMax programa = new MinMax();
        programa.inici();
    }

    public void inici(){
        double resReal = Math.max(1.2, 4.5);
        System.out.println("El valor m�xim �s " + resReal);
        int resEnter = Math.min(-8, 20);
        System.out.println("El valor m�nim �s " + resEnter);
    }
}
