/*
 * Programa   que   solicita   una   cantidad   de   números   que   van   a
 * pedirse por teclado. 
 * Una vez que solicita todos ellos, informa cual es la media de los números.
 * Si   la   cantidad   es   incorrecta hay que volverla a solicitar.
 * 	
 */
package Relacion2;
import java.util.Scanner;

public class Ejercicio07Relacion2 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Variables
		int cantidadNumeros;
		int suma;
		int numero;
		int contador;
		double media;

		// Inicio
		do {
			System.out.println("Introduce la cantidad de números a realizar la media: ");
			cantidadNumeros = Integer.parseInt(teclado.nextLine());
		} while (cantidadNumeros <= 0);

		suma = 0;

		for(contador = 1; contador <= cantidadNumeros; contador++)			
		{
			System.out.println("Introduce el número " + contador + " de " + cantidadNumeros);
			numero = Integer.parseInt(teclado.nextLine());
			
			
			//Acumulamos en suma la suma de todos los numeros
			suma = suma + numero;
		}
		
		//Calculamos la media
		media = (double) suma / cantidadNumeros;

		System.out.println("La media entre los números introducidos es " + media);
	}
}