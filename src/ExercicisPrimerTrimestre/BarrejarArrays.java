package ExercicisPrimerTrimestre;

//Un programa que partir de dos arrays, generi un tercer.
public class BarrejarArrays {
    public static void main(String[] args) {
       
        int[] arrayA = {1, 4, 7, 10, 13, 16};
        int[] arrayB = {2, 5, 8, 11, 14, 17};
        int[] arrayC = {3, 6, 9, 12, 15, 18};
        int[] nouArray = new int[arrayA.length + arrayB.length + arrayC.length];
        
        //Omple la part de A.
        int indexNou = 0;
        for(int i = 0; i < arrayA.length; i++) {
            nouArray[indexNou] = arrayA[i];
            indexNou = indexNou + 3;
        }
        //Omple la part de B.
        indexNou = 1;
        for(int i = 0; i < arrayB.length; i++) {
            nouArray[indexNou] = arrayB[i];
            indexNou = indexNou + 3;
        }
        //Omple la part de C.
        indexNou = 2;
        for(int i = 0; i < arrayC.length; i++) {
            nouArray[indexNou] = arrayC[i];
            indexNou = indexNou + 3;
        }
            for(int i = 0; i < nouArray.length; i++) {
                System.out.print(nouArray[i] + ", ");
        }
    }
}        
  
        

    

