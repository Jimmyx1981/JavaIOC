//Un programa que mostra un llistat de 100 sencers amb la seva equivalencia en
//codi ASCII.
public class mostraChars {
    public static void main(String[] args) {
        int columnes = 5;
        String[] chars = {"NULL", "SOH", "STX", "ETX", "EOT", "ENQ", "ACK", "BEL", "BS","HT"};
        
        for (int i = 0; i < columnes; i++) {
            System.out.println();
            for ( int j = 0; j < 1; j++) {
                System.out.print(i + " - " + chars[i] + " ");
            }
        }
    }
}
