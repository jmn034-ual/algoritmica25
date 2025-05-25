package practica3;

import java.util.Scanner;

public class TorresDeHanoi {

	public static void hanoi(int n, char origen, char destino, char auxiliar) {
		if (n == 1) {
			System.out.println("Mover disco 1 de " + origen + " a " + destino);
		} else {
			hanoi(n - 1, origen, auxiliar, destino);
			System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
			hanoi(n - 1, auxiliar, destino, origen);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continuar;
		
		do {
			System.out.print("Introduce el número de discos: ");
			int n = scanner.nextInt();

			System.out.println("\nMovimientos necesarios:");
			hanoi(n, 'A', 'C', 'B'); // De varilla A a C, usando B como auxiliar
			System.out.print("¿Deseas continuar? (s/n): ");
			continuar = scanner.next().toLowerCase();

		} while (continuar.equals("s"));
	}
}
