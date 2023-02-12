public class PreusProductes{
  public static void main(String[] args) {
    float[] arrayPreus = {25.5f, 10f, 15f, 9.25f, 10.75f, 12f, 5.15f, 6.75f};
    float acumulat = 0;
    float mitjana = 0;
    float canvi = 0;
    for(int i = 0; i < arrayPreus.length; i++) {
      acumulat = acumulat + arrayPreus[i];
    }
    for (int i = 0; i < arrayPreus.length; i++) {
        for (int j = i + 1; j < arrayPreus.length; j++) {
            if (arrayPreus[i] > arrayPreus[j]) {
            canvi = arrayPreus[i];
            arrayPreus[i] = arrayPreus[j];
            arrayPreus[j] = canvi;
            }
        }
    }
      System.out.println("Els productes ordenats son:");
    for (int i = 0; i < arrayPreus.length; i++) {
        System.out.println("Producte " + i + ": " + arrayPreus[i]);
    }
    
      System.out.println("Els productes entre 10 i 25 son:");
    for (int i = 0; i < arrayPreus.length; i++) {
        if (arrayPreus[i] >= 10 && arrayPreus[i] <= 25 ) {
            System.out.println("Producte " + i + ": " + arrayPreus[i]);
        }
    }
    
    mitjana = acumulat / arrayPreus.length;
    System.out.println("La mitjana és " + mitjana);
    
    }
}