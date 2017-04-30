
package tallerlab03;

import java.util.Scanner;

public class TestJuego {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner intro = new Scanner(System.in);
        System.out.println("Bienvenido\n"
                + "1.Comenzar juego\n"
                + "2.salir");
        int op = intro.nextInt();
        switch (op){
            case 1:
                
                break;
            case 2:
                System.out.println("Adios");
                break;
        }
    }
    
}
