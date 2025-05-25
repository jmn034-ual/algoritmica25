package practica4;

import java.util.Random;

public class Subsecuencia {
    private int[] array;
    private int primer, ultimo, suma;

    // Constructor 1: generar array aleatorio [-99, 99]
    public Subsecuencia(int numeroElementos) {
        array = new int[numeroElementos];
        Random aleaorio = new Random();
        for (int i = 0; i < numeroElementos; i++) {
            array[i] = aleaorio.nextInt(199) - 99;  // [-99, 99]
        }
    }

    // Constructor 2: usar array dado
    public Subsecuencia(int[] arrayEnteros) {
        array = arrayEnteros.clone();
    }

    public int getPrimer() { return primer; }
    public int getUltimo() { return ultimo; }
    public int getSuma() { return suma; }

    // 1. Fuerza bruta O(n^3)
    public void subsecuenciaFuerzaBruta() {
        int n = array.length;
        suma = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sumaTemp = 0;
                for (int k = i; k <= j; k++) {
                    sumaTemp += array[k];
                }
                if (sumaTemp > suma) {
                    suma = sumaTemp;
                    primer = i;
                    ultimo = j;
                }
            }
        }
    }

    // 2. Algoritmo mejorado O(n^2)
    public void subsecuenciaMejorado() {
        int n = array.length;
        suma = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sumaTemp = 0;
            for (int j = i; j < n; j++) {
                sumaTemp += array[j];
                if (sumaTemp > suma) {
                    suma = sumaTemp;
                    primer = i;
                    ultimo = j;
                }
            }
        }
    }

    // 3. Algoritmo lineal O(n) — Kadane
    public void subsecuenciaLineal() {
        int n = array.length;
        suma = Integer.MIN_VALUE;
        int sumaActual = 0;
        for (int i = 0, j = 0; j < n; j++) {
            sumaActual += array[j];
            if (sumaActual > suma) {
                suma = sumaActual;
                primer = i;
                ultimo = j;
            }
            else if (sumaActual < 0) {
                sumaActual = 0;
                i = j + 1;
            }
        }
    }
    
    public String toString() {
    	String salida = "";
    	for(int i = 0; i < array.length; i++) {
    		salida += " " + array[i];
    	}
    	return salida;
    }
}
