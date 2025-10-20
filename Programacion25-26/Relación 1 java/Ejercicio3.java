import java.util.Scanner;

public class Ejercicio3 {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		System.out.println("Introduce un numero");
		
		numero= Integer.parseInt(teclado.nextLine());
		
		if (numero%2==0) {
			System.out.println("El numero " +  numero + " multiplo de dos.");
		}
		if (numero%3==0) {
			System.out.println("El numero "+  numero +" multiplo de tres.");
		}
		
	}

}
