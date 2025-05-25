package practica3;

import java.util.Scanner;

public class Ackerman {

	public static int ackerman(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if (n == 0) {
			return ackerman(m - 1, 1);
		} else {
			return ackerman(m - 1, ackerman(m, n - 1));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continuar;
		do {
			System.out.print("Introduce el valor de m: ");
			int m = scanner.nextInt();

			System.out.print("Introduce el valor de n: ");
			int n = scanner.nextInt();

			int resultado = ackerman(m, n);
			System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado);

			System.out.print("¿Deseas continuar? (s/n): ");
			continuar = scanner.next().toLowerCase();

		} while (continuar.equals("s"));
	}
}
