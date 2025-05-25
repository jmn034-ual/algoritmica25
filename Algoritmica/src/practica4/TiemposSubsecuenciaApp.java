package practica4;

public class TiemposSubsecuenciaApp {

    public static void main(String[] args) {
        int[] tamanios = {64, 128, 256, 512, 1024, 2048, 4096, 8192};

        for (int n : tamanios) {
            long tiempoFB = 0, tiempoMejorado = 0, tiempoLineal = 0;

            for (int i = 0; i < 10; i++) {
                
            	// Fuerza bruta
                Subsecuencia sbsecuencia = new Subsecuencia(n);
                long ini = System.nanoTime();
                sbsecuencia.subsecuenciaFuerzaBruta();
                long fin = System.nanoTime();
                tiempoFB += (fin - ini);
               
                // Mejorado
                ini = System.nanoTime();
                sbsecuencia.subsecuenciaMejorado();
                fin = System.nanoTime();
                tiempoMejorado += (fin - ini);

                // Lineal
                ini = System.nanoTime();
                sbsecuencia.subsecuenciaLineal();
                fin = System.nanoTime();
                tiempoLineal += (fin - ini);

            }

            double mediaFB = tiempoFB / 10.0 / 1000000.0;       // ms
            double mediaMejorado = tiempoMejorado / 10.0 / 1000000.0;
            double mediaLineal = tiempoLineal / 10.0 / 1000000.0;

            System.out.printf("n = %5d | Fuerza bruta: %8.3f ms | Mejorado: %8.3f ms | Lineal: %8.3f ms%n",
                    n, mediaFB, mediaMejorado, mediaLineal);
        }
    }
}
