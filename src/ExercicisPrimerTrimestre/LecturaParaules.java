import java.util.Scanner;
//Llegeix un cert nombre de paraules (en aquest cas, 10).
public class LecturaParaules {
    public static final int NUM_PARAULES = 10;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu " + NUM_PARAULES + " paraules separades per "
                + "espais. ");
        System.out.println("Les pots escriure en línies de text diferent, si vols.");
        for (int i = 0; i < NUM_PARAULES; i++) {
            //Es van llegint paraules una per una.
            //Recordar el comportament lecturea de seqüencies de dades pel teclat.
            String paraula = lector.next();
            System.out.println("Paraula " + i + ": Has escrit \"" + paraula + "\".");
            //Es llegeix la resta de la línia i s'ignora el contingut
            lector.nextLine();
        }
    }
}
