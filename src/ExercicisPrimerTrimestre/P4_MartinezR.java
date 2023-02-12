import java.util.Scanner;
public class P4_MartinezR {
    //Declarem les constants.
    public static final int MINIM_ID = 10;
    public static final int MAXIM_ID = 999;
    public static final int MINIM_PLACES = 1;
    public static final int MAXIM_PLACES = 99;
    public static final String PARLA_RUS_UCRAINES_FALSE = "No";
    public static final String PARLA_RUS_UCRAINES_TRUE = "Si";
    public static final String HABITACIO_COMPARTIDA = "Habitació.comp";
    public static final String HABITACIO = "Habitació";
    public static final String HABITATGE_SENCER = "Habitatge sencer";
    public static final String SALA_COMUNITARIA = "Sala.comu,\n                                 local.";
    public static final int TIPUS_0 = 0;
    public static final int TIPUS_1 = 1;
    public static final int TIPUS_2 = 2;
    public static final int TELEFON_MIN = 111111111;
    public static final int TELEFON_MAX = 999999999;
    public static final int MAX_INTENTS = 3;
    public static final int MAX_TUTORS = 10;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Declarem les variables de tipus int, boolean i String.
        String parlaRusUcraines = "";
        String tipusHabitatge = "";
        int ordena = 0;
        int i = 0;
        int canvi = 0;
        int seguir = 0;
        int intents = 0;
        int resum = 0;
        int totalIdiomes = 0;
        int acumula = 0;
        boolean mesFamilies = false;
        boolean finalitza = false;
        boolean introduirMes = false;
        boolean idCorrecte = false;
        boolean parlaRus = false;
        boolean habitatge = false;
        boolean telefon = false;
        boolean persones = false;
        boolean dadesCorrecte = false;
        //Declarem els arrays.
        int [][] dadesFamilies = new int[MAX_TUTORS][MAX_TUTORS];
        /*int []id = new int[MAX_TUTORS];
        int []parla = new int[MAX_TUTORS];
        int []places = new int[MAX_TUTORS];
        int []tipus = new int[MAX_TUTORS];
        int []tel = new int[MAX_TUTORS];*/
        //Comemçem el bucle que conte totes les interaccións amb l'usuari
        do {
            //Amb aquest bucle demanem l'id.
            do {
                
                introduirMes = false;
                System.out.println("Quina id de família teniu:");
                idCorrecte = scan.hasNextInt();
                if (idCorrecte) {
                    
                    dadesFamilies[0][i] = scan.nextInt();
                    if ((dadesFamilies[0][i] >= MINIM_ID) && (dadesFamilies[0][i] <= MAXIM_ID)) {
                        System.out.println("Id correcte");
                        dadesCorrecte = true;
                         
                    } else {
                        System.out.println("Id incorrecte");
                        scan.nextLine();
                        dadesCorrecte = false;
                        intents++;
                        mesFamilies = false;
                        
                    }
                    
                } else {
                    System.out.println("Valor incorrecte");
                    scan.nextLine();
                    dadesCorrecte = false;
                    intents++;
                    mesFamilies = false;
                       
                }
                
            //En cas que l'id sigui correcte o quant es superi el número de intents surt del bucle.
            } while (intents < MAX_INTENTS && !dadesCorrecte);
            System.out.println("hola");
            
            //Amb aquest bucle demanem al usuari si sap parlar rus/ucraïnes.
            do {
                intents = 0;
                if(dadesCorrecte){
                    System.out.println("Parleu rus o ucrainès(0 no/ 1 si)");
                    dadesFamilies[1][i] = scan.nextInt();
                    //Si es compleix la condició...
                    if (dadesFamilies[1][i] == 0 || dadesFamilies[1][i] == 1) {
                        parlaRus = true;
                        switch (dadesFamilies[1][i]) {
                    case 0:
                        dadesFamilies[1][i] = 0;
                        break;
                    case 1:
                        dadesFamilies[1][i] = 1;
                        break;
                    }
                    //Si no es compleix la condició...    
                    } else {
                        System.out.println("Opció no valida.");
                        parlaRus = false;
                        intents++;
                    }
                    if (intents < MAX_INTENTS) {
                        mesFamilies = true;
                    }
                }
            //En cas de que la condició sigui verdadera o se superi el màxim d'intents
            //es surt del bucle.
            } while (intents <= MAX_INTENTS);
            System.out.println("hola");
            
            //Amb aquest bucle demanem al usuari de quantes places disposa.
            do {
                intents = 0;
                if (parlaRus) {
                    System.out.println("Quantes places disponeu?");
                    dadesFamilies[2][i] = scan.nextInt();
                    if ((dadesFamilies[2][i] >= MINIM_PLACES) && (dadesFamilies[2][i] <= MAXIM_PLACES)) {
                        persones = true;
                        
                    } else {
                        System.out.println("El número de places es erroni");
                        persones = false;
                        intents++;
                    }
                }
            //Si es el número de places es correcte o els intents superen el màxim d'intents
            //surt del bucle.
            } while ((intents < MAX_INTENTS)&&(!persones));
            
            //Aquest bucle serveix per saber el tipus d'allotjament.
            do{
                intents = 0;
                if (persones){
                    System.out.println("Quin tipus d'allotjament teniu?:\n0-Habitació compartida,"
                        + "\n1-Habitació,\n2-Habitatge sencer,\n3-Sala comunitària, Local habilitat.");
                        dadesFamilies[3][i] = scan.nextInt();
                        habitatge = true;
                    if (dadesFamilies[3][i] >=0 && dadesFamilies[3][i] <=3) {
                        switch (dadesFamilies[3][i]) {
                            case 0: tipusHabitatge = HABITACIO_COMPARTIDA;
                                break;
                            case 1: tipusHabitatge = HABITACIO;
                                break;
                            case 2: tipusHabitatge = HABITATGE_SENCER;
                                break;
                            case 3: tipusHabitatge = SALA_COMUNITARIA;
                                break;
                            default: 
                                break;
                        }
                    //Si no es compleix la condició...    
                    } else{
                        System.out.println("Opció incorrecta");
                        habitatge = false;
                        intents++;
                    }
                } 
            } while ((intents < MAX_INTENTS)&&(!habitatge));
            
            //Aquests bucle serveix per saber el número de teléfon.
            do{
                intents = 0;
                if (habitatge) {
                    System.out.println("Quin es el vostre número de teléfon?");
                    dadesFamilies[4][i] = scan.nextInt();
                        if ((dadesFamilies[4][i] >= TELEFON_MIN) && (dadesFamilies[4][i] <= TELEFON_MAX)) {
                            telefon = true;
                            
                        } else {
                            System.out.println("Teléfon incorrecte");
                            telefon = false;
                            intents++;
                        }
                }
            } while ((intents < MAX_INTENTS) && (!telefon));
            //En finalitzar totes les preguntes aumentem 'i' en 1.
            i++;
            //Demanem al usuari si vol introduir mes famílies.
            //En cas afirmatiu torna al principi del bucle principal.
            if (i <= MAX_TUTORS || !mesFamilies || intents <= MAX_INTENTS) {
                System.out.println("Es vol introduir mes famílies? (si:1 / no: 0)");
                idCorrecte = scan.hasNextInt();
                if (idCorrecte) {
                    seguir = scan.nextInt();
                    if (seguir == 1) {
                        introduirMes = false;
                        idCorrecte = false;
                    } else {
                        introduirMes = true;
                    }
                }
            } else {
                System.out.println("Ja no es pot afegir més famílies");
            }
            
        } while ((i <= MAX_TUTORS && !introduirMes && intents <= MAX_INTENTS));
        //Mostrem per pantalla el número de famílies registrades.
        System.out.println("S'han tintroduït " + i + " registres de famílies.");
        //Amb aquest bucle for mostrem les dades dels arrays.
        System.out.println("Id     rus/ucrainès     places       tipus         telèfon");
        for (int j = 0; j < i; j++){
            
            System.out.println(dadesFamilies[0][j] + "       " + dadesFamilies[1][j] + "                " 
                    + dadesFamilies[2][j] + "          " + dadesFamilies[3][j] + "          " + dadesFamilies[4][j]);
        }
        //Demanem al usuari si vol consultar el número de places i quantes places vol.       
        System.out.println("Vols consultar per número de places(si:1 / no:0)?");
        idCorrecte = scan.hasNextInt();
        if (idCorrecte) {
            ordena = scan.nextInt();
            if (ordena == 1){
                System.out.println("Quantes places necessiteu?");
                int mostrar = scan.nextInt();
                //Amb aquest bucle for ordenem les dades utilitzam l'algoritme bombolla.
                for (int k  = 0; k < i -1; k++) {
                    for (int j = k + 1; j < i; j++) {
                        if (dadesFamilies[0][k] > dadesFamilies[0][j]) {
                            canvi = dadesFamilies[0][k];
                            dadesFamilies[2][k] = dadesFamilies[2][j];
                            dadesFamilies[2][j] = canvi;
                            canvi = dadesFamilies[1][k];
                            dadesFamilies[1][k] = dadesFamilies[1][j];
                            dadesFamilies[1][j] = canvi;
                            canvi = dadesFamilies[2][k];
                            dadesFamilies[0][k] = dadesFamilies[0][j];
                            dadesFamilies[0][j] = canvi;
                            canvi = dadesFamilies[3][k];
                            dadesFamilies[3][j] = dadesFamilies[3][k];
                            dadesFamilies[3][k] = canvi;
                            canvi = dadesFamilies[4][k];
                            dadesFamilies[4][k] = dadesFamilies[4][j];
                            dadesFamilies[4][j] = canvi;
                        }
                    }

                }
                //Mostrem les dades per pantalla.
                System.out.println("Id     rus/ucrainès     places       tipus         telèfon");
                for (int j = dadesFamilies.length -1; j >= 0; j--) {
                    if (dadesFamilies[2][j] >= mostrar){
                        
                        System.out.println(dadesFamilies[0][j] + "       " + dadesFamilies[1][j] + "                " 
                        + dadesFamilies[2][j] + "             " + dadesFamilies[3][j] + "            " + dadesFamilies[4][j]);
                    }
                }
            } 
        } else {
            System.out.println("Programa finalitzat");
        }
        //Preguntem al usuari si vol veure un resum de les dades.
        System.out.println("Vols veure un resum estadístic de les dades(si:1 / no:0)?");
        idCorrecte = scan.hasNextInt();
        if (idCorrecte) {
            resum = scan.nextInt();
                //En cas afirmatiu mostrem el número de famílies i el número de places totals.
                if (resum == 1) {
                    System.out.println("Número de famílies de acollida: " + i);
                    
                    for (int j = 0; j < dadesFamilies.length; j++){
                        acumula = acumula + dadesFamilies[2][j];
                    }
                    System.out.println("Número de places totals: " + acumula);
                    
                    for (int j = 0; j < dadesFamilies.length; j++) {
                        if (dadesFamilies[1][j] == 1) {
                            totalIdiomes++;
                        }
                    }
                    //Mostrem quantes famílies parlen rus/ucraïnes.
                    System.out.println("Número de famílies que parlen rus/ucraïnes: " + totalIdiomes);
                    
                } else {
                    System.out.println("Programa finalitzat");
                }
        } else {
            System.out.println("Programa finalitzat");
        } 
        
    } 
}
    

