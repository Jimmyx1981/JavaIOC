import java.util.Scanner;
public class P3_MartinezR {
    //Declarem les constants.
    public static final int MINIM_ID = 10;
    public static final int MAXIM_ID = 999;
    public static final int MINIM_PLACES = 1;
    public static final int MAXIM_PLACES = 99;
    public static final String PARLA_RUS_UCRAINES_FALSE = "No";
    public static final String PARLA_RUS_UCRAINES_TRUE = "Si";
    public static final String HABITACIO_COMPARTIDA = "Habi.comp";
    public static final String HABITACIO = "Habitació";
    public static final String HABITATGE_SENCER = "Habi.sencer";
    public static final String SALA_COMUNITARIA = "Sala.comu,local.";
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
        String idiomes = "";
        String tipusHabitatge = "";
        int ordena = 0;
        int i = 0;
        int canvi = 0;
        int seguir = 0;
        int intents = 0;
        int resum = 0;
        int totalIdiomes = 0;
        int acumula = 0;
        boolean finalitza = false;
        boolean introduirMes = false;
        boolean idCorrecte = false;
        boolean parlaRus = false;
        boolean habitatge = false;
        boolean telefon = false;
        boolean persones = false;
        boolean places = false;
        //Declarem els arrays.
        int [][] dadesFamilies = new int[MAX_TUTORS][MAX_TUTORS];
        //Demanem les dades de les famílies als usuaris.
        System.out.println("Venvinguts al qüestionari per acollir famílies d'ucrania");
        //Iniciem el bucle que conte totes les interaccións amb l'usuari
        do {
            intents = 0;
            //Iniciem una series de bucles while demanant les dades de les famílies
            while (intents <= MAX_INTENTS && !introduirMes && !idCorrecte ) {
                System.out.println("Quina id de família teniu:");
                idCorrecte = scan.hasNextInt();//Si el id es un enter es correcte.
                if (idCorrecte) {    
                    dadesFamilies[0][i] = scan.nextInt();
                    if ((dadesFamilies[0][i] >= MINIM_ID) && (dadesFamilies[0][i] <= MAXIM_ID)) {
                        System.out.println("Id correcte");
                        idCorrecte = true;
                        places = true;
                    } else {
                        System.out.println("Id incorrecte");
                        intents++;
                        idCorrecte = false;
                        finalitza = false;
                        places = false;
                    }
                } else {
                    System.out.println("Valor incorrecte");//Si el id no es un enter no es correcte.
                    intents++;
                    finalitza = false;
                    idCorrecte = false;
                    places = false;
                }
            }
               
            intents = 0;
                
            while (intents <= MAX_INTENTS && places && !persones) {
                if (places) {
                    System.out.println("Quantes places disponeu?");
                    dadesFamilies[2][i] = scan.nextInt();
                    if ((dadesFamilies[2][i] >= MINIM_PLACES) && (dadesFamilies[2][i] <= MAXIM_PLACES)) {
                        persones = true;
                    } else {
                        System.out.println("El número de places es erroni");
                        finalitza = false;
                        persones = false;
                        intents++;
                        idCorrecte = false;
                    }
                }
            }
                
            intents = 0;
            
            while (intents <= MAX_INTENTS && persones && !parlaRus) {
                if(persones){
                    System.out.println("Parleu rus o ucrainès(0 no/ 1 si)");
                    dadesFamilies[1][i] = scan.nextInt();
                        if (dadesFamilies[1][i] == 0 || dadesFamilies[1][i] == 1) {
                        parlaRus = true;
                        switch (dadesFamilies[1][i]) {
                            case 0:
                                idiomes = "NO";
                                break;
                            case 1:
                                idiomes = "SI";
                                break;
                        }
                    } else {
                        System.out.println("Opció no valida.");
                        idCorrecte = false;
                        parlaRus = false;
                        intents++;
                    }
                }
            }
                
            intents = 0;
            
            while (intents <= MAX_INTENTS && parlaRus && !habitatge ) {
                    if (parlaRus){
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
                        } else{
                            System.out.println("Opció incorrecta");
                            idCorrecte = false;
                            habitatge = false;
                            intents++;
                        }
                    } 
                }
                
