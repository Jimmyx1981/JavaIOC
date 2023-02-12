package unitat5.apartat1.exemples;

public class Pitagores {

    public static void main(String[] args) {
        Pitagores programa = new Pitagores();
        programa.inici();
    }

    public void inici(){
        double base = 4.5;
        double altura = 10;
        // S'eleva al quadrat cada costat del triangle
        double sumaQuadrats = Math.pow(base,2) + Math.pow(altura,2);
        double hipotenusa = Math.sqrt(sumaQuadrats);
        System.out.println("El valor de la hipotenusa és " + hipotenusa);
    }
}
