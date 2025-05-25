package practica3;

import java.util.Scanner;

public class BusquedaBinaria {

	public static int busquedaBinaria(int[] v, int izq, int der, int valor) {
		if (der < izq) {
			return -1;
		}

		int central = (izq + der) / 2;

		if (valor < v[central]) {
			return busquedaBinaria(v, izq, central - 1, valor);
		} else if (valor > v[central]) {
			return busquedaBinaria(v, central + 1, der, valor);
		} else {
			return central;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continuar;

		int[] v = { 101, 202, 303, 404, 505, 606, 707, 808, 909 }; // lista ordenada

		do {
			System.out.print("¿Qué valor deseas buscar?: ");
			int valor = scanner.nextInt();

			int posicion = busquedaBinaria(v, 0, v.length - 1, valor);

			if (posicion == -1) {
				System.out.println("El valor " + valor + " no se encuentra en la lista (" + posicion + ").");
			} else {
				System.out.println("Valor encontrado en la posición: " + posicion);
			}

			System.out.print("¿Deseas continuar? (s/n): ");
			continuar = scanner.next().toLowerCase();

		} while (continuar.equals("s"));
	}
}
