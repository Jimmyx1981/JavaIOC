package ExercicisSegonTrimestre;

public class FuncioCalcularMinim {
    public static void main(String[] args) {
        int res = minim(3,6,10,15);
        System.out.println(res);
    }
    /* Par�m entrada: els valors a tractar s�n quatre enters
        Par�m. sortida: el m�nim entre els dos, un enter.
         */
    public static int minim(int a, int b, int c, int d) {
        // a, b, c, i d contenen els valors a tractar.
        int min1 = b;
        int min2 = d;
        int min = 0;
        if (a < b) {
            min1 = a;
        }
        if (c < d) {
            min2 = c;
        }
        if (min1 < min2) {
            min = min1;
        } else {
            min = min2;
        }
        return min;
    }

}
