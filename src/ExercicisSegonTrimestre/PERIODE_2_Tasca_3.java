package ExercicisSegonTrimestre;
import java.util.Scanner;

public class PERIODE_2_Tasca_3 {

    int diesQueTeElMesDemanat = 0;

    public static void main(String[] args) {
        //Es crea una instància del programa
        PERIODE_2_Tasca_3 programa = new PERIODE_2_Tasca_3();
        //Es crida el mètode inici per tal de començar l'execució
        programa.inici();
    }

    public void inici() {

        //crida a la funció demanarMesInicial
        int mesDemanatInicial = demanarMesInicial();
        //crida a la funció demanarMesFinal
        int mesDemanatFinal = demanarMesFinal();
        //crida a la funció calcularDiesQueTeElMes
        calcularDies(mesDemanatInicial, mesDemanatFinal);

    }

    public void calcularDies(int inici, int fin) {
        if (inici < fin){
            for (int i = inici; i <= fin; i++ ){
                diesQueTeElMesDemanat += calcularDiesQueTeElMes(inici);
                inici++;
            }
            //crida a la funció mostrarDiesDelMes.
            mostrarDiesDelMes(inici, diesQueTeElMesDemanat, fin);
        } else {
            System.out.println("El mes inicial ha de ser major que el final");
        }
    }

    public int demanarMesInicial() {
        int resposta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el número del més inicial:");
        resposta = scanner.nextInt();
        return resposta;
    }

    public int demanarMesFinal() {
        int resposta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el número del més final:");
        resposta = scanner.nextInt();
        return resposta;
    }

    public int calcularDiesQueTeElMes(int mesACalcular) {
        int diesTrobats;
        diesTrobats = switch (mesACalcular) {
            case 1,3,5,7,8,10,12-> 31;
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> -1;
        };
        return diesTrobats;
    }

    private void mostrarDiesDelMes(int inici, int total, int fin){

        if(total==-1){
            System.out.print("No existeix el mes " + inici + ". Només hi ha 12 mesos.)");
        }else{
            System.out.print("T'informem que hi ha " + total + " dies entre el mes " + inici + " i el mes "
                    + fin + " \n" );
        }
    }
}
