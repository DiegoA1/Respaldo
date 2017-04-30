
package programacion;

import java.util.ArrayList;
import java.util.Scanner;

public class TL2 {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner intro = new Scanner(System.in);
        System.out.println("Bienvenido\n"
                + "1. Buscar libro\n"
                + "2. Añadir libro\n"
                + "3. Elminar libro");
        int opcion = intro.nextInt();
        
    }
    public static void opciones(int op) {
        Scanner intro = new Scanner(System.in);
        ArrayList<Libro> Libros = new ArrayList<Libro>();
        int operacion;
        String x;
        
        switch(op){
            case 1: 
                System.out.println("Ingrese nombre del libro a buscar");
                x = intro.next();
            case 2:
                System.out.println("Ingrese codigo del libro a añadir\n"
                        + "1. comenzar\n"
                        + "2. Finalizar"); 
                do{
                    operacion = intro.nextInt();
                    
                }while(operacion != 2);
            case 3:
                System.out.println("Ingrese codigo del libro a eliminar\n"
                        + "1. comenzar\n"
                        + "2. finalizar");
                do{
                    operacion = intro.nextInt();
                }while(operacion != 2);
        }       
    }
}
