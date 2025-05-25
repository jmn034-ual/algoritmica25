package practica3;

import java.util.Scanner;

public class Fibonacci {

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Ingrese un valor n para obtener el termino de Fibonacci (-1 para salir): ");
			int n = scanner.nextInt();

			if (n == -1)
				break;

			int resultado = fibonacci(n);
			System.out.println("El termino " + n + " de la sucesion de Fibonacci es: " + resultado);
		}
	}
}
