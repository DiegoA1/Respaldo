
package tarea;

import java.util.Random;

public class sistemVotar {

    public static void main(String[] args) {
        int matriz[][] = new int[16][4];
        generarTabla(matriz);
        mostrarTabla(matriz);
    }
    public static int[][] generarTabla(int matriz[][]) {
        
        Random azar = new Random();
        for (int i = 0; i < 15;  i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = azar.nextInt(1000);
            }
        }
        return matriz;
    }
    
    public static void mostrarTabla(int matriz[][]) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }
        
    }
    
    public static int calcularTotal(int matriz[][]) {
        int total = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 4; j++) {
                total = matriz[i][j] + total;
                
            }
        }
        return total;
    }
}
