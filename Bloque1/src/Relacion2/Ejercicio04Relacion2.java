/*
 * Programa que lee un número estrictamente positivo N y muestra la suma
 * de los N primeros números.
 * Si N es incorrecto, vuelve a solicitarse.
 */
package Relacion2;
import java.util.Scanner;

public class Ejercicio04Relacion2 {
	
	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Variables
		int numeroIntroducido;
		int contador;
		int resultado;
		
		//Inicio
		do{
			System.out.println("Introduce un número positivo: ");
			numeroIntroducido=Integer.parseInt(teclado.nextLine());
		}while(numeroIntroducido <= 0);
		
		//Opción con while
		resultado = 0;
		contador = 1;
		
		while (contador <= numeroIntroducido){
			resultado = resultado + contador;
			contador++;
		}
		System.out.println("La suma de los " + numeroIntroducido + " primeros números es " + resultado);
	}
}