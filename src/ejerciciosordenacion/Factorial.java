package ejerciciosordenacion;

/**
 * @author I1I4
 *
 */
public class Factorial {
	/**
	 * @param numero
	 * Calculo del factorial de un numero
	 */
	public static void Factorial(int numero) {
        long factorial=1;
        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
	
}
