
package tutoria_pedro1;

import java.util.Scanner;

public class Taller_tutoria_2_5 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int a,i;
        int num[] = new int[10];
        System.out.println("ingresar numero");
        a = intro.nextInt();
        num[0]=a;
        for (i = 1; i < num.length; i++) {
            num[i]= a+5;
            if(num[i]>num[i])
                num[i]=num[i]-2;
        }
        
        System.out.println("El resultado de la serie es: "+num[i]);
    }
}
