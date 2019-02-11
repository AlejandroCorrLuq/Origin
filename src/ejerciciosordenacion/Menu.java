package ejerciciosordenacion;

import java.util.Scanner;

/**
 * Clase menu
 * 
 * Contiene el menu, con opciones para elegir entre Fibonacci y Factorial
 * @author I1I4
 * @version 0.1
 */
public class Menu {
	//Objetos para llamar a las otras clases
	static Fibonacci llamada = new Fibonacci();
	static Factorial metodo = new Factorial();

	/**
	 * @param args
	 * Eleccion entre (1) Factorial y (2) Fibonacci, en caso de error se termina el programa
	 */
	public static void main(String[] args) {
		int numeroElegido;
		System.out.println("Indique que operación quiere realizar: (1) Factorial, (2) Fibonacci");
		numeroElegido = inputNumber();
		if (numeroElegido == 1) {
			System.out.println("Introduzca un número");
			metodo.Factorial(inputNumber());
		} else if (numeroElegido == 2) {
			System.out.println("Introduzca un número mayor que 1");
			llamada.Fibonacci(inputNumber());
		} else {
			System.out.println("Número incorrecto");
		}
	}

	/**
	 * @return
	 * Metodo que te permite escribir numeros enteros
	 */
	public static int inputNumber() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

}
