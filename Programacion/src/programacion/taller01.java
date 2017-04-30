package programacion;

import java.util.Scanner;

public class taller01 {

    private static int x = 0, y = 0;
    private static int votos[][] = new int[x][y];

    public static void main(String[] args) {
        menu(x, y, votos);

    }

    public static void menu(int x, int y, int votos[][]) {
        Scanner intro = new Scanner(System.in);
        int m = 0;
        do {
            System.out.println(m);
            System.out.println("***Bienvenido***" + "\n"
                    + "Press '1' para ingresar contidad de locales y candidatos" + "\n"
                    + "Press '2' para mostrar votos por local" + "\n"
                    + "Press '3' para calcular cantidad total de votos por candidato" + "\n"
                    + "Press '4' para calcular el candidato real" + "\n"
                    + "Press '5' para calcular el candidato ganador" + "\n"
                    + "Press '6' para cerrar programa");
            m = intro.nextInt();
            if (m < 0 || m > 6) {
                System.out.println("***Opcion mal ingresada***");
            } else if (m == 1) {
                ingresoCant(x, y);

            } else if (m == 2) {
                mostrarMatriz(votos);

            } else if (m == 3) {
                System.out.println("Ingrese local deseado");
                int l = intro.nextInt();
                votosLocal(votos, l);
            } else if (m == 4) {
                System.out.println("Ingrese candidato deseado");
                int c = intro.nextInt();
                votosCandidato(votos, c);
            }

            m = 0;
        } while (m != 6);

    }

    public static void ingresoCant(int x, int y) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese cantidad de candidatos");
        x = intro.nextInt();
        System.out.println("Ingrese cantidad de locales");
        y = intro.nextInt();
    }

    public static void mostrarMatriz(int votos[][]) {
        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < votos.length; j++) {
                votos[0][j] = j + 1;
            }
        }
        for (int i = 0; i < votos.length; i++) {
            for (int j = 0; j < 0; j++) {
                votos[i][0] = i + 1;
            }
        }
        for (int i = 1; i < votos.length; i++) {
            for (int j = 1; j < votos.length; j++) {
                votos[i][j] = (int) (Math.random() * 600 + 1);
            }
        }
        for (int i = 0; i < votos.length; i++) {
            for (int j = 0; j < votos.length; j++) {
                System.out.println(votos[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int votosLocal(int votos[][], int l) {
        int cont1 = 0;
        for (int i = 1; i < votos.length; i++) {
            for (int j = l; j < votos.length; j++) {
                cont1 = cont1 + votos[i][j];
            }
        }
        return cont1;
    }

    public static int votosCandidato(int votos[][], int c) {
        int cont2 = 0;
        for (int i = c; i < votos.length; i++) {
            for (int j = 1; j < votos.length; j++) {
                cont2 = cont2 + votos[i][j];
            }
        }
        return cont2;
    }
}
