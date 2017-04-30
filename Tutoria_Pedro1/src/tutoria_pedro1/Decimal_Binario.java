
package tutoria_pedro1;

import java.util.Scanner;

public class Decimal_Binario {
    public static void main(String[] args) {
        String n, cadena="";
        int c=1, b;
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingresar numero");
        n = intro.next();
        int a = Integer.parseInt(n);
        while(c>0){
            c=a/2;
            b=a%2;
            cadena=b+cadena;
            a=c;
        }
        System.out.println("el numero ingresado es: "+n+" y el binario es: "+cadena);
    }
}
