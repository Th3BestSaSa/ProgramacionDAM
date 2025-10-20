/*
 * Realizar un programa que solicite un número entero positivo o cero y calcule su factorial. Diseñar el
programa de forma que si algún dato es incorrecto vuelva a solicitarse.
 */
import java.util.Scanner;

public class Ejercicio10 {

	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// Variables
		int numero;
		double factorial=1,contador=1;
		do {
			System.out.println("Introduce un número");
			numero=Integer.parseInt(teclado.nextLine());
		}while(numero<0);
		if(numero==0) {
			System.out.println("El factorial de 0 es 0");
		}else {
			while(contador<=numero) {
				factorial=factorial*contador;
				contador++;
			}
			System.out.println("El factorial del número "+numero+ " es "+factorial);
		}
		

	}

}
