package ExercicisSegonTrimestre;

public class FuncionsIArrays3 {
    public static void main(String[] args) {
        FuncionsIArrays3 prg = new FuncionsIArrays3();
        prg.inici();
    }
    void inici() {
        /* Per investigar què passa si fem canvis als elements d'un paràmetre
        de tipus Array.
         */
        int[] varArray = new int[8];
        for (int i = 0; i < varArray.length; i++) {
            varArray[i] = i * 2;
        }

        System.out.print("Abans de cridar a la funció ");
        System.out.print("canviarValorElementsParametreArray(varArray) ");
        System.out.print("la variable varArray val: ");
        printIntArray(varArray);

        canviarValorElementsParametreArray(varArray[3]);

        System.out.print("Després de cridar a la funció ");
        System.out.print("canviarValorElementsParametreArray(varArray) ");
        System.out.print("la variable varArray val: ");
        printIntArray(varArray);
    }

    void canviarValorElementsParametreArray(int param) {
        int valorACanviar = 0;
        System.out.print("Dins la funció canviarValorElementsParametreArray(param), ");
        System.out.print("abans del canvi [param[i]=0] el paràmetre val: ");
        System.out.println(param);
        param = valorACanviar;
        System.out.print("Dins la funció canviarValorElementsParametreArray(param), ");
        System.out.print("abans del canvi [param[i]=0] el paràmetre val: ");
        System.out.println(param);
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
