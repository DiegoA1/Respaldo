
package tutoria_pedro1;

import java.util.Scanner;

public class Taller_tutoria_2_3 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int aux;
        int Num[] = new int[10];
        System.out.println("ingresar 10 numero");
        for (int i = 0; i < Num.length; i++) {
            Num[i]=intro.nextInt();
        }
        for (int i = 0; i < Num.length; i++) {
            System.out.print(Num[i]+"\t");
        }
        System.out.println(" ");
        for (int j = 0; j < Num.length; j++) {
            for (int i = 0; i < Num.length; i++) {
                aux=Num[j];
                Num[j]=Num[i];
                Num[i]=aux;
            }
            System.out.print(Num[j]+"\t");
        }
    }
}
