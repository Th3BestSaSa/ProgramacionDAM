/*
 * Programa que solicita dos números, base y exponente, enteros positivos 
 * (incluido el 0).
 * Calcula la potencia (base elevado a exponente) a través de productos.
 * Si los datos son incorrectos deberán volverse a solicitar.
 * 
*/ 
package Relacion3;
import java.util.Scanner;

public class Ejercicio02Relacion3 {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		// Variables
		int base, exponente;
		int contador;
		int potencia;
		
		// Inicio
		
		// Introducir base y exponente (se repite si alguno de ellos es negativo)
		do{
			System.out.println("Introduce la base y el exponente (deben ser positivos): ");
			base = Integer.parseInt(teclado.nextLine());
			exponente = Integer.parseInt(teclado.nextLine());
		}while (base < 0 || exponente < 0);
		
		//Si base y exponente son 0
		if(base == 0 && exponente == 0){
			System.out.println("0⁰ es una indeterminación, no se sabe su resultado");
		}
		else{
			if(base == 0){ //este caso no es necesario, solo busca la eficiencia
				potencia = 0;
			}
			else{
				// Se calcula la potencia (base elevado a exponente)
				potencia = 1;
				for(contador = 1; contador <= exponente; contador++){
					potencia = potencia * base;
				}
			}
			
			// Resultado de la potencia
			System.out.println("El resultado de " + base + "^" + exponente + " es " + potencia);
		}
	}
}