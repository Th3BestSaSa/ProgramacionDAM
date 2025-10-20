/*
 * Programa que lee dos números enteros cuales quiera y 
 * calcula su producto mediante sumas.
 * 
 */
package Relacion2;
import java.util.*;

public class Ejercicio06Relacion2 {
	
	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Variables
		int numero1, numero2, resultado;
		int contador; // contará desde el 1 hasta el num2 en valor absoluto
		boolean cambiarSigno; // almacená true si hay que cambiar el signo
				//al resultado. Esto ocurre cuando el número 2 (el que controla el numero de vueltas del bucle)
				//es positivo
		
		System.out.println("Introduce dos números para hacer su producto: ");
		numero1= Integer.parseInt(teclado.nextLine());
		numero2= Integer.parseInt(teclado.nextLine());
		
		cambiarSigno=false;
		
		if (numero2 < 0){
			numero2 = -numero2;
			cambiarSigno= true;
		}
	
		resultado = 0;
		
		for (contador = 1; contador <= numero2; contador++){
			resultado = resultado + numero1;
		}
		
		// Si la variable cambiarSigno vale true es que hay que cambiar el signo al resultado
		if (cambiarSigno) {		
			resultado = - resultado ;
		}
		
		System.out.println("El producto vale: " + resultado);
	}
}