/*
 * Programa que solicita un conjunto de números.
 * Después de introducir cada número se realizará la pregunta 
 * ¿Desea introducir más números (S/N)?
 * Si la respuesta es 'S' se solicitará otro número.
 * Una vez que no desee introducir más números debe informar cual es el 
 * menor de los números introducidos.
 * NOTA: Debe comprobarse que la respuesta es 'S' o 'N' y si no lo es, 
 * volver a pedirla.
 * 
 */
package Relacion2;
import java.util.Scanner;

public class Ejercicio08Relacion2 {
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
	
		// Variables
		double numero, numeroMenor;
		char repetir; // Valores 'S' o 'N'
		
		
		numeroMenor=Double.MAX_VALUE; // El mayor mayor que se le puede dar a un double
		
		do {
			System.out.println("Introduce un numero ");
			numero= Integer.parseInt(teclado.nextLine());
			
			if (numero < numeroMenor) {
				numeroMenor=numero;
			}
			
			// Primero solicitamos si quiere introducir otro número
			do {
				System.out.print("¿Desea introducir más números? (S/N): ");
				repetir = teclado.nextLine().charAt(0);
			} while (!(repetir == 'S' || repetir == 'N'));
			
			
		} while (repetir == 'S');
		
		System.out.println("El menor valor introducido es " + numeroMenor);
	}
}