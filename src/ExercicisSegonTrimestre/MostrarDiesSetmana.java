package ExercicisSegonTrimestre;

public class MostrarDiesSetmana {

    public static void main(String[] args) {
        MostrarDiesSetmana programa = new MostrarDiesSetmana();
        programa.inici();

    }

    public void inici() {
        mostrarDiesDeLaSetmana();
        dibuixTriangle();
    }

    public void mostrarDiesDeLaSetmana() {

        String diesSetmana[] = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge"};

        for (int i = 0; i < diesSetmana.length; i++) {

            System.out.println(diesSetmana[i]);
        }
    }

    public void dibuixTriangle() {
        int numFilas = 10;

        for(int altura = 1; altura<=numFilas; altura++){
            for(int asteriscos = 0; asteriscos<altura; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
