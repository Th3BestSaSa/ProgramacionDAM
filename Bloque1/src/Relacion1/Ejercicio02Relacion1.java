package Relacion1;

import java.util.Scanner;

public class Ejercicio02Relacion1 {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int lado1, lado2,lado3;
		
		System.out.println("Introduce el primer lado del triángulo:");
		lado1=Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce el segundo lado del triángulo:");
		lado2=Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce el tercer lado del triángulo:");
		lado3=Integer.parseInt(teclado.nextLine());
		
		if (lado1<=0 || lado2<=0 || lado3<=0) {
			System.out.println("Error, el lado debe ser un número positivo");
		}
		else {
			if (lado1==lado2 && lado2==lado3) {
				System.out.println("El triángulo es equilatero");
			}else {
				if (lado1==lado2 || lado1==lado3 || lado3==lado1) {
					System.out.println("El triángulo es isósceles");
				}else {
					System.out.println("El triángulo es escaleno");
				}
			}
		}
	}
}