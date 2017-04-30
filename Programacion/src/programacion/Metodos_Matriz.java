package programacion;

import java.util.Scanner;

public class Metodos_Matriz {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner intro = new Scanner(System.in);
        int opcion, filas = 0, cols = 0;
        int mat[][] = crearMatriz(filas, cols);
        System.out.println("1. Crear matriz" + "\n" + "2. Llenar matriz");
        opcion = intro.nextInt();
        validarDimensiones(filas, cols);
        llenarMatriz(mat);

    }

    public static int[][] crearMatriz(int m, int n) {
        int matriz[][] = new int[m][n];
        return matriz;
    }

    public static boolean validarDimensiones(int m, int n) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingresar dimensiones de la matriz" + "\n"
                + "Ingrese el numero de filas y columnas");
        do {
            m = intro.nextInt();
            n = intro.nextInt();
            if (m > 0 && n > 0) {
                return true;
            }
        } while (m > 0 && n > 0);
        return false;
    }

    public static int llenarMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 9);
            }
        }
        return;
    }
    
    public static boolean validarFila100(int[][] mat) {
        
        for (int i = 0; i < mat.length; i++) {
            int cont = 0;
            for (int j = 0; j < mat[i].length; j++) {
                cont = cont + mat[i][j];
            }
            if(cont > 100){
                System.out.println("La fila no suma mas de 100");;
            }
        }
        return true;
    }
    
    
}
