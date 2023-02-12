package ExercicisSegonTrimestre;
import java.util.Scanner;
public class RegistreTemperatura {
    // Constants
    private static final int MAX_SETMANES = 52;
    private boolean fi = false;
    // Variables globals
    private int numTemperatures = 0;
    private float[] temperatures = new float[MAX_SETMANES * 7];
    private int dia = 1;
    private int mes = 1;


    // Mètodes associats al problema general
    public static void main(String[] args) {
        RegistreTemperatura programa = new RegistreTemperatura();
        programa.inici();
    }

    public void inici() {
        while (!fi) {
            mostrarMenu();
            tractarOpcio();
        }
    }

    // Mètodes associats al primer nivell de descomposició
    public void mostrarMenu() {
        System.out.println("\nBenvingut al registre de temperatures");
        System.out.println("---------------------------------------");
        System.out.println("[RT] Registrar temperatures setmanals. ");
        System.out.println("[MJ] Consultar temperatura mitjana. ");
        System.out.println("[DF] Consultar diferència màxima. ");
        System.out.println("[FI] Sortir. ");
        System.out.print("Opció: ");
    }

    public void tractarOpcio() {
        Scanner lector = new Scanner(System.in);
        String opcio = lector.nextLine();
        if (opcio.equalsIgnoreCase("RT")) {
            registreTemperaturaSetmanals();
        } else if (opcio.equalsIgnoreCase("MJ")) {
            mostrarMitjana();
        } else if (opcio.equalsIgnoreCase("DF")) {
            mostrarDiferencia();
        } else if (opcio.equalsIgnoreCase("FI")) {
            finalitzarExecucio();
        } else {
            System.out.println("Opció incorrecta!\n");
        }
    }

    // Mètodes associats al segon nivell de descomposició
    public void registreTemperaturaSetmanals() {
        // Cal controlar si hi ha espai per a aquests 7 registres
        if ((numTemperatures + 7) >= temperatures.length) {
            System.out.println("No queda espai per a més temperatures.");
        } else {
            llegirTemperaturesTeclat();
            incrementarData();
        }
    }

    public void mostrarMitjana() {
        if (numTemperatures > 0) {
            System.out.print(" la mitjana ha estat de ");
            calcularMitjana();
            System.out.println(" graus. ");
        } else {
            System.out.println("\nNo hi ha temperatures registrades");
        }
    }

    public void mostrarDiferencia() {
        if (numTemperatures > 0) {
            System.out.print("\nFins avui ");
            mostrarData();
            System.out.print(" la diferencia màxima ha esta de ");
            calculaDiferencia();
            System.out.println(" graus. ");
        } else {
            System.out.println("\nNo hi ha temperatures registrades.");
        }
    }

    public void finalitzarExecucio() {
        fi = true;
    }

    // Mètodes associats al tercer nivell de descomposició etc...

    public void llegirTemperaturesTeclat() {
        System.out.println("Escriu les temperatures d'aquesta setmana: ");
        Scanner lector = new Scanner(System.in);
        int numLlegides = 0;
        while (numLlegides < 7) {
            if (lector.hasNextFloat()) {
                temperatures[numTemperatures] = lector.nextFloat();
                numLlegides++;
                numTemperatures++;
            } else {
                lector.next();
            }
        }
    }

    public void incrementarData() {
        // Quants dies té aquest mes?
        int diesAquestMes = 0;
        if (mes == 2) {
            diesAquestMes = 28;
        } else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
            diesAquestMes = 30;
        } else {
            diesAquestMes = 31;
        }
        dia = dia + 7;
        // Hem passat de mes?
        if (dia > diesAquestMes) {
            dia = dia - diesAquestMes;
            mes++;
            // Hem passat d'any?
            if (mes > 12) {
                mes = 1;
            }
        }
    }

    public void mostrarData() {
        System.out.print(dia + " de ");
        switch (mes) {
            case 1 -> System.out.println("Gener");
            case 2 -> System.out.println("Febrer");
            case 3 -> System.out.println("Març");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maig");
            case 6 -> System.out.println("Juny");
            case 7 -> System.out.println("Juliol");
            case 8 -> System.out.println("Agost");
            case 9 -> System.out.println("Setembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Novembre");
            case 12 -> System.out.println("Desembre");
        }
    }

    public void calcularMitjana() {
        float acumulador = 0;
        for (int i = 0; i < numTemperatures; i++) {
            acumulador = acumulador + temperatures[i];
        }
        System.out.print(acumulador / numTemperatures);
    }

    public void calculaDiferencia() {
        float maxima = temperatures[0];
        float minima = temperatures[0];
        for (int i = 1; i < numTemperatures; i++) {
            if (temperatures[i] < minima) {
                minima = temperatures[i];
            }
            if (temperatures[i] > maxima) {
                maxima = temperatures[i];
            }
            System.out.println(maxima - minima);
        }
    }
}
