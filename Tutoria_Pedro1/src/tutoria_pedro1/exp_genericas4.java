
package tutoria_pedro1;

import java.util.Scanner;

public class exp_genericas4 {
    public static boolean validarReales(String numero) {
        return numero.matches("-{0,1}[0-9]+(\\.[0-9]+){0,1}");
    }
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        while(true){
            System.out.println("Ingresar numero");
            String numero = intro.next();
            if(validarReales(numero)){
                System.out.println("Es numero");
            }else{
                System.out.println("No es numero");
            }
            if(numero.equalsIgnoreCase("adios")){
                System.out.println("adios");
                break;
            }
        }
    }
}
