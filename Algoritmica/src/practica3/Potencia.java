package practica3;

import java.util.Scanner;

public class Potencia {

    public static double potencia(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * potencia(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Introduce la base (x): ");
            double x = scanner.nextDouble();

            System.out.print("Introduce el exponente (n): ");
            int n = scanner.nextInt();

            double resultado = potencia(x, n);
            System.out.println(x + " elevado a " + n + " es: " + resultado);

            System.out.print("¿Deseas calcular otra potencia? (s/n): ");
            continuar = scanner.next().toLowerCase(); 

        } while (continuar.equals("s"));
    }
}
