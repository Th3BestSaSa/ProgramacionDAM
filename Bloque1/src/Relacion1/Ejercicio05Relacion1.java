package Relacion1;

import java.util.Scanner;

public class Ejercicio05Relacion1 {
	
	private static final int CANTIDAD_DE_NUMEROS = 4;
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variables
		double numero1, numero2, numero3, numero4;
		double media;
		
		//Inicio
		System.out.println("Introduce el primer número: ");
		numero1 = Double.parseDouble(teclado.nextLine()); // leer numero1
		
		System.out.println("Introduce el segundo número: ");
		numero2 = Double.parseDouble(teclado.nextLine()); // leer numero2
		
		System.out.println("Introduce el tercer número: ");
		numero3 = Double.parseDouble(teclado.nextLine()); // leer numero3
		
		System.out.println("Introduce el cuarto número: ");
		numero4 = Double.parseDouble(teclado.nextLine()); // leer numero4
		
		media=(numero1 + numero2 + numero3 + numero4)/CANTIDAD_DE_NUMEROS;
		
		System.out.println("La media vale " + media);		
		
		System.out.println("Los números superiores a la media son: ");
		if (numero1 > media){
			System.out.print(numero1+ " ");
		}
		
		if (numero2 > media){
			System.out.print(numero2+ " ");
		}
		
		if (numero3 > media){
			System.out.print(numero3+ " ");
		}
		
		if (numero4 > media){
			System.out.print(numero4+ " ");
		}
	}
}