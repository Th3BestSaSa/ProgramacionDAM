package Relacion3;

/*
 * Programa que solicita 3 números cualesquiera y 
 * los muestra por pantalla ordenados de menor a mayor.
 * 
 */

import java.util.Scanner;

public class Ejercicio01Relacion3 {

	private static Scanner teclado = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		// Variables
		int numero1;
		int numero2;
		int numero3;
		
		// Inicio
		System.out.println("Introduce el primer número: ");
		numero1 = Integer.parseInt(teclado.nextLine());
				
		System.out.println("Introduce el segundo número: ");
		numero2 = Integer.parseInt(teclado.nextLine());
				
		System.out.println("Introduce el tercer número: ");
		numero3 = Integer.parseInt(teclado.nextLine());
				
		if (numero1 < numero2) {
			if (numero3 < numero1) {
				System.out.println("El orden es: " + numero3 + " " + numero1 + " " + numero2);
			} else {
				if (numero3 < numero2) {
					System.out.println("El orden es: " + numero1 + " " + numero3 + " " + numero2);
				} else {
					System.out.println("El orden es: " + numero1 + " " + numero2 + " " +numero3);
				}
			}
		} else { // aqui se cumple que numero1>=numero2
				if (numero3 < numero2) {
					System.out.println("El orden es: " + numero3 + " " + numero2 + " " + numero1);
				} else {
					if (numero3 < numero1) {
						System.out.println("El orden es: " + numero2 + " " + numero3 + " " + numero1);
					} else {
						System.out.println("El orden es: " + numero2 + " " + numero1 + " " + numero3);
					}
				}
			}
		}
}