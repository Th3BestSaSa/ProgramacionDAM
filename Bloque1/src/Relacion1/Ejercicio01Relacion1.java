package Relacion1;

import java.util.Scanner;

public class Ejercicio01Relacion1 {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variables
		int numero;
		
		//Inicio
		System.out.println("Introduce un número: ");
		numero = Integer.parseInt(teclado.nextLine()); // leer numero
		
		if (numero%2 == 0){
			System.out.println("El número es par");
		}
		else{
			System.out.println("El número es impar");
		}
	}
}
