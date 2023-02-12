package ExercicisSegonTrimestre;

public class AccesElementsArraysBidi {

    public static void main(String[] args) {
        String[][] cadenas = {{"aa", "bb", "bb", "cc", "dd"}, {"aaa", "bbb", "bbb", "ccc", "ddd"}};
        String[] substitut = {"aaaa", "bbbb", "cccc", "dddd", "dddd"};
        String[] aux = cadenas[0];

        for (int i = 0; i < cadenas.length; i++) {
            for (int j = 0; j < cadenas[0].length; j++) {
                System.out.println("1. V[" + i + "][" + j + "]:" + cadenas[i][j]);
            }
        }

        cadenas[0] = cadenas[1];
        cadenas[1] = aux;
        for (int i = 0; i < cadenas.length; i++) {
            for (int j = 0; j < cadenas[0].length; j++) {
                System.out.println("2. V[" + i + "][" + j + "]:" + cadenas[i][j]);
            }
        }

        cadenas[1] = substitut;
        for (int i = 0; i < cadenas.length; i++) {
            for (int j = 0; j < cadenas[0].length; j++) {
                System.out.println("3. V[" + i + "][" + j + "]:" + cadenas[i][j]);
            }
        }
    }
}