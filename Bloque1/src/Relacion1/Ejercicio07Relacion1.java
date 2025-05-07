package Relacion1;

import java.util.Scanner;

public class Ejercicio07Relacion1 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		char letra;

		// Inicio
		System.out.println("Introduce una letra en mayúscula: ");
		letra = teclado.nextLine().charAt(0); // leer un carácter

		switch (letra) {
		case 'A': 
			System.out.println("Es la primera vocal (A)");
			break;
		case 'E':  
			System.out.println("Es la segunda vocal (E)");
			break;
		case 'I': 
			System.out.println("Es la tercera vocal (I)");
			break;
		case 'O': 
			System.out.println("Es la cuarta vocal (O)");
			break;
		case 'U': 
			System.out.println("Es la quinta vocal (U)");
			break;
		default:
			System.out.println("No es una vocal mayúscula");
		}
	}
}