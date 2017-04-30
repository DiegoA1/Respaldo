
package tutoria_pedro1;

import java.util.Scanner;

public class Taller_tutoria_2_1 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int aux;
        int Num[]= new int[5];
        System.out.println("Ingresar 5 numeros");
        for (int i = 0; i < Num.length; i++) {
            Num[i]=intro.nextInt();
        }
        
        for (int i = 0; i < Num.length; i++) {
            System.out.print(Num[i]+"|\t");
        }
    }
}
