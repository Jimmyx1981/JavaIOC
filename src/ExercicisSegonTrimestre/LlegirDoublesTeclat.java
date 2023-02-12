package ExercicisSegonTrimestre;

import java.util.Scanner;

public class LlegirDoublesTeclat {

    public static void main(String[] args) {
        LlegirDoublesTeclat programa = new LlegirDoublesTeclat();
        programa.inici();
    }

    public void inici() {
        System.out.println("Llegiu un double pel teclat:");
        double a = llegirDoubleTeclat();
        System.out.println("El double ha estat " + a + ".");
        System.out.println("Llegiu un altre double pel teclat:");
        a = llegirDoubleTeclat();
        System.out.println("L'altre double ha estat " + a + ".");
    }

    public double llegirDoubleTeclat() {
        // 2. Es fa el codi que llegeix un únic enter del teclat, com s'ha fet sempre
        // No canvia absolutament res...
        Scanner lector = new Scanner(System.in);
        double enterLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextDouble();
            if (llegit) {
                enterLlegit = lector.nextDouble();
            } else {
                System.out.println("Això no és un Double.");
                lector.next();
            }
        }
        lector.nextLine();
        // 3. Un cop fet, quina variable té el resultat? "enterLlegit"
        // 4. Cal fer "return" damunt seu
        return enterLlegit;
    }
}
