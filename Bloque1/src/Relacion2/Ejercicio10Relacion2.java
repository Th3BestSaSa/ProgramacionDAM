package Relacion2;
import java.util.Scanner;

public class Ejercicio10Relacion2 {
private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero, contador;
		long factorial; 
		
		do {
			System.out.println("Introduce un numero entero positivo:");
			numero=Integer.parseInt(teclado.nextLine());
		}while (numero <0);
		
		factorial=1;
		for ( contador=1; contador<=numero; contador++) {
			factorial=factorial* contador;
		}
		
		System.out.println("El factorial de " + numero + " es " + factorial);

	}

}
