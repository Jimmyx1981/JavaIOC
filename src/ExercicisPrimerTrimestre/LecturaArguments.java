//Programa que escriu per pantalla els arguments d'un programa.
public class LecturaArguments {
    //Els arguments estan a la avariable "args".
    public static void main(String[] args) {
        //Primer cal mirar si n'hi ha algun.
        if (args.length > 0) {
            //N'hi ha. Es mostren per pantalla ordenadament.
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            //No n'hi ha cap.
            System.out.println("No hi ha cap argument.");
        }
    }
}
