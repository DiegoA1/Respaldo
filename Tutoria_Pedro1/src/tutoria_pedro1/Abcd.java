package tutoria_pedro1;

import java.util.Random;
import java.util.Scanner;

public class Abcd {

    /**
     * public static void main(String[] args) { char letra='a'; char
     * abecedario[]=new char[26]; for (int i = 0; i < abecedario.length; i++) {
     * abecedario[i]= letra++; System.out.print(""+abecedario[i]+", "); }
     *
     * }
     *
     * public static void main(String[] args) { Scanner intro = new
     * Scanner(System.in); int aux = 0; System.out.println("Ingrese una
     * palabra"); String palabra = intro.next(); char x[] =
     * palabra.toCharArray(); for (int i = 0; i < palabra.length(); i++) { for
     * (int j = 0; j < palabra.length(); j++) {
     * if (x[i] > x[j]) { aux = x[i]; x[i] = x[j]; x[j] = (char) aux;
     *
     * }
     * }
     *
     * }
     * System.out.println(x);
     *
     * }
     */

    

        public static void main(String[] args) {
            Random generador = new Random();
            int numero = generador.nextInt(100) + 1;

            //System.out.println (numero);
            System.out.println("Adivina el numero");
            System.out.println("El numero se encuentra entre 1 y 100");

            System.out.println(" ");

            Scanner lector = new Scanner(System.in); //me tira error porque no está definido ayuuuda
            System.out.println("ingrese un numero");
            int num = lector.nextInt();
            
            
        }
    
    
}
