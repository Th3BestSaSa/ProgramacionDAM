/*
 * Programa que solicita un número entero y determina el número
 * de cifras que tiene dicho número.
 *
 */
package Relacion3;
import java.util.Scanner;

public class Ejercicio03Relacion3 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Variables
		int numero, numeroGuardado;
		int numeroDeCifras = 0;
		

		System.out.println("Introduce un número : ");
		numero = Integer.parseInt(teclado.nextLine());

		numeroGuardado = numero; // Guardo el número en otra variable, para no perderlo y poder mostrarlo
								 //en el mensaje final
		
		if (numero == 0) // El cero hay que tratarlo como caso particular
			numeroDeCifras = 1;
		else {
			
			// Vamos dividiendo entre 10 el numero, hasta llegar a cero.  El número de vueltas de este bucle me dará 
			// el numero de cifras del numero
			while (numero != 0) {
				numeroDeCifras=numeroDeCifras +1;
				numero = numero / 10;
			}
		}
		
		System.out.println("El número " + numeroGuardado + " tiene " + numeroDeCifras + " cifras.");
	}
}