
package tutoria_pedro1;

import java.util.Scanner;

public class exp_genericas1 {
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-z]{3-5]");
    }
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        while(true){
            System.out.println("Ingresar nombre");
            String nombre = intro.next();
            if (validarNombre(nombre)) {
                System.out.println("Se escribio bien el nombre");
            }else{
                System.out.println("Nombre incorrecto");
            }
            if(nombre.equalsIgnoreCase("salir")){
                System.out.println("Adios");
                break;
            }
        }
    }
    
}
