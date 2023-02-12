import java.util.Scanner;
public class GestionaNotes {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String[] noms = {"Juan P.", "Pedro S.", "Pere R.", "Marta S.", "Andres P.", "Jaume M.",
                        "Silvana C.", "Andrés C.", "Marta S.", "Cristiano R."};
        float[][] notes = {
                {5.6f, 7f, 9f,},
                {7.8f, 6f, 8.5f,},
                {9f, 7.4f, 0f,},
                {9.3f, 9.1f, 8.7f,},
                {0f, 8.4f, 9f,},
                {6f, 7f, 3.5f,},
                {10f, 7f, 9f, },
                {6f, 9f, 2f,},
                {7f, 7.3f, 3.8f,},
                {10f,  2.3f, 0f,}
        };
        
        System.out.println("NOM          EAC1      EAC2      EAC3");
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(noms[i]);
                System.out.println("       " + notes[i][0] + "      " + notes[i][1] + "      " + notes[i][2] + "     ");
                
            }
        }
    }
}
