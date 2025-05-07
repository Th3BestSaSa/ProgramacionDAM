/*
 * Programa que solicita números hasta que se introduzca un número negativo.
 * Cuando termine informa de cuantos números positivos se han introducido.
 * Ejemplo:
 * 	Introduce un número (negativo para terminar): 4
 * 	Introduce un número (negativo para terminar): 8
 * 	Introduce un número (negativo para terminar): -2
 * 	Has introducido 2 números positivos
 */
package Relacion2;
import java.util.Scanner;

public class Ejercicio05Relacion2 {
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		// Variables
		int numero, cantidadPositivos;
	
		// Instrucciones
		cantidadPositivos = 0;
		
		do {
			
			System.out.print("Escribe un número (negativo para terminar): ");
			numero = Integer.parseInt(teclado.nextLine());
			
			cantidadPositivos++;
				
		} while (numero >=0);
		
		// Como está contando el último valor que ya es negativo restamos uno
		// a la variable cantidadPositivos
		cantidadPositivos = cantidadPositivos -1;
		
		System.out.println("Has introducido " + cantidadPositivos + " números positivos.");
	}
}