                intents = 0;
                
                while (intents <= MAX_INTENTS && habitatge && !telefon) {
                    if (habitatge) {
                        System.out.println("Quin es el vostre número de teléfon?");
                        dadesFamilies[4][i] = scan.nextInt();
                            if ((dadesFamilies[4][i] >= TELEFON_MIN) && (dadesFamilies[4][i] <= TELEFON_MAX)) {
                                telefon = true;
                                i++;
                            } else {
                                System.out.println("Teléfon incorrecte");
                                idCorrecte = false;
                                telefon = false;
                                intents++;
                            }
                    }
                }
            //Si es dona alguna d'aquestes condicions el programa pregunta si es volen introduïr mes famílies.   
            if (i <= MAX_TUTORS || !introduirMes || !parlaRus || !persones || !habitatge || !telefon ) {
                System.out.println("Es vol introduir mes famílies? (si:1 / no: 0)");
                seguir = scan.nextInt();
                if (seguir == 1) {
                    idCorrecte = false;
                    introduirMes = false;
                    persones = false;
                    parlaRus = false;
                    habitatge = false;
                    telefon = false;
                    finalitza = false;
                    } else {
                        introduirMes = true;
                        scan.nextLine();
                    }
            }
        } while (i <= MAX_TUTORS && !introduirMes && !finalitza);//Si es donen aquestes condicions el programa surt del bucle.
       
        //Mostrem per pantalla el número de famílies registrades.
        System.out.println("S'han introduït " + i + " registres de famílies.");
        //Amb aquest bucle for mostrem les dades dels arrays.
        System.out.println("Id     rus/ucrainès     places       tipus         telèfon");
        for (int j = 0; j < i; j++){
            
            System.out.println(dadesFamilies[0][j] + "       " + idiomes + "                " 
                    + dadesFamilies[2][j] + "          " + tipusHabitatge + "          " + dadesFamilies[4][j]);
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
                        if (dadesFamilies[2][k] > dadesFamilies[2][j]) {
                            for (int h = 0; h < dadesFamilies[k].length; h++) {
                                canvi = dadesFamilies[k][j];
                                dadesFamilies[k][h] = dadesFamilies[j][h];
                                dadesFamilies[k][h] = canvi;
                            }
                            /*canvi = dadesFamilies[2][k];
                            dadesFamilies[2][k] = dadesFamilies[2][j];
                            dadesFamilies[2][j] = canvi;
                            canvi = dadesFamilies[1][k];
                            dadesFamilies[1][k] = dadesFamilies[1][j];
                            dadesFamilies[1][j] = canvi;
                            canvi = dadesFamilies[0][k];
                            dadesFamilies[0][k] = dadesFamilies[0][j];
                            dadesFamilies[0][j] = canvi;
                            canvi = dadesFamilies[3][k];
                            dadesFamilies[3][j] = dadesFamilies[3][k];
                            dadesFamilies[3][k] = canvi;
                            canvi = dadesFamilies[4][k];
                            dadesFamilies[4][k] = dadesFamilies[4][j];
                            dadesFamilies[4][j] = canvi;*/
                        }
                    }

                }
                //Mostrem les dades per pantalla.
                System.out.println("Id        rus/ucrainès      places         tipus            telèfon");
                for (int j = 0; j < dadesFamilies.length; j++) {
                    if (dadesFamilies[2][j] >= mostrar){
                        
                        System.out.println(dadesFamilies[0][j] + "       " + idiomes + "                " 
                        + dadesFamilies[2][j] + "             " + tipusHabitatge + "            " + dadesFamilies[4][j]);
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
    

