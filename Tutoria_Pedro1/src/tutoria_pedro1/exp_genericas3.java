
package tutoria_pedro1;

import java.util.Scanner;

public class exp_genericas3 {
    public static boolean validarEnteros(String numero) {
        return numero.matches("-{0,1}[0-9]+");
    }
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        while(true){
            System.out.println("Ingresar numero");
            String numero = intro.next();
            if(validarEnteros(numero)){
                System.out.println("El numero es positivo");
            }else{
                System.out.println("El numero es negativo");
            }
            if(numero.equalsIgnoreCase("adios")){
                System.out.println("adios");
                break;
            }
        }
    }
}
