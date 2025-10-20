import java.util.Scanner;

public class Ejercicio2 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		/**
		 * Realizar un programa que solicite las longitudes de tres lados de un triángulo. Debe informar de si el
		 * triángulo es: 
		 * ● Equilátero: si los tres lados son iguales.
		 * ● Isósceles: si dos lados son iguales.
		 * ● Escaleno: si todos los lados son diferentes.
		 */

		double lado1,lado2,lado3;
		System.out.println("Introduce el lado 1 de un triangulo");
		lado1= Double.parseDouble(teclado.nextLine());
		System.out.println("Introduce el lado 2 de un triangulo");
		lado2= Double.parseDouble(teclado.nextLine());
		System.out.println("Introduce el lado 3 de un triangulo");
		lado3= Double.parseDouble(teclado.nextLine());
		
		
		if (lado1<0 || lado2<0 || lado3<0) {
			System.out.println("Error en alguno de los datos");
		}else {
			if (lado1 == lado2 && lado1 == lado3 && lado2==lado3) {
				System.out.println("Equilatero");
			}else {
				if (lado1 == lado2 &&  lado1 == lado3 &&  lado2==lado3) {
					System.out.println("Isosceles");
				}else {
					System.out.println("Escaleno");
				}
			}
		}
		
	}

}
