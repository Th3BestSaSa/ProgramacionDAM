/*
 * Realizar un programa que solicite dos números, base y exponente, enteros positivos (incluido el 0), y
que calcule la potencia (base elevado a exponente) a través de productos. Si los datos son incorrectos
deberán volverse a solicitar.
 */

import java.util.Scanner;

public class Ejercicio2R3 {

	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		//Variables
		int base, exponente;
		int contador,resultado;
		//Inicio programa
			do{
				System.out.println("Introduce una base");
			base=Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce unexponente");
			exponente=Integer.parseInt(teclado.nextLine());
			}while(base<0||exponente<0);
		contador=0;
		resultado=1;
		if(exponente==0) {
			System.out.println("El resultado es 1");
		}else {
			do {
				resultado=resultado*base;
				contador=contador+1;
			}while(contador<exponente);
			System.out.println("El resultado es " + resultado);
		}
		
	}

}
