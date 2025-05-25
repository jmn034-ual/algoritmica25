package practica3;

import java.util.Scanner;

public class PolinomioLegendre {

	public static double legendre(int n, double x) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return x;
		} else {
			return ((2.0 * n - 1) / n) * x * legendre(n - 1, x) - ((n - 1.0) / n) * legendre(n - 2, x);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continuar;

		do {
			System.out.print("Introduce el valor de x: ");
			double x = scanner.nextDouble();

			System.out.print("Introduce el orden n del polinomio de Legendre: ");
			int n = scanner.nextInt();

			double resultado = legendre(n, x);
			System.out.println("P_" + n + "(" + x + ") = " + resultado);

			System.out.print("¿Deseas continuar? (s/n): ");
			continuar = scanner.next().toLowerCase();

		} while (continuar.equals("s"));
	}
}
