/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author zen
 */

import java.util.Scanner;
public class P04_MorontaV {

    /**
     * @param args the command line arguments
     */
    //Definim les Constants.
    public static final int ID_MIN = 10;
    public static final int ID_MAX = 999;
    public static final int PLACES_MIN = 1;
    public static final int PLACES_MAX = 99;
    public static final int PARLA_0 = 0;
    public static final int PARLA_1 = 1;
    public static final String PARLA_NO = "No ";
    public static final String PARLA_SI = "Sí ";
    public static final int TIPUS_MIN = 0;
    public static final int TIPUS_MAX = 3;
    public static final String TIPUS_0 = "Habitació compartida\t\t\t";
    public static final String TIPUS_1 = "Habitació\t\t\t\t";
    public static final String TIPUS_2 = "Habitatge sencer\t\t\t";
    public static final String TIPUS_3 = "Sala comunitària / Local habilitat\t";
    public static final int TELF_MIN = 111111111;
    public static final int TELF_MAX = 999999999;
    public static final int LIMIT_INTENTS = 3;
    public static final int SI_AFEGIR = 1;
    public static final int NO_AFEGIR = 0;
    public static final int MAX_FAM = 10;
    public static final int MAX_DADES = 5;
                                    
    public static void main(String[] args) {
        //Declarem les Variables
        int [][]families = new int[MAX_FAM][MAX_DADES];        
        int i, j, numFamilies, familiaMes, id, places, parla, tipus, telf, consulta;
        numFamilies = 0;
        String []mostraParla = new String[MAX_FAM];
        String []mostraTipus = new String[MAX_FAM];
        boolean correcte, afegir;
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        do {
            afegir = false;
            System.out.println("Benvingut al programa d'assistencia de ajuda a families ucraïneses.");
            System.out.println("A continuació us demanarem les vostres dades per tal de poder gestionar l'ajuda.");
            for (i=0; i<LIMIT_INTENTS; i++){//Utilitzem el for per procedir a repetir la pregunta un nombre màxim de vegades.
                System.out.println("");
                System.out.println("Si us plau, indiqueu el vostre ID: ");
                correcte = scan.hasNextInt();//Comprovem que la dada introduida sigui un nombre enter.
                if (correcte){//En cas correcte..
                    id = scan.nextInt();//La variable agafa el valor introduït.
                    if ((id<ID_MIN) || (id>ID_MAX)){//Si la dada introduida es fora dels valors definits a les constants..
                        System.out.println("");
                        System.err.println("Nombre de ID erroni.");//Es donarà un missatge d'error.
                    }else{//En cas contrari, si la dada es correcta passarem a la pregunta següent:
                        families[i][0] = id;
                        
                        for (i=0; i<LIMIT_INTENTS; i++){//Utilitzem el for per procedir a repetir la pregunta un nombre màxim de vegades.
                            System.out.println("");
                            System.out.println("Quantes places disposseu per acollir? (1 - 99)");//A partir d'aquí seguirem el mateix sistema que hem utilitzat anteriorment.
                            correcte = scan.hasNextInt();//Comprovació
                            if (correcte){//Si es correcte...
                                places = scan.nextInt();//Valor afegit a la variable.
                                if (places<PLACES_MIN || places>PLACES_MAX){//Si el valor es fora dels definits a les constants...
                                    System.out.println("");
                                    System.err.println("Nombre de places erroni.");//Missatge d'error.
                                }else{//En cas contrari passem a la pregunta següent.
                                    families[i][1] = places;
                                    
                                    for (i=0; i<LIMIT_INTENTS; i++){//Utilitzem el for per procedir a repetir la pregunta un nombre màxim de vegades.
                                        System.out.println("");
                                        System.out.println("La família d'acollida parla rus o ucraïnés? (0 = No / 1 = Sí)");
                                        correcte = scan.hasNextInt();//Comprovació
                                        if (correcte){//Si es correcte...
                                            parla = scan.nextInt();//Valor a la variable.
                                            if (parla<PARLA_0 || parla>PARLA_1){//Fora de rang...
                                                System.out.println("");
                                                System.err.println("No ha escollit una opció vàlida.");//Missatge d'error.
                                            }else{//En cas contrari utilitzarem el sistema switch per definir el que pasarà segons el cas que esculli l'usuari.
                                                families[i][2] = parla;
                                                switch (families[i][2]){
                                                    case 0://Si l'elecció de l'usuari es 0...
                                                        mostraParla[i] = PARLA_NO;
                                                        break;
                                                    case 1://Si l'elecció de l'usuari es 1...
                                                        mostraParla[i] = PARLA_SI;
                                                        break;
                                                    default://Finalitzem el switch.
                                                }//Passem a la següent pregunta.
                                                
                                                for (i=0; i<LIMIT_INTENTS; i++){//Utilitzem el for per procedir a repetir la pregunta un nombre màxim de vegades.
                                                    System.out.println("");
                                                    System.out.println("Quin tipus d'allotjament ofereix la familia d'acollida? ");
                                                    System.out.println("0 - "+TIPUS_0+"");
                                                    System.out.println("1 - "+TIPUS_1+"");
                                                    System.out.println("2 - "+TIPUS_2+"");
                                                    System.out.println("3 - "+TIPUS_3+"");
                                                    correcte = scan.hasNextInt();//Comprovació
                                                    if (correcte){//Si es correcte
                                                        tipus = scan.nextInt();//Valor per a la variable.
                                                        if (tipus<TIPUS_MIN || tipus>TIPUS_MAX){//Si es fora del rang...
                                                            System.out.println("");
                                                            System.err.println("No ha escollit una opció vàlida.");
                                                        }else{//En cas contrari utilitzarem el sistema switch per definir el que pasarà segons el cas que esculli l'usuari.
                                                            families[i][3] = tipus;
                                                            switch (families[i][3]){
                                                                case 0://Si l'elecció de l'usuari es 0...
                                                                    mostraTipus[i] = TIPUS_0;
                                                                    break;
                                                                case 1://Si l'elecció de l'usuari es 1...
                                                                    mostraTipus[i] = TIPUS_1;
                                                                    break;
                                                                case 2://Si l'elecció de l'usuari es 2...
                                                                    mostraTipus[i] = TIPUS_2;
                                                                    break;
                                                                case 3://Si l'elecció de l'usuari es 3...
                                                                    mostraTipus[i] = TIPUS_3;
                                                                    break;
                                                                default://Finalitzem el switch.
                                                            }//Passem a la següent pregunta.
                                                            
                                                            for (i=0; i<LIMIT_INTENTS; i++){//Utilitzem el for per procedir a repetir la pregunta un nombre màxim de vegades.
                                                                System.out.println("");
                                                                System.out.println("Indiqueu a continuació el vostre telèfon de contacte: ");
                                                                correcte = scan.hasNextInt();//Comprovació.
                                                                if (correcte){//Si es correcte...
                                                                    telf = scan.nextInt();//Valor a la variable.
                                                                    if (telf<TELF_MIN || telf>TELF_MAX){//Si es fora dels valors indicats...
                                                                        System.out.println("");
                                                                        System.err.println("El telèfon indicat no és vàlid.");//Missatge d'error.
                                                                    }else{//En cas contrari, mostrarem els valors introduits per l'usuari que s'han guardat a les diferents variables.
                                                                        numFamilies++;
                                                                        families[i][4] = telf;
                                                                        
                                                                        for (i=0; i<LIMIT_INTENTS; i++){//Utilitzem el for per procedir a repetir la pregunta un nombre màxim de vegades.//Utilitzem el for per procedir a repetir la pregunta un nombre màxim de vegades.
                                                                            System.out.println("");
                                                                            System.out.println("Vol afegir una altra família? ");//Preguntarem si vol afegir un altre usuari.
                                                                            System.out.println("");
                                                                            System.out.println("Si. ("+SI_AFEGIR+")");
                                                                            System.out.println("No. ("+NO_AFEGIR+")");
                                                                            correcte = scan.hasNextInt();//El sistema es el mateix que hem fet servir fins ara
                                                                            if (correcte){
                                                                                System.out.println("");
                                                                                familiaMes=scan.nextInt();
                                                                                if (familiaMes==NO_AFEGIR){//En cas negatiu finalitzarem el programa
                                                                                    i=LIMIT_INTENTS;//Establim els intents màxims perque ja tenim la resposta vàlida
                                                                                    afegir=false;//Mantenim el boolean 'afegir' com a false, d'aquesta manera no es repetirà tot el programa
                                                                                    System.out.println("");
                                                                                    System.out.println("Gracies.");
                                                                                    System.out.println("");
                                                                                }else if (familiaMes==SI_AFEGIR){//En cas afirmatiu...
                                                                                    i=LIMIT_INTENTS;//Establim els intents màxims perque ja tenim la resposta vàlida
                                                                                    afegir=true;//Canviem el boolean 'afegir' a true per que es pugui repetir tot el procés del programa
                                                                                    System.out.println("");
                                                                                    System.out.println("Gracies.");
                                                                                    System.out.println("");
                                                                                }else{//En qualsevol altre restosta que no sigui vàlida.
                                                                                    System.out.println("");
                                                                                    System.err.println("No es una opció vàlida. ");
                                                                                    System.out.println("");
                                                                                }
                                                                                
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }                
            }
        }while (afegir);
        System.out.println("");
        System.out.println("S'han inscrit "+numFamilies+" famílies a la plataforma.");//Mostrem els famílies inscrits i finalitzem el programa
        System.out.println("");
        if (numFamilies>0){
            System.out.println("Vol consultar les families inscrites?\t(0) No / (1) Sí");
            System.out.println("");
            correcte = scan.hasNextInt();
            if (correcte){
                consulta = scan.nextInt();
                if (consulta<0 || consulta>1){
                    System.out.println("");
                    System.out.println("No es una opció vàlida");
                    System.out.println("");
                }else{
                    switch(consulta){
                        case 0:
                            System.out.println("");
                            System.out.println("Gracies.");
                            System.out.println("");
                            break;
                        case 1:
                            System.out.println("");
                            System.out.println("ID\t\t\tPlaces\t\t\tRus/Ucraïnes\t\tTipus\t\t\t\t\tTelèfon");
                            for (i=0; i<families.length; i++){
                                System.out.println(""+families[i][0]+"\t\t\t"+families[i][1]+"\t\t\t"+mostraParla[i]+"\t\t\t"+mostraTipus[i]+""+families[i][4]+"");
                            }
                    }
                }
            }
        }
        
    }
    
}
