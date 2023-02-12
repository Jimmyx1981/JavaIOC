package ExercicisSegonTrimestre;

import java.util.Objects;
import java.util.Scanner;

public class Cursa {
    static int NOM = 0;
    static int DORSAL = 1;
    static int EDAT = 2;
    static int CATEGORIA = 3;
    static int TEMPS = 4;
    static int NUM_CAMPS = 5;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cursa programa = new Cursa();
        programa.inici();
    }

    void inici() {
        int numParticipants;
        String[][] dadesCorredors;
        // Redimensió diferida de l'array
        numParticipants = entrarUnEnter("Indica quants corredors participaran a la cursa: ");
        dadesCorredors = new String[numParticipants][NUM_CAMPS];
        demanarDades(dadesCorredors);
        modificarTemps(dadesCorredors);
    }

    void demanarDades(String[][] dadesCorredors) {
        String dorsal;
        for (int i = 0; i < dadesCorredors.length; i++) {
            System.out.println(" Dades del corredor " + (i + 1));
            System.out.println("------------------------");
            System.out.print("Escriviu el nom: ");
            dadesCorredors[i][NOM] = scanner.nextLine();
            System.out.println();
            System.out.println("Escriviu el seu dorsal: ");
            dorsal = scanner.nextLine();
            System.out.println();
            while (cercaDorsal(dorsal, dadesCorredors) < dadesCorredors.length) {
                System.out.print("El dorsal ja existeix. Escriviu-ne un altre: ");
                dorsal = scanner.nextLine();
                System.out.println();
            }
            dadesCorredors[i][DORSAL] = dorsal;
            System.out.print("Escriviu la seva edat: ");
            dadesCorredors[i][EDAT] = scanner.nextLine();
            System.out.println();
            System.out.print("Escriviu la categoria on participa: ");
            dadesCorredors[i][CATEGORIA] = scanner.nextLine();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    int cercaDorsal(String dorsal, String[][] dadesCorredors) {
        boolean sortir = false;
        int pos = 0;
        while (pos < dadesCorredors.length && !sortir) {
            sortir = Objects.equals(dadesCorredors[pos][DORSAL], dorsal);
            if (!sortir) {
                pos++;
            }
        }
        return pos;
    }

    int entrarUnEnter(String missatgeExplicatiu) {
        int ret;
        boolean correcte = false;
        do {
            System.out.print(missatgeExplicatiu);
            correcte = scanner.hasNextInt();
            if (!correcte) {
                //Comprovem si l'usuari escriu un número o text
                scanner.next();
                System.out.println("Cal que entris un valor enter si us plau.");
            }
        } while (!correcte);
        ret = scanner.nextInt();
        scanner.nextLine(); // Buidem el buffer del teclat
        return ret;
    }

    void modificarTemps(String[][] dadesCorredors) {
        boolean sortir = false;
        int pos;
        System.out.println("Entrada dels temps emprat pels corredors");
        System.out.println("----------------------------------------");
        System.out.println();
        while(!sortir) {
            pos = demanarDorsalICercarPosicio(dadesCorredors);
            sortir = pos == -1;
            if (!sortir) {
                System.out.println("Indiqueu el temps emprat (hh:mm:ss) i premeu [ENTRAR]: ");
                dadesCorredors[pos][TEMPS] = scanner.nextLine();
            }
        }
    }
    int demanarDorsalICercarPosicio(String[][] dadesCorredors) {
        int pos = -1;
        boolean ok = false;
        String dorsal;
        do {
            System.out.println("Escriviu el dorsal del corredor i premeu"
            + " [ENTRAR]. Cadena buida per acabar: ");
            dorsal = scanner.nextLine();
            if (dorsal.isEmpty()) {
                ok = true;
                pos = -1;
            } else {
                pos = cercaDorsal(dorsal, dadesCorredors);
                ok = pos < dadesCorredors.length;
            }
            if (!ok) {
                System.out.println("El dorsal no existeix.");
            }
        } while (!ok);
        return pos;
    }
}




