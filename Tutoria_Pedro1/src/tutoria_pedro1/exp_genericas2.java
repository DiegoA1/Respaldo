
package tutoria_pedro1;

import java.util.Scanner;

public class exp_genericas2 {
    public static boolean validarLetra (String letra) {
        return letra.matches("[a-zA-Z]{1,1}");
    }
    
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        while(true){
            System.out.println("ingresar letra");
            String letra = intro.nextLine();
            if(validarLetra(letra)){
                System.out.println("Ingreso bien la letra");
            }else{
                System.out.println("Letra mal ingresado");
            }
            if(letra.equalsIgnoreCase("salir")){
                System.out.println("adios");
                break;
            }
        }
            
    }
}
