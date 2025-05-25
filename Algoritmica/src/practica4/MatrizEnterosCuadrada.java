package practica4;

import java.util.Random;
import java.util.Arrays;

public class MatrizEnterosCuadrada {
    private int[][] matriz;

    // Constructor 1: matriz aleatoria
    public MatrizEnterosCuadrada(int numeroFilasCol) {
        matriz = new int[numeroFilasCol][numeroFilasCol];
        Random random = new Random();
        for (int i = 0; i < numeroFilasCol; i++)
            for (int j = 0; j < numeroFilasCol; j++)
                matriz[i][j] = random.nextInt(100);  
    }

    // Constructor 2: copia de otra matriz
    public MatrizEnterosCuadrada(int[][] m) {
        int n = m.length;
        matriz = new int[n][n];
        for (int i = 0; i < n; i++)
            matriz[i] = Arrays.copyOf(m[i], n);
    }

    // Ordenación por selección
    public static void ordenaSeleccion(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    // Método que devuelve una NUEVA matriz con las filas ordenadas
    public MatrizEnterosCuadrada matrizOrdenadaPorFilas() {
        int n = matriz.length;
        int[][] nueva = new int[n][n];
        for (int i = 0; i < n; i++) {
            nueva[i] = Arrays.copyOf(matriz[i], n);
            ordenaSeleccion(nueva[i]);
        }
        return new MatrizEnterosCuadrada(nueva);
    }

    // Getter de la matriz
    public int[][] getMatriz() {
        return matriz;
    }

    // toString para imprimir
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] fila : matriz) {
            for (int val : fila) {
                sb.append(String.format("%3d ", val));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
