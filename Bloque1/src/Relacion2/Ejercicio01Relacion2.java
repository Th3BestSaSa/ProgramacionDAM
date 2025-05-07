package Relacion2;


import java.util.Scanner;

public class Ejercicio01Relacion2 {

	

	private static final int MAXIMO_NUMEROS = 10;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Variables
		
		int numero;
		int contador;
		
		// Opción con WHILE
		
		contador=1;
		
		while (contador <= MAXIMO_NUMEROS) {
			System.out.println("Introduce el número (" + contador + "/" + MAXIMO_NUMEROS + ")");
			numero = Integer.parseInt(teclado.nextLine());

			
			if (numero >= 0) {
				System.out.println("El número " + numero + " es positivo.");
			} else {
				System.out.println("El número " + numero + " es negativo.");
			}

			contador++;
		
		}
		
	}
}
