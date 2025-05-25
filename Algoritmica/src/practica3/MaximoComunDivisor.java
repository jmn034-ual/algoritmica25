package practica3;

import java.util.Scanner;

public class MaximoComunDivisor {

	public static int mcd(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return mcd(n, m % n);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continuar;

		do {
			System.out.print("Introduce el primer número (m): ");
			int m = scanner.nextInt();

			System.out.print("Introduce el segundo número (n): ");
			int n = scanner.nextInt();

			int resultado = mcd(m, n);
			System.out.println("El MCD de " + m + " y " + n + " es: " + resultado);
			System.out.print("¿Deseas continuar? (s/n): ");
			continuar = scanner.next().toLowerCase();

		} while (continuar.equals("s"));
	}
}
