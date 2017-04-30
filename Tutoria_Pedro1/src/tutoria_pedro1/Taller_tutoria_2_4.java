package tutoria_pedro1;

import java.util.Scanner;

public class Taller_tutoria_2_4 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int num[] = new int[10];
        int max = 0, min = 0;
        System.out.println("Ingresar 10 numeros");
        for (int i = 0; i < 10; i++) {
            num[i] = intro.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    max++;
                } else if (num[i] > num[j]) {
                    min++;
                }

            }
        }
        if (max == 10) {
            System.out.println("Estan en orden ascendente");
        }

        if (min == 10) {
            System.out.println("Estan en orden descendente");
        }

        System.out.println("Estan desordenados");
    }
}
