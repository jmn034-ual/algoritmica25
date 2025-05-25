package practica3;

import java.util.Scanner;

public class SumaRecursiva {

	public static int suma(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + suma(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Ingrese un numero n (0 para salir): ");
			int n = scanner.nextInt();
			if (n == 0) break;
			int resultado = suma(n);
			System.out.println("La suma de los primeros " + n + " numeros naturales es: " + resultado);
		}
	}
}
