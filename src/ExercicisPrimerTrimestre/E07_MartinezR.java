import java.util.Scanner;
//Un progama que calcula el preu, l'IVA i el cost de l'enviament d'un producte
public class E07_MartinezR {
    //Definim les constants
    public static final int IVA_SUPERREDUIT = 4;
    public static final int IVA_REDUIT = 8;
    public static final int IVA_GENERAL = 21;
    
    public static void main(String[] args) {
        //Definim les variables
        float preuProducte, numeroUnitats, preuSenseIva; 
        int opcio, categoria;
        //Mostrem les opcions al usuari
        System.out.println("Si us plau, seleccioni una opció");
        System.out.println("[1] Calcular preu");
        System.out.println("[2] Mostrar l'IVA");
        System.out.println("[3] Cost de l'enviament");
        //Demanem la opció al usuari
        Scanner lector = new Scanner(System.in);
        opcio = lector.nextInt();
        //Opció 1
        switch(opcio){
            case 1://Demanem el preu, categoria i número d'unitats al usuari
                   //i calculem el preu final del producte
                System.out.println("Has triat Calcular el preu");
                System.out.println("Introdueix el preu del producte");
                preuProducte = lector.nextFloat();
                System.out.println("Introdueix el número d'unitats");
                numeroUnitats = lector.nextFloat();
                System.out.println("Introdueix la categoria");
                System.out.println("[1] Medicaments, [2] Farines, [3[ Medicaments"
                        + " veterinaris, [4] Aigües, [5] Cosmetics, [6] Begudes"
                        + " alcohòliques ");
                categoria = lector.nextInt();
                switch(categoria){ //Switch anidat
                    case 1:
                    case 2:
                        System.out.println("El preu final es " + 
                                ((preuProducte * numeroUnitats) + (((preuProducte * IVA_SUPERREDUIT) / 100) * numeroUnitats)));
                        break;
                    case 3:
                    case 4:
                        System.out.println("El preu final es " + 
                                ((preuProducte * numeroUnitats) + (((preuProducte * IVA_REDUIT) / 100) * numeroUnitats)));
                        break;
                    case 5:
                    case 6:
                        System.out.println("El preu final es " + 
                                ((preuProducte * numeroUnitats) + (((preuProducte * IVA_GENERAL) / 100) * numeroUnitats)));
                        break;
                }break;
            //Opció 2
            case 2: //Demanem la categoria al usuari i mostrem el tipus d'IVA
                System.out.println("Introdueix la categoria");
                System.out.println("[1] Medicaments, [2] Farines, [3[ Medicaments"
                        + " veterinaris, [4] Aigües, [5] Cosmetics, [6] Begudes"
                        + " alcohòliques ");
                categoria = lector.nextInt();
                switch(categoria){ //switch anidat
                    case 1:
                    case 2:
                        System.out.println("S'aplica un IVA superreduït (4%)");
                        break;
                    case 3:
                    case 4:
                        System.out.println("S'aplica un IVA reduit (8%)");
                        break;
                    case 5:
                    case 6:
                        System.out.println("S'aplica un IVA general (21%)");
                        break;
                }break;
            //Opcio 3
            case 3: // Demanem al usuari el preu i el número d'unitats 
                    //i calculem el cost de l'enviament
                System.out.println("Introdueix el preu del producte");
                preuProducte = lector.nextFloat();
                System.out.println("Introdueix el número de unitats");
                numeroUnitats = lector.nextFloat();
                preuSenseIva = preuProducte * numeroUnitats;
                if (preuSenseIva <= 100){ //Condicional
                    System.out.println("El cost de l'enviament es de 3 euros");
                } else if ((preuSenseIva >= 101)&&(preuSenseIva <= 500)){
                    System.out.println("El cost de l'enviament es de 20 euros");
                } else {
                    System.out.println("El cost de l'enviament es de 50 euros");
                }
        }
    }
}
