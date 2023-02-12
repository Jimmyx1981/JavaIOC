package ExercicisSegonTrimestre;

public class FuncionsIArrays4 {
    public static void main(String[] args) {
        FuncionsIArrays4 prg = new FuncionsIArrays4();
        prg.inici();
    }

    void inici() {
        /* Per investigar què passa si fem canvis a tot un array passat
        per paràmetre.
         */
        int[] varArray = new int[8];

        for (int i = 0; i < varArray.length; i++) {
            varArray[i] = i * 2;
        }

        System.out.print("Abans de cridar a la funció ");
        System.out.print("canviarValorElementsParametreArray(varArray) ");
        System.out.print("la variable varArray val: ");
        printIntArray(varArray);

        canviarValorElementsParametreArray(varArray);

        System.out.print("Després de cridar a la funció ");
        System.out.print("canviarValorElementsParametreArray(varArray) ");
        System.out.print("la variable varArray val: ");
        printIntArray(varArray);
    }

    void canviarValorElementsParametreArray(int[] param) {
        int [] valorACanviar = new int[8];
        for (int i = 0; i < valorACanviar.length; i++) {
            valorACanviar[i] = i * 3;
        }
        System.out.print("Dins la funció canviarValorElementsParametreArray(param), ");
        System.out.print("abans del canvi [param[i]={0, 3, 9, ...}] el paràmetre val: ");
        printIntArray(param);
        param = valorACanviar;
        System.out.print("Dins la funció canviarValorElementsParametreArray(param), ");
        System.out.print("abans del canvi [param[i]={0, 3, 9, ...}] el paràmetre val: ");
        printIntArray(param);
    }

    void printIntArray(int[] valors) {
        // Funció per veure els valors de l'array en format {x1, x2, ..., Xn}.
        int limitFor = valors.length - 1;
        System.out.print("{ ");
        for (int i = 0; i < limitFor; i++) {
            System.out.print(valors[i]);
            System.out.print(", ");
        }
        if(limitFor >= 0) {
            System.out.print(valors[limitFor]);
        }
        System.out.println(" }");
    }
}
