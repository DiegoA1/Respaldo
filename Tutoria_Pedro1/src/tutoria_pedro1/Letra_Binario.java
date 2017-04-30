
package tutoria_pedro1;

import java.util.Scanner;

public class Letra_Binario {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String cadena="";
        char letra;
        int c=1,b;
        System.out.println("Ingresar letras");
        letra = intro.next().charAt(0);
        int num = (int)letra;
        System.out.println("--------------------------------------");
        System.out.println(letra+" = "+num);
        while(c>0){
            c=num/2;
            b=num%2;
            cadena= b+cadena;
            num=c;
        }
        while(cadena.length()<8)
            cadena = "0"+cadena;
        System.out.println("La letra ingresada es: "+letra+ "\nEl n° binario de la letra es: "+cadena+"\nEl n° en 8 bots de la letra es: "+0+cadena);
    }
    
}
