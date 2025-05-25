package practica3;

import java.util.Scanner;

public class CambioDeBase {

	public static char digitoHex(int resto) {
		switch (resto) {
		case 10:
			return 'A';
		case 11:
			return 'B';
		case 12:
			return 'C';
		case 13:
			return 'D';
		case 14:
			return 'E';
		case 15:
			return 'F';
		default:
			return (char) ('0' + resto);
		}
	}

	public static String aHexadecimal(int n) {
		if (n < 16) {
			return String.valueOf(digitoHex(n));
		} else {
			int cociente = n / 16;
			int resto = n % 16;
			return aHexadecimal(cociente) + digitoHex(resto);
		}
	}

	public static String aBaseB(int n, int B) {
		if (n < B) {
			return String.valueOf((char) ('0' + n));
		} else {
			int cociente = n / B;
			int resto = n % B;
			return aBaseB(cociente, B) + (char) ('0' + resto);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continuar;
		do {
			System.out.print("Introduce un número decimal: ");
			int numero = scanner.nextInt();

			String hex = aHexadecimal(numero);
			System.out.println(numero + " en hexadecimal es: " + hex);

			System.out.print("Introduce la base B (2 a 9): ");
			int base = scanner.nextInt();

			if (base < 2 || base > 9) {
				System.out.println("Base inválida. Debe estar entre 2 y 9.");
			} else {
				String baseB = aBaseB(numero, base);
				System.out.println(numero + " en base " + base + " es: " + baseB);
			}

			System.out.print("¿Deseas continuar? (s/n): ");
			continuar = scanner.next().toLowerCase();

		} while (continuar.equals("s"));
	}
}
