public class Urgencies {
    public static void main(String[] args) {
        int preuBase = 50;
        int total = 0;
        int descompte = 0;
        boolean desplaçament = true;
        boolean assegurança = true;
        boolean fugaAigua = true;
        boolean perduaClaus = false;
        boolean pany = false;
        boolean alarma = false;
        boolean urgencia = true;
        
        if (urgencia) {
            total = total + preuBase;
            if (assegurança) {
                total = total + 0;
            } else {
                total = total + 100;
            }
            
            if (fugaAigua) {
                descompte =  (total * 10) / 100;
                total = total - descompte;
            }
            if (perduaClaus) {
                descompte = (total * 15) / 100;
                total = total - descompte;
            }
            if ((pany)||(alarma)) {
                total = total + 300;
            }
            System.out.println("El preu final es de: " + total);
        }
    }
}
