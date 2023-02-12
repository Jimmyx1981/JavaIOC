/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jmart
 */
public class IntercanviValors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numA = 2;
        int numB = 67;
        
        System.out.println("El valor de la variable numA es: " + numA + " , el "
                + "valor de la variable numB es: " + numB);
        
        numA = numA + numB;
        numB = numA - numB;
        numA = numA - numB;
        
        
        System.out.println("El valor de la variable numA es: " + numA + " , el "
                + "valor de la variable numB es: " + numB);
        
    }
    
}
