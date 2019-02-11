package ejerciciosordenacion;

import java.util.Scanner;

/**
 * @author I1I4
 *
 */
public class Fibonacci {
	/**
	 * @param numero
	 * Calculo de la serie de Fibonacci si el número es mayor de 1
	 */
	public static void Fibonacci(int numero) {

		int fibo1 = 1, fibo2 = 1, i;
		do {
		} while (numero <= 1);
		System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");
		System.out.print(fibo1 + " ");
		for (i = 2; i <= numero; i++) {
			System.out.print(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println();
	}

}
