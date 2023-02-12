import java.util.Scanner;
import javax.swing.*;
//Un programa que evalua la edat de l'usuari i si porta bambes per poder entrar
//en una discoteca.
public class PorterDisco {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edat = 0;
        String bambes = "si";
        String resposta = "";
        
        //System.out.println("Quina edat tens?");
        edat = Integer.parseInt(JOptionPane.showInputDialog("Quina edat tens?"));
                
        if (edat >= 18) {
            System.out.println("Ets major d'edat");
            resposta = JOptionPane.showInputDialog("Portes bambes?");
            //resposta = lector.next();
            if (bambes.equalsIgnoreCase(resposta)) {
                System.out.println("Amb bambes no es pot entrar, si et canvies pots entrar.");
            } else {
                System.out.println("Pots entrar.");
            }
        } else {
            System.out.println("Ets menor de edat, no pots entrar.");
        }
    }
}
