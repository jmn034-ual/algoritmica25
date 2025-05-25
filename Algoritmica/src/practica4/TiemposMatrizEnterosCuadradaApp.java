package practica4;

public class TiemposMatrizEnterosCuadradaApp {

    public static void main(String[] args) {
        int[] tamanios = {64, 128, 256, 512, 1024, 2048, 4096, 8192};

        for (int n : tamanios) {
            MatrizEnterosCuadrada matrizOriginal = new MatrizEnterosCuadrada(n);

            long[] tiempos = new long[10];

            for (int i = 0; i < 10; i++) {
                MatrizEnterosCuadrada copia = new MatrizEnterosCuadrada(matrizOriginal.getMatriz());

                long inicio = System.nanoTime();
                MatrizEnterosCuadrada ordenada = copia.matrizOrdenadaPorFilas();
                long fin = System.nanoTime();

                tiempos[i] = fin - inicio;
            }

            // Eliminar el valor máximo
            long max = tiempos[0];
            long total = 0;
            for (long t : tiempos) {
                if (t > max) max = t;
                total += t;
            }
            long sumaSinMax = total - max;
            double media = sumaSinMax / 9.0;

            System.out.printf("n = %5d -> Tiempo medio: %.2f ms%n", n, media / 1000000.0);
        }
    }
}
