
/*
 *Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su
suma no supere el valor 1000. Cuando esto último ocurra, se debe mostrar el total acumulado, el
contador de los números introducidos y la media.
 */
import java.util.Scanner;

public class Ejercicio12 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, contador = 0, resultado = 0;
		double media;

		while (resultado < 1000) {
			System.out.println("Introduce un número");
			numero = Integer.parseInt(teclado.nextLine());
			resultado = resultado + numero;
			contador++;
		}

		media = (double) resultado / contador;
		System.out.println("La media es " + media);
	}

}
