package practica3;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Ingrese un numero para calcular su factorial (O para salir): ");
			int n = scanner.nextInt();

			if (n == 0) break;
			
			int resultado = factorial(n);
			System.out.println("El factorial de " + n + " es: " + resultado);
		}
	}
}
