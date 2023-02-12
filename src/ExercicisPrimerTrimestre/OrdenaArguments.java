public class OrdenaArguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].compareTo(args[j]) > 0) {
                    String canvi = args[i];
                    args[i] = args[j];
                    args[j] = canvi;
                }
            }
        }
        //El mostrem per pantalla.
        System.out.println("Les cadenes ordenades són:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
