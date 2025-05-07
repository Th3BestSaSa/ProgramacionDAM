package Relacion2;
import java.util.Scanner;

public class Ejercicio03Relacion2 {

	// Constantes
	private static final int MIN_CANTIDAD_NUMEROS = 1;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Variables
		int cantidadNumeros;
		int numeroEntrada;
		int contador;

		// Inicio

		// Pedir la cantidad de números y evaluarla.
		do {
			System.out.println("Introduce la cantidad de números a introducir (Mínimo: " + MIN_CANTIDAD_NUMEROS + "):");
			cantidadNumeros = Integer.parseInt(teclado.nextLine());
		} while (cantidadNumeros < MIN_CANTIDAD_NUMEROS);


		// Opción con WHILE
		
		contador = 1;

		while (contador <= cantidadNumeros) {
			System.out.println("Introduce el número (" + contador + "/" + cantidadNumeros + ")");
			numeroEntrada = Integer.parseInt(teclado.nextLine());

			// Si el resto de dividir entre 2 es 0, el número es par.
			if (numeroEntrada % 2 == 0) {
				System.out.println("El número " + numeroEntrada + " es par.");
			} else {
				System.out.println("El número " + numeroEntrada + " es impar.");
			}

			// Incrementar el contador.
			contador++;
		}
		
	}
}
