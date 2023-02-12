package ExercicisPrimerTrimestre;

import java.util.Scanner;
public class ArrayMes {
    public static int MAX = 7;
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dies = 0;
        int[][] setmana = {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, 0, 0, 0, 0} 
                };
        
        System.out.println("Introdueix el nombre de dies del mes: ");
        dies = lector.nextInt();
        
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print(setmana[i][j] + " ");
            }
            
        }
    }
}

