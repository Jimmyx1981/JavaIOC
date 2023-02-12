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
    // M�todes associats al problema general.
    // El m�tode main no canvia respecte a la plantilla general.
    public static void main(String[] args) {
        Mastermind prg = new Mastermind();
        prg.inici();
    }
    // Es pot declarar, per� encara no correspon deduir el codi.
    public void inici() {
        String secret = generarParaulaSecreta();
        boolean encertat = false;
        while (!encertat) {
            String resposta = preguntarResposta();
            encertat = resoldreResposta(secret, resposta);
        }
    }
    // M�todes associats al primer nivell de descomposici�
    // Par�metre d'entrada: cap, tot s'obt� de generarLletraAleatory
    // Par�metre de sortida: una paraula de 5 lletres (un String).
    public String generarParaulaSecreta() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < LONG_SECRET; i++) {
            res.append(generarLletraAleatory());
        }
        return res.toString();
    }
    // Par�metre d'entrada: cap, tot s'obt� del teclat
    // Par�metre de sortida: la paraula de resposta (un String)
    public String preguntarResposta() {
        Scanner lector = new Scanner(System.in);
        boolean lecturaOk;
        String res;
        do {
            System.out.print("Escriu " + LONG_SECRET + " lletres min�scules: ");
            res = lector.next();
            lector.nextLine();
            lecturaOk = comprovarResposta(res);
            if (!lecturaOk) {
                System.out.println("Aquesta resposta no �s v�lida!");
            }
        } while (!lecturaOk);
        return res;
    }
    // Par�metre d'entrada: la resposta i el valor secret (dos String)
    // Par�metre de sortida: si s'ha encertat (un boole�)
    public boolean resoldreResposta(String secret, String resposta) {
        String res = generarPista(secret, resposta);
        boolean fi = false;
        System.out.print("La resposta �s [" + res + "].");
        if (res.equals(ENCERTAT)) {
            System.out.println("Has encertat");
            fi = true;
        } else {
            System.out.println("Continua intentant-ho!");
        }
        return fi;
    }
    // M�todes associats al segon nivell de descomposici�
    // Par�metre d'entrada: cap
    // Par�metre de sortida: una lletra (un car�cter)
    public char generarLletraAleatory() {
        long nano = System.nanoTime();
        int index = (int)(nano % abc.length());
        return abc.charAt(index);
    }
    // Par�metre d'entrada: text a comprovar
    // Par�metre de sortida: si �s correcte o no (un boole�. true = correcte)
    public boolean comprovarResposta(String resposta) {
        if (resposta.length() != LONG_SECRET) {
            // Ja sabem que no �s correcte.
            // Podem acabar l'execuci� del m�tode immediatament.
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if ( -1 == abc.indexOf(c)) {
                // Ja sabem que no �s correcte.
                // Podem acabar l'execuci� del m�tode immediatament.
                return false;
            }
        }
        // Si tot es compleix, segur que �s correcte.
        return true;
    }
    // Par�metre d'entrada: la resposta i el secret que cal comparar (text)
    // Par�metre de sortida: la pista que cal mostrar (un text).
    public String generarPista(String s, String r) {
        StringBuilder res = new StringBuilder();
        // Cal comparar cada car�cter de la soluci� i la resposta
        for (int i = 0; i < s.length(); i++) {
            // Obtenir els dos car�cters a comparar
            char charSecret = s.charAt(i);
            char charResposta = r.charAt(i);
            if (charSecret == charResposta) {
                res.append(TOT_CORRECTE);
            } else if (s.indexOf(charResposta) != -1) {
                // indexOf cerca si un car�cter concret existeix en un String
                res.append(MALA_POS);
            } else {
                res.append(INCORRECTE);
            }
        }
        return res.toString();
    }
}
