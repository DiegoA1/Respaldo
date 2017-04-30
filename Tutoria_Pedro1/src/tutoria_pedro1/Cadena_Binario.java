
package tutoria_pedro1;

import java.util.Scanner;

public class Cadena_Binario {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresar nombre");
        nombre = intro.nextLine();
        char letra[] = nombre.toCharArray();
        int num[] = new int[letra.length];
        for (int i = 0; i < letra.length; i++) {
            String cadena="";
            int c=1,b;
            num[i]=(int)letra[i];
            System.out.println(letra+" = "+num);
            while(c>0){
                c=num[i]/2;
                b=num[i]%2;
                cadena= b+cadena;
                num[i]=c;
            }
            System.out.println("La letra ingresada es: "+letra[i]+ "\nEl n° binario de la letra es: "+cadena+"\nEl n° en 8 bits de la letra es: "+0+cadena);
        }
        
    }
    
}
