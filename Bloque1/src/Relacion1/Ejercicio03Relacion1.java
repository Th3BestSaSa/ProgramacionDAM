package Relacion1;

import java.util.Scanner;

public class Ejercicio03Relacion1 {
		
	// Constantes
	private static final int NUMERO_CLAVE_2 = 3;
	private static final int NUMERO_CLAVE_1 = 2;
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variables
		int numero;
		
		//Inicio
		System.out.println("Introduce un número: ");
		numero = Integer.parseInt(teclado.nextLine()); // leer numero
		
		if (numero % NUMERO_CLAVE_1 == 0){
			System.out.println("El número " + numero + " es múltiplo de " + NUMERO_CLAVE_1);
		}
	
		if (numero % NUMERO_CLAVE_2 == 0){
			System.out.println("El número " + numero + " es múltiplo de " + NUMERO_CLAVE_2);
		}
	}
}