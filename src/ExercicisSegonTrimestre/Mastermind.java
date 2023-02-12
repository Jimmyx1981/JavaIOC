package ExercicisSegonTrimestre;
import java.util.Scanner;
// Un programa per jugar a Mastermind.

public class Mastermind {
    // Constants.
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POS = 'X';
    public final static char INCORRECTE = '_';
    public final static String ENCERTAT = "00000";
    public final int LONG_SECRET = 5;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    // Mètodes associats al problema general.
    // El mètode main no canvia respecte a la plantilla general.
    public static void main(String[] args) {
        Mastermind prg = new Mastermind();
        prg.inici();
    }
    // Es pot declarar, però encara no correspon deduir el codi.
    public void inici() {
        String secret = generarParaulaSecreta();
        boolean encertat = false;
        while (!encertat) {
            String resposta = preguntarResposta();
            encertat = resoldreResposta(secret, resposta);
        }
    }
    // Mètodes associats al primer nivell de descomposició
    // Paràmetre d'entrada: cap, tot s'obté de generarLletraAleatory
    // Paràmetre de sortida: una paraula de 5 lletres (un String).
    public String generarParaulaSecreta() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < LONG_SECRET; i++) {
            res.append(generarLletraAleatory());
        }
        return res.toString();
    }
    // Paràmetre d'entrada: cap, tot s'obté del teclat
    // Paràmetre de sortida: la paraula de resposta (un String)
    public String preguntarResposta() {
        Scanner lector = new Scanner(System.in);
        boolean lecturaOk;
        String res;
        do {
            System.out.print("Escriu " + LONG_SECRET + " lletres minúscules: ");
            res = lector.next();
            lector.nextLine();
            lecturaOk = comprovarResposta(res);
            if (!lecturaOk) {
                System.out.println("Aquesta resposta no és vàlida!");
            }
        } while (!lecturaOk);
        return res;
    }
    // Paràmetre d'entrada: la resposta i el valor secret (dos String)
    // Paràmetre de sortida: si s'ha encertat (un booleà)
    public boolean resoldreResposta(String secret, String resposta) {
        String res = generarPista(secret, resposta);
        boolean fi = false;
        System.out.print("La resposta és [" + res + "].");
        if (res.equals(ENCERTAT)) {
            System.out.println("Has encertat");
            fi = true;
        } else {
            System.out.println("Continua intentant-ho!");
        }
        return fi;
    }
    // Mètodes associats al segon nivell de descomposició
    // Paràmetre d'entrada: cap
    // Paràmetre de sortida: una lletra (un caràcter)
    public char generarLletraAleatory() {
        long nano = System.nanoTime();
        int index = (int)(nano % abc.length());
        return abc.charAt(index);
    }
    // Paràmetre d'entrada: text a comprovar
    // Paràmetre de sortida: si és correcte o no (un booleà. true = correcte)
    public boolean comprovarResposta(String resposta) {
        if (resposta.length() != LONG_SECRET) {
            // Ja sabem que no és correcte.
            // Podem acabar l'execució del mètode immediatament.
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if ( -1 == abc.indexOf(c)) {
                // Ja sabem que no és correcte.
                // Podem acabar l'execució del mètode immediatament.
                return false;
            }
        }
        // Si tot es compleix, segur que és correcte.
        return true;
    }
    // Paràmetre d'entrada: la resposta i el secret que cal comparar (text)
    // Paràmetre de sortida: la pista que cal mostrar (un text).
    public String generarPista(String s, String r) {
        StringBuilder res = new StringBuilder();
        // Cal comparar cada caràcter de la solució i la resposta
        for (int i = 0; i < s.length(); i++) {
            // Obtenir els dos caràcters a comparar
            char charSecret = s.charAt(i);
            char charResposta = r.charAt(i);
            if (charSecret == charResposta) {
                res.append(TOT_CORRECTE);
            } else if (s.indexOf(charResposta) != -1) {
                // indexOf cerca si un caràcter concret existeix en un String
                res.append(MALA_POS);
            } else {
                res.append(INCORRECTE);
            }
        }
        return res.toString();
    }
}
